class Solution {
    public int findNumbers(int[] nums) {
        int digits =0;
        int count =0;

        for(int n : nums){

            while(n > 0){
                n = n/10;
                digits++;
            }

            if(digits % 2 == 0){
                count ++;
            }
            digits=0;
            
        }
       return count;
        
    }
}