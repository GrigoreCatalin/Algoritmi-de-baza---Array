import java.util.Locale;

public class Ex2Cautare {

    public static boolean isPalindromIgnoreCase(String str) {
        boolean check = false;
        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                check = true;
            }
        }
        return check;
    }


    public static void main(String[] args) {
        String str = "ads";
        System.out.println(isPalindromIgnoreCase(str));

    }
}
