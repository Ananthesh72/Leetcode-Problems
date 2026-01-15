import javax.swing.text.StyledEditorKit.BoldAction;

public class arrayFront9 {

    public boolean arrayFront(int[] nums) {
  
   if(nums == null){
        return false;
    }else if(nums.length == 1 && nums[0] == 9){
        return true;
    }else{
        int i=0;
      while(i<nums.length){
        if(i<= 3 && nums[i] == 9){
          return true;
        }
        i++;
      }
    }
    return false;
}

    public static void main(String[] args) {
        arrayFront9 obj = new arrayFront9();
        Boolean result ;
        int [] nums={3, 9, 2, 3, 3};
        result = obj.arrayFront(nums);
        System.out.println(result);
    }
}

/* 
arrayFront9([1, 2, 9, 3, 4]) → true	false	X	
arrayFront9([1, 2, 3, 4, 9]) → false	false	OK	
arrayFront9([1, 2, 3, 4, 5]) → false	false	OK	
arrayFront9([9, 2, 3]) → true	true	OK	
arrayFront9([1, 9, 9]) → true	false	X	
arrayFront9([1, 2, 3]) → false	false	OK	
arrayFront9([1, 9]) → true	false	X	
arrayFront9([5, 5]) → false	false	OK	
arrayFront9([2]) → false	false	OK	
arrayFront9([9]) → true	true	OK	
arrayFront9([]) → false	false	OK	
arrayFront9([3, 9, 2, 3, 3]) → true*/