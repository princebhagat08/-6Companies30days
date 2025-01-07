class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        ArrayList<Integer> ans = new ArrayList();
       int n = arr.length;
      PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
       
        for(int i = 0; i<k; i++){
            heap.offer(new int[]{arr[i], i});
        }
        
        ans.add(heap.peek()[0]);
        
        for(int i = k; i<n; i++){
            heap.offer(new int[]{arr[i], i});
            
            while(heap.peek()[1]<= i-k){
                heap.poll();
            }
            ans.add(heap.peek()[0]);
        }
        
        return ans;
        
    }
}