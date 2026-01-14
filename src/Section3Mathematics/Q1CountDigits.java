package Section3Mathematics;

public class Q1CountDigits {
    public static void main(String[] args) {
        int n = 83883698;
        System.out.println("Number of Digits are : " + CountDigits(n));
    }

    public static int CountDigits(int n){
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}