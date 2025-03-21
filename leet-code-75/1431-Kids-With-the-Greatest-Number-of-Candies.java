import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> res = new ArrayList<>();

        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){max = candies[i];}
        }

        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) >= max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}