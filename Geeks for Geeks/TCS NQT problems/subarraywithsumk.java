// package Geeks for Geeks;

import java.util.HashMap;

public class subarraywithsumk {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(countSubarrays(arr, k)); // Output: 2
    }
    public static int countSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max=0;
        int prefixSum = 0;
        

    for (int  i =0;i< arr.length ;i++){
        prefixSum += arr[i];

        if(map.containsKey(prefixSum - k)){
            max = Math.max(max, i- map.get(prefixSum - k));
        }

        if(!map.containsKey(prefixSum)){
            map.getOrDefault(prefixSum,i);
        }
        
    }
        return max;
    }
}
