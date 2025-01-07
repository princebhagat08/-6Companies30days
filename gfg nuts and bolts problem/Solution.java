class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        
        char[] orders = {'!','#','$','%','&','*','?','@','^'};
        
        
        HashMap<Character, Integer> order = new HashMap();
        
        for(int i =0; i<orders.length; i++){
            order.put(orders[i],i);
        }
        
      
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1-i; j++){
                
                if(order.get(nuts[j]) > order.get(nuts[j+1])){
                    char temp = nuts[j];
                    nuts[j] = nuts[j+1];
                    nuts[j+1] = temp;
                }
                
                if(order.get(bolts[j]) > order.get(bolts[j+1])){
                    char temp = bolts[j];
                    bolts[j] = bolts[j+1];
                    bolts[j+1] = temp;
                }
                
            } 
        }
    }
}