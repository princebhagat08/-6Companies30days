class Solution {
    
    public static int findTheWinner(int n, int k) {
        int winnerIdx = 0;

        for(int i = 2; i<=n; i++){
            winnerIdx = (winnerIdx + k )%i;
        }

        return winnerIdx+1;
        
    }

    public static void main(String[] args){
        System.out.println(findTheWinner(10, 8));
    }

}