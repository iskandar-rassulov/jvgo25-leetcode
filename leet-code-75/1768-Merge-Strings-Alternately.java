class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minlen = Math.min(word1.length(), word2.length());
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < minlen; i++){
            res.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if(word1.length() > minlen){res.append(word1.substring(minlen));}
        if(word2.length() > minlen){res.append(word2.substring(minlen));}

        return res.toString();
    }
}