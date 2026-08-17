class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] leftp = new int[nums.length];
        int [] rightp = new int[nums.length];

        leftp[0] = 1;
        
        for(int i = 1; i< nums.length ; i++){
            int lelp = leftp[i-1];
            int crp = lelp * nums[i-1];
            leftp[i] = crp;

        }

        rightp[nums.length-1] = 1;

        for(int i =nums.length -2; i >= 0 ; i--){
            int lelp = rightp[i+1];
            int crp = lelp * nums[i + 1];
            rightp[i] =crp;
        }      

        int [] res = new int[nums.length];

        for(int i =0 ; i< res.length ; i++){
            res[i] = leftp[i]* rightp[i];
        }

        return res; 
        
    }
}