class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] fnums=new int[nums.length+nums.length];
        int j=0;
        for(int i=0;i<2;i++){
            for(int num:nums){
                fnums[j++]=num;
            }
        }
        return fnums;
    }
}