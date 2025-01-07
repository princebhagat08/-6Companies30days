class Solution {
    public String convertToTitle(int columnNumber) {
       StringBuilder ans = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            char lastChar = (char) ((columnNumber % 26) + 'A');
            ans.append(lastChar);
            columnNumber /= 26; 
        }

        return ans.reverse().toString();
        
    }
}