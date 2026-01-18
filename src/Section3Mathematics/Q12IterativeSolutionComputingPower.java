package Section3Mathematics;
/**
 * Iterative Power binary Explanation
 * 3^10 = 3^8 + 3^2  10: 1010
 *
 * 3^19 = 3^16 + 3^2 + 3^1  19: 10011
 *
 * Every number can be wriiten as sum of powers of 2(Set bits binary representation)
 *
 * We can traverse through all bits of a number (from lsb to msb) in O(logn) time.
 *
 * while(n > 0){
 *     if(n%2 != 0){
 *         // Bit is 1
 *     }else{
 *         // Bit is 0
 *         n=n/2;
 *     }
 * }
 *
 * **/
public class Q12IterativeSolutionComputingPower {
    public static void main(String[] args) {
        System.out.println(IterativeComputePower(2,-2));
    }

//    static int IterativeComputePower(int x, int n){
//        int res = 1;
//        while(n>0){
//            if(n%2 != 0){
//                res = res * x;
//            }
//            n = n/2;
//            x=x*x;
//        }
//        return res;
//    }

    static double IterativeComputePower(double x, int n){
        if(n<0){
            x = 1.0/x;
            n = -n;
        }
        double res = 1.0;
        while(n>0){
            if((n & 1) != 0){
                res = res * x;
            }
            n = n >> 1;
            x=x*x;
        }
        return res;
    }
}
