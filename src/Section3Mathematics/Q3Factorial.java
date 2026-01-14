package Section3Mathematics;

public class Q3Factorial {
    public static void main(String[] args) {
        System.out.println(IterativeFactorial(4));
        System.out.println(RecursiveFact(4));
    }

    public static int IterativeFactorial(int n){
        int res = 1;
        for(int i=2;i<=n;i++){
            res = res * i;
        }
        return res;
    }
    public static int RecursiveFact(int n){
        if(n==0) return 1;

        return n * RecursiveFact(n-1);
    }
}
