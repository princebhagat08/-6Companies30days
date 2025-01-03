class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int mid = n/2;
        int move = 0;
        for(int i = 0; i<mid; i++){
            move += nums[mid] - nums[i];
        }

        for(int i = mid+1; i<n; i++){
            move += nums[i]-nums[mid];
        }


        return move;
        
    }
}