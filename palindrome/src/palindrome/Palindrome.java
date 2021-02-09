package palindrome;

public class Palindrome {

    public static boolean isPalindrome(int num[]) {
        for (int i = 0; i < num.length / 2; ++i) {
            if (num[i] != num[num.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int array[] = {5, 1, 1, 5};
        System.out.print("Is it a Palindrome: ");
        System.out.println(Palindrome.isPalindrome(array));

    }

}
