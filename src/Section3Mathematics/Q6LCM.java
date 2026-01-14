package Section3Mathematics;
/**
 * Formulae
 * a * b  = gcd(a,b) * lcm(a,b)
 *
 * lcm(a,b) = (a*b)/gcd(a*b)
 *
 *
 * **/
public class Q6LCM {
    public static void main(String[] args) {
        System.out.println(NaiveLcm(4, 6));
        System.out.println(OptimisedLcm(4,6));
    }

    public static int NaiveLcm(int a, int b) {
        // Java: res = Math.max(a,b).
        int res = Math.max(a,b);
        while (true) {
            if (res % a == 0 && res % b == 0) {
                return res;
            }
            res++;
        }
    }

    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b , a%b);
    }
    public static int OptimisedLcm(int a , int b){
        return (a*b) / gcd(a,b);
    }
}
