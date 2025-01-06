class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int n = original.length;
        int m = source.length();
        long [][]wt = new long[26][26];

        for(int i=0; i<26; i++){
            for(int j =0; j<26; j++){
                wt[i][j] = Long.MAX_VALUE;
            }
        }

      
        for(int i = 0; i<n; i++){
                int u = original[i] - 'a';
                int v = changed[i] - 'a';
                wt[u][v] = Math.min(wt[u][v], cost[i]); 
        }

        for(int i =0; i<26; i++) wt[i][i] = 0;

        for(int i =0; i<26; i++){
            for(int j = 0; j<26; j++){
                for(int k = 0; k<26; k++){
                    if(wt[j][i] == Long.MAX_VALUE || wt[i][k] == Long.MAX_VALUE) continue;
                    wt[j][k] = Math.min(wt[j][k], wt[j][i] + wt[i][k]);
                }
            }
        }

        long minCost = 0;
        for(int i =0; i<m; i++){
            int u = source.charAt(i) - 'a';
            int v = target.charAt(i) - 'a';
            if(wt[u][v] == Long.MAX_VALUE) return -1;
            minCost += wt[u][v];
        }

        return minCost;

    }

}