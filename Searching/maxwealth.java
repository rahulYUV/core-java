package Searching;

public class maxwealth {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int wealth =0;
        for(int i =0;i<accounts.length;i++){
            int sum =0;
                for(int j =0;j<accounts[i].length;j++){
                    sum = sum +accounts[i][j];
                    if(sum>wealth)
                    wealth = sum;
    
                }
            }
            return wealth;
        }
        
    }
    
}
