class Solution {
    public int trap(int[] height) {
        
        int ans =0;

        int left[] = new int[height.length];
        left[0] = height[0];

        for(int i =1; i< left.length; i++){
            left[i]= Math.max(left[i-1] ,height[i]);
        }

        int right[] = new int[height.length];
        right[height.length -1] = height[height.length -1];

        for(int i = height.length -2; i>= 0; i--){
            right[i] = Math.max(height[i] , right[i+1]);
        }

        for(int i=0 ; i< height.length ; i++){
            int h = height[i];
            int lmax =left[i];
            int rmax = right[i];

            ans = ans + Math.min(lmax , rmax) -h;
        }

        return ans;

        // without optimization

        // for(int i =0; i< height.length; i++){
        //     int lmax = height[i];
        //     for(int j =i-1; j>=0; j--){
        //         lmax = Math.max(lmax , height[j]);
        //     }

        //     int rmax =height[i];
        //     for(int j = i+1 ; j< height.length; j++){
        //         rmax = Math.max(rmax , height[j]);
        //     }
        //     int water = Math.min(lmax , rmax) - height[i];
        //     ans = ans+ water;
        // }
        // return ans;
    }
}