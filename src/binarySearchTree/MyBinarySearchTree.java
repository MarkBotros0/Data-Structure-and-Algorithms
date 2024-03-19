package binarySearchTree;

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
        MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<>();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);

        System.out.println(tree.getRoot().getValue());
        System.out.println(tree.getRoot().getLeft().getValue());
        System.out.println(tree.getRoot().getLeft().getLeft().getValue());
        System.out.println(tree.getRoot().getLeft().getRight().getValue());
        System.out.println(tree.getRoot().getRight().getValue());
        System.out.println(tree.getRoot().getRight().getRight().getValue());
        System.out.println(tree.getRoot().getRight().getLeft().getValue());

        System.out.println(tree.lookUp(6));
        System.out.println(tree.lookUp(1));
        System.out.println(tree.lookUp(9));
        System.out.println(tree.lookUp(170));
        System.out.println(tree.lookUp(15));
        System.out.println(tree.lookUp(3));
//     9
//  4     20
//1  6  15  170
    }
}
