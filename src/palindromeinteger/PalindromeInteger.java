package palindromeinteger;
import java.util.Scanner;
/**
 *
 * @author ilkiz
 */
public class PalindromeInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        }
        else
        {
            System.out.println(number + " is not a palindrome");
        }        
    }
    public static boolean isPalindrome(int number){
        return (number==reverse(number));
    }
    public static int reverse(int number){
        String sNumber=number+"";
        String reversed="";
        int n=sNumber.length();
        for (int i = 0; i < n; i++) {
            reversed=reversed+sNumber.charAt(n-i-1);
        }
        return Integer.parseInt(reversed);
    }    
}
