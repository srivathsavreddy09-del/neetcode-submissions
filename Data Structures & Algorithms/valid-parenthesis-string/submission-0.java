class Solution {
    public boolean checkValidString(String s) {
        char []chr=s.toCharArray();
        int l=0,h=0;
        for(char ch:chr){
            if(ch=='('){
                l++;
                h++;
            }else if(ch==')'){
                if(l>0)l--;
                h--;
            }else{
                // if(ch=='*'){
                    if(l>0)l--;
                    h++;
                // }
            }
            if(h<0)return false;
        }
        return l==0;
    }
}
