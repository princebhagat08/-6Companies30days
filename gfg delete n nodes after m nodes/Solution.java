class Solution {
    static void linkdelete(Node head, int n, int m) {
        int count = 1;
        Node temp = head;
        
        while(temp.next != null){
            if(count == m){
                int i = n;
                while(temp.next != null && i>0){
                    if(temp.next != null && temp.next.next != null){
                        temp.next = temp.next.next;
                    }else{
                        temp.next = null;
                    }
                   
                    i--;
                    
                }
                
                count = 0;
            }
            
            if(temp.next != null){
            temp = temp.next;
            count++;
            }
            
           
        }
    }
}