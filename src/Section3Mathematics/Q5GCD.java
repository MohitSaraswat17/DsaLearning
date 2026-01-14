package Section3Mathematics;
/**
 *  I/P :- a = 4 , b = 6.
 *  O/P :- 2
 *  A very good relation with a tile structure.
 *  make a tile or matrix of 6 X 4 and the biggest square which can fill with like 1X1 or 2X2 will be the GCD.
 * 2 X 2  Output 2.
 *
 *
 * T.C - O(min(a,b))
 *
 *
 * Euclidean Algorithmn
 * Basic Idea:-
 * Let 'b' be the smaller than 'a'
 *  gcd(a,b) = gcd(a-b,b)
 *
 *  Why ?
 *  Let 'g' be the GCD of 'a' and 'b'
 *  a = gx , b = gy and GCD(x,y) = 1
 *
 *  (a - b) = g(x - y)
 *
 * First is UnOptimisedEuclidsGCD here what we were doing was repetitive subtraction but what can we do is Modular division.
 *
 * Optimised is as below
 *
 *
 * **/
public class Q5GCD {
    public static void main(String[] args) {
        System.out.println(NaiveGcd(6,4));
        System.out.println(UnOptimisedEuclidsGCD(6,4));
        System.out.println(OptimisedEuclidsGCD(12,15));
    }

    public static int NaiveGcd(int a, int b){
        int res = Math.min(a,b);
        while(res>0){
            if(a % res ==0 && b % res ==0){
                break;
            }
            res--;
        }
        return res;
    }

    public static int UnOptimisedEuclidsGCD(int a,int b){
        while(a != b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        return a;
    }

    public static int OptimisedEuclidsGCD(int a,int b){
        if(b==0) return a;
        return OptimisedEuclidsGCD(b,a%b);
    }
    /**
     * Dry Run
     * OptimisedEuclidsGCD(12,15)
     * OptimisedEuclidsGCD(15,12)
     * OptimisedEuclidsGCD(12,3)
     * OptimisedEuclidsGCD(3,0)
     *
     * Answer 3
     * **/

}
