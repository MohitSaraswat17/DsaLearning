package Section3Mathematics;
/**
 * Pow(x,n)
 * I/P -> x = 2, n = 3
 * o/p -> 8
 *
 *
 * Interesting Fact:-
 * power(x,n) = if{ n % 2 == 0 pow(x,n/2) * pow(x,n/2)}
 * else
 *      pow(x,n-1)*x
 *
 * **/
public class Q11ComputingPower {
    public static void main(String[] args) {
        System.out.println(NaivePower(2,3));
        System.out.println(EffiecientPower(2,3));
    }

    static int NaivePower(int x,int n){
        if(n==0) return 1;
        if(n==1) return x;
        int res = 1;
        if(n>0){
            while(n>0){
                res=res*x;
                n--;
            }
        }
        return res;
    }

    static int EffiecientPower(int x,int n){
        if(n==0) return 1;

        int temp = EffiecientPower(x,n/2);
        temp = temp * temp;

        if(n%2 == 0){
            return temp;
        }else{
           return temp * x;
        }
    }
}
