public class frontPiece {
    public int[] frontPiece1(int[] nums) {

        if (nums.length <= 2) {
            return nums;
        }
        return new int[] { nums[0], nums[1] };
    }

    public static void main(String[] args) {
        int [] arr={1, 2, 3};
        frontPiece obj = new frontPiece();
        System.out.println(obj.frontPiece1(arr));
    }

}
