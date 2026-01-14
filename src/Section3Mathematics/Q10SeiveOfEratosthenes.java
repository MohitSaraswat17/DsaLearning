package Section3Mathematics;

import java.util.Arrays;

/**
 * Given a n = 10
 * identify all the prime numbers smaller than 'n'
 * 2 , 3 , 5 , 7
 *
 *
 *
 *  All Prime Numbers Greater than 3 are in form 6k+1 or 6k-1.
 *
 * **/
public class Q10SeiveOfEratosthenes {
    public static void main(String[] args) {

    }

//    static boolean isPrime(int n){
//        if(n==1) return false;
//        if(n==2 || n==3) return true;
//        if(n%2 ==0 || n%3==0) return false;
//
//        for(int i=5;i<=n;i=i+6){
//            if(n%i == 0 || n % (i+2) == 0) return false;
//        }
//        return true;
//    }


    // Simple Implementation of Seive Algorithmn

    static void Seive(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=2*i;j<=n;j=j+i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }

    }

    static void OptimisedSeive(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i);
                for(int j=i*i;j<=n;j=j+i){
                    isPrime[j] = false;
                }
            }
        }
    }

}
