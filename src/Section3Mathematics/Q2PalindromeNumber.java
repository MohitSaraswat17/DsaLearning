package Section3Mathematics;

public class Q2PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(IsPalindrome(45643));
        System.out.println(IsPalindrome(4554));
    }

    public static boolean IsPalindrome(int n){
        int temp = n;
        int rev = 0;
        while(temp>0){
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return (n == rev);
    }
}
