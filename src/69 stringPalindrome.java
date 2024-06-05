import java.util.Scanner;

class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        String re = "Your string is "+((isPalindrome(str))?" palindrome": "not a palindrome");
        System.out.println(re);
    }

    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }

        int lastPositing = str.length()-1;
        if(str.charAt(0)!= str.charAt(lastPositing)){
            return false;
        }

        String newstr = str.substring(1,lastPositing);

        return isPalindrome(newstr);
    }
}
