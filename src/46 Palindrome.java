class Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checker.........!");
        int numarr[] = arrayInput.userinput();
        boolean ispalin = ispalindrome(numarr);
        if(ispalin){
            System.out.println("Your array is palindrome.");
        }else{
            System.out.println("Your array is not a palindrome.");
        }
        int arrlen = numarr.length;

    }

    public static boolean ispalindrome(int numarr[]){

        int i = 0;
        while(i< numarr.length/2){
            if(numarr[i] != numarr[numarr.length-1 -i]){
                return false;
            }
            i++;
        }
        return true;
    }

}

