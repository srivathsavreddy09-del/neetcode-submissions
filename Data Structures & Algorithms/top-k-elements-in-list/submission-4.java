class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Integer>res=new ArrayList<>(map.keySet());
        res.sort((a,b)->map.get(b)-map.get(a));
        int[]nar=new int[k];
        for(int i=0;i<k;i++){
            nar[i]=res.get(i);
        }
        return nar;
    }
}
