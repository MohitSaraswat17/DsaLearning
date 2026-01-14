package Section3Mathematics;
/**
 * Divisors always appear in pairs.
 * 30: (1,30), (2,15), (3,10), (5,6)
 *
 * One of the Divisors in every pair  is smaller than or equal to root(n)
 * For a pair (x,y)
 * x * y = n
 * Let x be the smaller, i.e ,x <= y
 * x * x <= n
 * x <= root(n)
 *
 * **/
public class Q9PrintAllDivisors {
    public static void main(String[] args) {
        NaivePrintDivisors(30);
        System.out.println();
        OptimisedPrintDivisors(30);
        System.out.println();
        OptimisedInSortedOrder(30);
    }

    static void NaivePrintDivisors(int n){
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }

    static void OptimisedPrintDivisors(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                System.out.println(i);
                if(i!=n/i){
                    System.out.println(n/i);
                }
            }
        }
    }

    static void OptimisedInSortedOrder(int n){
        int i;
        for (i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        i--;
        for(;i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }
}
