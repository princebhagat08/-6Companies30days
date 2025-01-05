class Solution {
    int [][]arr;
    public Solution(int[][] rects) {
        arr = rects;
    }
    
    public int[] pick() {
        int totalPoints = 0;
        int [] ans = new int[2];
        List<Integer> rectNumber = new ArrayList();
        for(int [] rec: arr){
            int x = Math.abs(rec[0]-rec[2]) +1;
            int y = Math.abs(rec[1]-rec[3]) +1;
            totalPoints += x*y;
            rectNumber.add(totalPoints);
        }
        int randomNumber = ThreadLocalRandom.current().nextInt(1, totalPoints + 1);
        int i = 0;
        while(i<rectNumber.size()){
            if(randomNumber<=rectNumber.get(i)) break;
            i++;
        }

        ans[0] =  ThreadLocalRandom.current().nextInt(arr[i][0],arr[i][2]+1);
        ans[1] =  ThreadLocalRandom.current().nextInt(arr[i][1],arr[i][3]+1);


        return ans;

        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */