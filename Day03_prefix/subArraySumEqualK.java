import java.util.HashMap;

class subArraySumEqualK {
    private int subArraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;

        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        subArraySumEqualK obj=new subArraySumEqualK();
        int ans=obj.subArraySum(nums,5);
        System.out.println(ans);
    }
}