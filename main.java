class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int a = nums[i];
            for(int j=0;j<n;j++){
                int b = nums[j];
                if((a+b) == target && i!=j){
                    return new int[]{i,j};
                }
            }
        }
    return new int[]{-1,-1};
    }
}
// Time Complexity: O(n^2)
// Space Complexity: O(1)