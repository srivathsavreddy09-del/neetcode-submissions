class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int sum=0;
        Map<Integer,Integer>map=new HashMap<>(); 
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};

            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        System.out.println(Arrays.toString(twoSum(arr,tar)));
    }
}
