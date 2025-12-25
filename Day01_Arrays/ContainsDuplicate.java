import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        /*HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        } */

        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate obj=new ContainsDuplicate();
        boolean res=obj.containsDuplicate(new int[]{2,7,11,15});
        System.out.print(res);
    }
}