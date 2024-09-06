package leetcode;

import java.util.Arrays;

public class _134_GasStation implements TestSolution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, currentTank = 0, startIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentTank += gas[i] - cost[i];

            if (currentTank < 0) {
                startIndex = i + 1;
                currentTank = 0;
            }

        }
        if (totalGas < totalCost) {
            return -1;
        }
        return startIndex;
    }

//    public int canCompleteCircuit(int[] gas, int[] cost) {
//        int tank = 0;
//        boolean flag = false;
//        for (int i = 0; i < gas.length; i++) {
//            tank = gas[i];
//            for (int j = 0; j < gas.length; j++) {
//                int index = (i + j) % gas.length;
//                int nextIndex = (index + 1) % gas.length;
//                if (tank - cost[index] >= 0) {
//                    tank = tank + gas[nextIndex] - cost[index];
//                } else {
//                    break;
//                }
//                if (j == gas.length - 1) {
//                    flag = true;
//                }
//            }
//            if (flag) {
//                return i;
//            }
//        }
//        return -1;
//    }

    @Override
    public void test() {
        int[] gas = {1, 2, 3, 4, 5}, cost = {3, 4, 5, 1, 2};
//        int[] gas1 = {2,3,4}, cost1 = {3,4,3};
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
