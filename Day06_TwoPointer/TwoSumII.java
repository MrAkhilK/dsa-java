import java.util.Arrays;

class TwoSumII{
    private static int[] twoSum(int[] numbers, int target) {
        /*int[] ans=new int[2];
        for(int left=0;left<numbers.length;left++){
            for(int right=1;right<numbers.length;right++){
                if(numbers[left]+numbers[right]==target&&left<right){
                    ans[0]=left+1;
                    ans[1]=right+1;
                }
            }
        }
        return ans;*/

        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }

        return new int[0];
    }
    public static void main(String[] args) {
        int[] a={2,7,11,15};
        int target=9;
        int ans[]= twoSum(a,target);
        System.out.println(Arrays.toString(ans));
    }
}