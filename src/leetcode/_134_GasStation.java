package leetcode;

public class _134_GasStation implements TestSolution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int tank = gas[i];
            for (int j = 1; j <= gas.length; j++) {
                int val = (i+j)%gas.length;
                int val1 = (i+j-1)%gas.length;
                tank = tank + gas[val] - cost[val1];
                if (tank < 0) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    @Override
    public void test() {
        int[] gas = {1, 2, 3, 4, 5}, cost = {3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
