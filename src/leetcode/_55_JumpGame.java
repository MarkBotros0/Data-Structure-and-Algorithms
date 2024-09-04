package leetcode;

public class _55_JumpGame {
    public boolean canJump(int[] nums) {
            int reach = 0;
            for (int i = 0; i < nums.length; i++) {
                if (reach < i) {
                    return false;
                }
                reach = Math.max(reach, i + nums[i]);
            }
            return true;
        }

    public void test() {
        _55_JumpGame game = new _55_JumpGame();
        System.out.println(game.canJump(new int[]{1, 0, 1, 0}));
//        System.out.println(game.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
