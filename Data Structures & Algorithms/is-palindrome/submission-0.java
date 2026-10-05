class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");;
        char[] str=s.toCharArray();
        int left=0;
        int right=str.length-1;
        while(left<right){
            if(str[left]!=str[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
