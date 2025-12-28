import java.util.HashSet;

class lngSubstrwthoutreptChar{
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int len=0;

        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(i));
            len=Math.max(len,i-left+1);
        }

        return len;
    }
    public static void main(String[] args) {
        String str="abcdefg";
        lngSubstrwthoutreptChar obj=new lngSubstrwthoutreptChar();
        int ans=obj.lengthOfLongestSubstring(str);
        System.out.println(ans);
    }
}