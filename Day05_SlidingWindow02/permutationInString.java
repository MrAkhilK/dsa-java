import java.util.Arrays;

class permutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] s1count=new int[26];
        int[] window=new int[26];

        for(char C: s1.toCharArray()){
            s1count[C-'a']++;
        }
        int k=s1.length();

        for(int i=0;i<s2.length();i++){
            window[s2.charAt(i)-'a']++;

            if(i>=k){
                window[s2.charAt(i-k)-'a']--;
            }

            if(i>=k-1 && Arrays.equals(s1count,window)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean ans = checkInclusion(s1, s2);
        System.out.println("permutation In String: " + ans);
    }
}