package Section3Mathematics;

class Solution {

    public static void main(String[] args) {

    }
    public void plusOne(int[] digits) {
        boolean ALL_NINE = true;
        boolean LAST_NINE = false;
        int n = digits.length;
        int[] res;
        for(int i = 0;i<n;i++){
           if(digits[i]!=9){
               ALL_NINE = false;
               break;
           }
        }

        if(digits[n-1] == 9 && !ALL_NINE){
            LAST_NINE = true;
        }
    }

}
