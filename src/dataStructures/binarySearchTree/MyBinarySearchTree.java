package dataStructures.binarySearchTree;

import dataStructures.array.MyArray;
import dataStructures.queue.linkedListQueue.MyLLQueue;

import javax.swing.*;

public class MyBinarySearchTree<T extends Comparable<T>> {
    private BSTNode<T> root;

    public BSTNode<T> getRoot() {
        return root;
    }

    // O(log(n))
    public void insert(T input) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null");
        }

        BSTNode<T> newNode = new BSTNode<>(input);
        if (root == null) {
            root = newNode;
            return;
        }
        BSTNode<T> currNode = root;
        while (true) {
            if (input.compareTo(currNode.getValue()) < 0) {
                if (currNode.getLeft() == null) {
                    currNode.setLeft(newNode);
                    break;
                }
                currNode = currNode.getLeft();
            } else {
                if (currNode.getRight() == null) {
                    currNode.setRight(newNode);
                    break;
                }
                currNode = currNode.getRight();
            }
        }
    }

    // O(log(n))
    public Boolean lookUp(T value) {
        if (value == null) {
            throw new IllegalArgumentException("value cannot be null");
        }

        BSTNode<T> currNode = root;

        while (currNode != null) {
            if (value.compareTo(currNode.getValue()) > 0) {
                currNode = currNode.getRight();
            } else if (value.compareTo(currNode.getValue()) < 0) {
                currNode = currNode.getLeft();
            } else {
                return true;
            }
        }
        return false;
    }

    public MyArray<T> breadthFirstSearch() {
        BSTNode<T> currNode = this.root;
        MyArray<T> list = new MyArray<>();
        MyLLQueue<BSTNode<T>> currLevelQueue = new MyLLQueue<>();
        currLevelQueue.enqueue(currNode);
        while (currLevelQueue.getLength() > 0) {
            currNode = currLevelQueue.dequeue();
            list.push(currNode.getValue());
            if (currNode.getLeft() != null) {
                currLevelQueue.enqueue(currNode.getLeft());
            }
            if (currNode.getRight() != null) {
                currLevelQueue.enqueue(currNode.getRight());
            }
        }
        return list;
    }

    public MyArray<T> breadthFirstSearchRecursive(MyLLQueue<BSTNode<T>> currLevelQueue, MyArray<T> list) {
        if (currLevelQueue.getLength() == 0) {
            return list;
        }
        BSTNode<T> currNode = currLevelQueue.dequeue();
        list.push(currNode.getValue());

        if (currNode.getLeft() != null) {
            currLevelQueue.enqueue(currNode.getLeft());
        }

        if (currNode.getRight() != null) {
            currLevelQueue.enqueue(currNode.getRight());
        }
        return this.breadthFirstSearchRecursive(currLevelQueue, list);
    }

//  DFS uses Stack DS (LIFO)
    public MyArray<T> depthFirstSearchInOrder(BSTNode<T> currNode, MyArray<T> list) {
        if (currNode.getLeft() != null) {
            this.depthFirstSearchInOrder(currNode.getLeft(), list);
        }
        list.push(currNode.getValue());
        if (currNode.getRight() != null) {
            this.depthFirstSearchInOrder(currNode.getRight(), list);
        }
        return list;
    }

    public MyArray<T> depthFirstSearchPreOrder(BSTNode<T> currNode, MyArray<T> list) {
        list.push(currNode.getValue());
        System.out.println(currNode.getValue());
        if (currNode.getLeft() != null) {
            this.depthFirstSearchPreOrder(currNode.getLeft(), list);
        }
        if (currNode.getRight() != null) {
            this.depthFirstSearchPreOrder(currNode.getRight(), list);
        }
        return list;
    }

    public MyArray<T> depthFirstSearchPostOrder(BSTNode<T> currNode, MyArray<T> list) {
        if (currNode.getLeft() != null) {
            this.depthFirstSearchPostOrder(currNode.getLeft(), list);
        }
        if (currNode.getRight() != null) {
            this.depthFirstSearchPostOrder(currNode.getRight(), list);
        }
        list.push(currNode.getValue());
        return list;
    }

    // O(log(n))
    public void remove(T value) {
        if (value == null) {
            throw new IllegalArgumentException("value cannot be null");
        }

        if (!this.lookUp(value)) {
            throw new IllegalArgumentException("value is not found in the tree");
        }

        BSTNode<T> currNode = root;
        BSTNode<T> parentNode = null;

        while (currNode != null) {
            if (value.compareTo(currNode.getValue()) > 0) {
                parentNode = currNode;
                currNode = currNode.getRight();
            } else if (value.compareTo(currNode.getValue()) < 0) {
                parentNode = currNode;
                currNode = currNode.getLeft();
            } else {
                if (currNode.getRight() == null) {
                    if (parentNode == null) {
                        this.root = currNode.getLeft();
                    } else {
                        if (parentNode.getValue().compareTo(currNode.getValue()) > 0) {
                            parentNode.setLeft(currNode.getLeft());
                        } else {
                            parentNode.setRight(currNode.getLeft());
                        }
                    }
                } else if (currNode.getRight().getLeft() == null) {
                    if (parentNode == null) {
                        this.root = currNode.getLeft();
                    } else {
                        currNode.getRight().setLeft(currNode.getLeft());

                        if (currNode.getValue().compareTo(parentNode.getValue()) < 0) {
                            parentNode.setLeft(currNode.getRight());
                        } else {
                            parentNode.setRight(currNode.getRight());
                        }
                    }
                } else {
                    BSTNode<T> leftMost = currNode.getRight().getLeft();
                    BSTNode<T> leftMostParent = currNode.getRight();

                    while (leftMost.getLeft() != null) {
                        leftMostParent = leftMost;
                        leftMost = leftMost.getLeft();
                    }

                    leftMostParent.setLeft(leftMost.getRight());
                    leftMost.setLeft(currNode.getLeft());
                    leftMost.setRight(currNode.getRight());

                    if (parentNode == null) {
                        this.root = leftMost;
                    } else {
                        if (currNode.getValue().compareTo(parentNode.getValue()) < 0) {
                            parentNode.setLeft(leftMost);
                        } else {
                            parentNode.setRight(leftMost);
                        }
                    }
                }
            }
        }
    }

    public static void testBST() {
        //     9
        //  4     20
        //1  6  15  170
        MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<>();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);

//        tree.breadthFirstSearch().printList();

//        MyLLQueue<BSTNode<Integer>> currLevelQueue = new MyLLQueue<>();
//        currLevelQueue.enqueue(tree.getRoot());
//        System.out.println(currLevelQueue.getLength());
//        tree.breadthFirstSearchRecursive(currLevelQueue, new MyArray<Integer>()).printList();
//        tree.depthFirstSearchInOrder(tree.getRoot(), new MyArray<Integer>()).printList();
//        tree.depthFirstSearchPreOrder(tree.getRoot(), new MyArray<Integer>()).printList();
        tree.depthFirstSearchPostOrder(tree.getRoot(), new MyArray<Integer>()).printList();
    }
}
