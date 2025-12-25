import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        //BF approach
        /*for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] + nums[j]==target){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{}; */

        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int d= target-nums[i];
            if(map.containsKey(d)){
                return new int[]{map.get(d),i};
            }else{
                map.put(nums[i],i);
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum obj=new TwoSum();
        int[] arr=obj.twoSum(new int[]{2,7,11,15},9);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }


}