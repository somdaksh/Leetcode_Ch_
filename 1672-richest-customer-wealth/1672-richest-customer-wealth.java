// class Solution {
//     public int maximumWealth(int[][] accounts) {

//         int n = accounts.length;

//         // int wea =0;
//         int max =0;
//         int[] wea = new int[accounts[0].length];

//          for(int i=0 ; i < n ; i++){

//             for(int j=0; j < accounts[i].length ; j++){
//                 wea[j]= wea[j] + accounts[i][j];
//             }

//             // if(wea > max){
//             //     max = wea;
//             // }

//          }

//         for(int i =0; i< wea.length ; i++){

//             if(wea[i] > max){
//                 max = wea[i];
//             }
//         }
//         return max;

//     }
// }


class Solution {
    public int maximumWealth(int[][] accounts) {

        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
