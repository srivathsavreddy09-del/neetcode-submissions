class Solution {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr,tArr);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(isAnagram(s,t));
    }
}
