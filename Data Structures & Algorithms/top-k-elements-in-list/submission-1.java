class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        List<Integer>resultlist=new ArrayList<>(freq.keySet());
        resultlist.sort((a,b)->freq.get(b)-freq.get(a));
        int []res=new int[k];
        for (int i = 0; i <k; i++) {
            res[i] = resultlist.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,4};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(arr, k)));
    }
}
