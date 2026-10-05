class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                // return 1-based indices if problem expects that
                return new int[]{map.get(complement) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        
        return new int[]{}; // no solution
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // Output: [1, 3]
    }
}
