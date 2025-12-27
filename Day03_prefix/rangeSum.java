class rangeSum{
    int[] pf;
    public rangeSum(int[] nums) {
        pf = new int[nums.length+1];
        /*pf[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pf[i] = pf[i - 1] + nums[i];
        }*/

        for(int i=0;i<nums.length;i++){
            pf[i+1]=pf[i]+nums[i];
        }
    }

    private int sumRange(int left, int right) {
        /*return left == 0 ? pf[right+1] : pf[right+1] - pf[left];*/
        return pf[right+1]-pf[left];
    }

    public static void main(String[] args) {
        int[] nums={-2, 0, 3, -5, 2, -1};
        rangeSum obj = new rangeSum(nums);
        int ans=obj.sumRange(0,2);
        System.out.println(ans);
    }


}