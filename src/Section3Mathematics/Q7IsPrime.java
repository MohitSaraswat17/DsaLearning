package Section3Mathematics;
/**
 * Efficient Method
 * Idea: Divisors always appear in Pairs.
 * 30: (1,30), (2,15),(3,10)
 *  (5,6)
 *
 *  65: (1,65), (5,13)
 *  25: (1,25), (5,5)
 *
 *
 * if (x,y) is a Pair then x * y = n, and if x <=y and x*x<=n x<=Root(n)
 * **/
public class Q7IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(65));
        System.out.println(isPrimeOptimised(7));
        System.out.println(isPrimeOptimisedFurther(8522005));
    }

    static boolean isPrime(int n){
        if(n == 1 ) return false;
        for(int i=2;i<n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    static boolean isPrimeOptimised(int n){
        if(n == 1) return false;

        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeOptimisedFurther(int n){
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;  // This is important there otherwise below could return wrong for the 2 and 3.
        if(n % 2 == 0 || n % 3 ==0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i == 0 || n % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
}
