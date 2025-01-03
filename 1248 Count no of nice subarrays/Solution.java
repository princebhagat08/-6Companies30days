class Solution {

    public int subArrays(int[] nums, int k){
        if(k<0) return 0;

        int l = 0;
        int r = 0;
        int kCount = 0;
        int NoOfSubArrays = 0;
        int n = nums.length;
        
        while(r<n){
            kCount += nums[r]%2;
            while(kCount>k){
                kCount -= nums[l]%2;
                l++;
            }
            NoOfSubArrays += (r-l+1);
            r++;
        }

        return NoOfSubArrays;


    }


    public int numberOfSubarrays(int[] nums, int k) {

        return subArrays(nums, k) - subArrays(nums, k-1);
      
        
    }
}