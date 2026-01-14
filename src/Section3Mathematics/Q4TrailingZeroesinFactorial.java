package Section3Mathematics;

/**
 * The Naive Solution would not work because it will cause overflow for even the slightly bigger values of n . Ex  20.
 * O(n) time complexity
 *
 *
 *  Effiecient Method.
 *  1 x 2 x 3 x 4 x 5 x 6 ........ x n.
 *
 *  Every 5 th Number will have 5 as a prime factor.
 *  Here we can use Atleast one 5 as prime factor because in every fifth there could be a number which has more than one 5 as a prime factor.
 *
 *  General formulae could be the following thing like Trailing Zero Count
 *   (floor of n/5) + (floor of n/25) + (floor of n/125) + ....................
 *  O(logn) time complexity.
 **/

public class Q4TrailingZeroesinFactorial {
    public static void main(String[] args) {
//        System.out.println(NaiveCountTrailingZeroes(10));
        System.out.println(effiecientCountrailingZeroes(251));
    }


    public static int NaiveCountTrailingZeroes(int n){
        int fact = 1;
        for(int i = 2;i<=n;i++){
            fact = fact * i;
        }
        int res = 0;
        while(fact % 10 == 0){
            res++;
            fact = fact/10;
        }
        return res;
    }

    public static int effiecientCountrailingZeroes(int n){
        int res = 0;
        for(int i = 5;i <= n;i = i*5){
            res = res + n/i;
        }
        return res;
    }
    /* *
    * Dry Run
    * n = 251
    *  Ist iteration : i = 5;
    *   res = res + 50;
    *       = 50.
    *
    *   IInd iteration : i = 25
    *   res = res + 10
    *       = 60
    *
    *   IIIrd iteration : i = 125
    *   res = res + 2
    *       = 62
    *
    * */
}
