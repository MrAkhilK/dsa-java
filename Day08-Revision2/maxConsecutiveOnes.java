class maxConsecutiveOnes {
    private static int  maxConsecutiveOnes(int[] nums, int k) {
        int left=0; int count=0;int maxLen=0;

        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            while(count>k){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,0,0,0,1,1,1,1,0};
        int ans=maxConsecutiveOnes(nums, 2);
        System.out.println(ans);
    }
}