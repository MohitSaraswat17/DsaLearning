package Section3Mathematics;

import static Section3Mathematics.Q7IsPrime.isPrimeOptimisedFurther;
/**
 * Effiecient Solution
 *  Divisors always appear in Pairs
 *  30 : (1,30), (2,15), (3,10), (5,6)
 *
 * A number n can be written as multiplications
 * of powers of prime factors
 * 12 = 2^2 * 3
 * 450 = 2^1 * 3^2 * 5^2
 *
 * Let x, y be an pair
 *  x * y = n
 *  if x <= y
 *  x * x <= n
 *  x <= root(n)
 * **/
public class Q8PrintPrimeFactors {
    public static void main(String[] args) {
//        primeFactorsNaive(20);
        OptimisedPrintPrimeFactors(450);
        System.out.println();
        OptimisedPrintPrimeFactors(84);
    }

    public static void  primeFactorsNaive(int n){
        for (int i = 2; i < n; i++) {
            if(isPrimeOptimisedFurther(i)){
                int x = i;
                while(n % x ==0){
                    System.out.println(i);
                    x = x * i;
                }
            }
        }
    }


    public static void OptimisedPrintPrimeFactors(int n){
        if(n<=1) return;

        for(int i = 2; i*i<=n; i++){
            while(n%i==0){
                System.out.println(i);
                n = n/i;
            }
        }
        if(n>1) System.out.println(n);
    }

    public static void VeryOptimisedPrintPrimeFactors(int n) {
        if(n<=1) return;

        while(n%2==0){
            System.out.println(2);
            n = n/2;
        }
        while(n%3==0){
            System.out.println(3);
            n=n/3;
        }

        for(int i = 5;i*i<=n;i=i+6){
            while(n%i==0){
                System.out.println(i);
                n = n/i;
            }
            while(n % (i+2) == 0){
                System.out.println(i+2);
                n = n / (i+2);
            }
        }
        if(n<3) System.out.println(n);
    }
}
