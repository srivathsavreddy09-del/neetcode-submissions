class Solution {
    public boolean isAnagram(String s, String t) {
        char[]ch=s.toCharArray();
        char[]sa=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(sa);
       return Arrays.equals(ch,sa);
    }
}
