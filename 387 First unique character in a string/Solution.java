class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> table = new HashMap();

        int i = 0;
        while(i< s.length()){
            if(table.containsKey(s.charAt(i))){
                table.replace(s.charAt(i),table.get(s.charAt(i))+1);
            }else{
                table.put(s.charAt(i),1);
            }
            i++;
        }

        int j =0;
        while(j<s.length()){
            if(table.get(s.charAt(j)) == 1) return j;
            j++;
        }



        return -1;
        
    }
}