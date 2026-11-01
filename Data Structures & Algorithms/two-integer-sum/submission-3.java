class Solution {
// time: O(N^2) | space: O(1)
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i < nums.length - 1; i++) {
//             int iNum = nums[i];
//             for(int j = i + 1; j < nums.length; j++) {
//                 int jNum = nums[j];
//                 if(iNum + jNum == target) {
//                     return new int[] {i, j};
//                 }
//             }
//         }
//         return new int[0];
//     }

// public int[] twoSum(int[] nums, int target) {
//     int[][] arr = new int[nums.length][2];
//     for(int i = 0; i < arr.length; i++) {
//         arr[i][0] = nums[i];
//         arr[i][1] = i;
//     }
//     Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
    
//     int i = 0, j = arr.length - 1;
//     while(i < j) {
//         int curr = arr[i][0] + arr[j][0];
//         if (curr == target) {
//             return new int[]{
//                     Math.min(arr[i][1], arr[j][1]),
//                     Math.max(arr[i][1], arr[j][1])};
//         } else if(curr > target) {
//             j--;
//         } else {
//             i++;
//         }
//     }
//     return new int[0];
// }

    public int[] twoSum(int[] nums, int target) {
        var values = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            values.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(values.containsKey(diff) && values.get(diff) != i) {
                return new int[]{i, values.get(diff)};
            }
        }
        return new int[0];
    }
}
