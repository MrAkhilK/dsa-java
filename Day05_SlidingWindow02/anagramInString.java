import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class anagramInString {
    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int[] pCount=new int[26];
        int[] count=new int[26];

        for(char C:p.toCharArray()){
            pCount[C-'a']++;
        }
        int k=p.length();
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;

            if(i>=k){
                count[s.charAt(i-k)-'a']--;
            }

            if(i>=k-1 && Arrays.equals(pCount,count)){
                list.add(i-k+1);
            }
        }

        return list;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> ans = findAnagrams(s, p);

        System.out.println("Anagram starting indices: " + ans);
    }
}