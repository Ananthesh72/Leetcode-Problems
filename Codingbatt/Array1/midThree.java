import java.util.Arrays;

public class midThree {

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};

        midThree obj = new midThree();
        ;
 System.out.println(Arrays.toString(obj.midThree1(nums)));
    }

    public int [] midThree1(int [] nums){
        // if(nums.length <= 3){
        //     return nums;
        // }
        // int st = nums.length -3;
        // int [] arr = new int[3];

        // for(int i =0;i< arr.length;i++){
        //     arr[i] = nums[st + i];
        // }
        int mid = nums.length /2;
        // System.out.println(Arrays.toString(arr));
        return new int []{nums[mid -1],nums[mid],nums[mid+1]};
     }
}