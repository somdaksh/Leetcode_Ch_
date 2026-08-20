class Solution {
    public void nextPermutation(int[] nums) {

        int p=-1;
        for(int i = nums.length -1; i> 0; i--){
            if(nums[i] > nums[i-1]){
                p= i-1;
                break;
            }
        }

        if(p==-1){
            reverse(nums, 0 , nums.length -1);
            return;
        }

        int q=-1;
        for(int i= nums.length -1 ; i> p; i--){
            if(nums[i] > nums[p]){
                q=i;
                break;
            }
        }
        
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;

        reverse(nums , p+1 , nums.length -1);
    }

    private static void reverse(int[] nums, int i, int j){
        while(i < j){
            int temp =nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
            
        }
    }    
}