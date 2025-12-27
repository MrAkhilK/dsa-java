import java.util.HashMap;

class subArrayDivisibleK {
    private int subArrayDiv(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
       int count = 0;
       for (int i = 0; i < nums.length; i++) {
           sum += nums[i];
           int rem= (sum % k+k)%k;
           if (map.containsKey(rem)) {
               count+=map.get(rem);
           }
           map.put(rem,map.getOrDefault(rem,0)+1);
       }

       return count;
    }

    public static void main(String args[]) {
        int[] nums={4,5,0,-2,-3,1};
        subArrayDivisibleK obj=new subArrayDivisibleK();
        int ans=obj.subArrayDiv(nums,5);
        System.out.println(ans);
    }


}