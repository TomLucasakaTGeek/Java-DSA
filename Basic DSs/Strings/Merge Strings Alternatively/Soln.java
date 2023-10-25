class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder w = new StringBuilder();
        int l1=word1.length();
        int l2=word2.length();
        int i=0,j=0;
        
        while(i<l1 || j<l2) {
            if(i<l1)
                w.append(word1.charAt(i++));
            if(j<l2)
                w.append(word2.charAt(j++));
        }
        return w.toString();
}}
