class Solution {
    public int climbStairs(int n) {
        // HashMap<Integer,Integer>map=new HashMap<>();
        // map.put(0,0);
        // map.put(1,1);
        // map.put(2,2);
        // // map.put("1","1");
        // // map.put("2","2");
        // if(map.containsKey(n)){
        //     return map.get(n);
        // }
        // int result=climbStairs(n-1)+climbStairs(n-2);
        // map.put(n,result);
        // return result;
        if(n<=2)return n;
        int []dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
