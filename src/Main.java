import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task: Given an integer x, return true if x is a palindrome,
        // and false otherwise.

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(isPalindrom(x));
    }
    public static boolean isPalindrom(int x){
        String str = Integer.toString(x);
        int length = str.length();
        for(int i = 0; i < (length/2); i++){
            if(str.charAt(i) != str.charAt(length - i - 1)){
                return false;
            }
        }
        return true;

        // from LeetCode
        // if (x < 0) {return false;}
        // int reserved = 0;
        // int temp = x;
        // while (temp != 0){
        //      int digit = (int)(temp % 10);
        //      reversed = reversed * 10 + digit;
        //      temp /= 10; }
        //  return (reversed == x);
    }
}