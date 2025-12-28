class minSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                min=Math.min(min,i-left+1);
                sum-=nums[left++];
            }
        }

        return min==Integer.MAX_VALUE?0:min;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,3,1,2,4,3};
        minSizeSubarraySum obj=new minSizeSubarraySum();
        int ans=obj.minSubArrayLen(2,nums);
        System.out.println(ans);
    }
}