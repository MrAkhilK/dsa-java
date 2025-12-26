class subArraySums {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<n;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }

    public int minSubArray(int[] nums) {
        int n=nums.length;
        int currSum=nums[0];
        int minSum=nums[0];
        for(int i=1;i<n;i++){
            currSum=Math.min(nums[i],currSum+nums[i]);
            minSum=Math.min(minSum,currSum);
        }
        return minSum;
    }

    public int[] maxSubArrayIndices(int[] nums) {
        int n=nums.length;
        int currSum=nums[0];
        int maxSum=nums[0];
        int start=0;
        int ansStart=0;
        int ansEnd=0;

        for(int i=1;i<n;i++){
            if(nums[i]>currSum+nums[i]){
                currSum=nums[i];
                start=i;
            }else{
                currSum=currSum+nums[i];
            }

            if(currSum>maxSum){
                maxSum=currSum;
                ansStart=start;
                ansEnd=i;
            }
        }
        int[] res=new int[ansEnd-ansStart+1];
        for(int i=0;i<res.length;i++){
            res[i]=nums[ansStart+i];
        }
        return res;
    }

    public int[] minSubArrayIndices(int[] nums) {
        int n=nums.length;
        int currSum=nums[0];
        int minSum=nums[0];
        int start=0;
        int ansStart=0;
        int ansEnd=0;

        for (int i = 1; i < n; i++) {
            if (currSum + nums[i] > nums[i]) {
                currSum = nums[i];
                start = i;
            } else {
                currSum = currSum+nums[i];
            }

            if (currSum < minSum) {
                minSum = currSum;
                ansStart = start;
                ansEnd = i;
            }
        }

        int[] res = new int[ansEnd - ansStart + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = nums[ansStart + i];
        }
        return res;
    }

    public static void main(String[] args) {
        subArraySums obj=new subArraySums();
        int maxans = obj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println("maximum subarray sum : " + maxans);

        int minans = obj.minSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println("minimum subarray Sum : " + minans);

        int[] res=obj.maxSubArrayIndices(new  int[]{-2,1,-3,4,-1,2,1,-5,4});
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        int[] res1=obj.minSubArrayIndices(new  int[]{-2,1,-3,4,-1,2,1,-5,4});
        for(int i=0;i<res1.length;i++){
            System.out.print(res1[i]+" ");
        }
    }
}