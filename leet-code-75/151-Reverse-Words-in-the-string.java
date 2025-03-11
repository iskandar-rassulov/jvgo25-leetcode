class Solution {
    public String reverseWords(String s) {
        s = s.trim(); List<String> sentence = Arrays.asList(s.split("\\s+"));
        Collections.reverse(sentence); return String.join(" ", sentence);
    }
}