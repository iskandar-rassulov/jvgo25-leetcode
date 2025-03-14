class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int count = 1;

        for(int i = 1; i <= chars.length; i++){

            if(i == chars.length || chars[i] != chars[i - 1]){
                chars[index++] = chars[i-1];

                if(count > 1){
                    for(char freq : String.valueOf(count).toCharArray()){
                        chars[index++] = freq;
                    }
                }
                count = 1;
            }else {
                count++;
            }

        }
        return index;
    }
}