class maxSubArraySumCircular{
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int totalSum=nums[0];

        int currMaxSum=nums[0];
        int maxSum=nums[0];

        int currMinSum=nums[0];
        int minSum=nums[0];

        for(int i=1;i<n;i++){
            totalSum += nums[i];

            currMaxSum=Math.max(nums[i],currMaxSum+nums[i]);
            maxSum=Math.max(currMaxSum,maxSum);

            currMinSum=Math.min(nums[i],currMinSum+nums[i]);
            minSum=Math.min(currMinSum,minSum);

        }

        if(maxSum<0){
            return maxSum;
        }

        return Math.max(maxSum, totalSum-minSum);
    }

    public static void main(String[] args) {
        maxSubArraySumCircular maxSubArraySumCircular = new maxSubArraySumCircular();
        int ans=maxSubArraySumCircular.maxSubarraySumCircular(new int[]{1,-2,3,-2});
        System.out.println(ans);
    }
}