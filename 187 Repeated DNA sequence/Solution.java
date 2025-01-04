class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList();
        if(s.length()<11) return ans;

        Set<String> seen = new HashSet();
        Set<String> added = new HashSet();
        
        for(int i = 0; i<=s.length()-10; i++){
           String dna = s.substring(i, i+10);
           if(seen.contains(dna) && !added.contains(dna)){
            ans.add(dna);
            added.add(dna);
           }else{
            seen.add(dna);
           }

        }

        return ans;
        
    }
}