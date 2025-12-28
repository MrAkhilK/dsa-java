class maxAvgSubarray {

    private double findMaxAverage(int[] nums, int k) {
        if(nums.length<k){
            return 0;
        }
        double sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxSum = sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum/k;
    }

    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        maxAvgSubarray obj=new maxAvgSubarray();
        double ans=obj.findMaxAverage(nums,4);
        System.out.println(ans);
    }
}