import java.util.Scanner;

public class Ex1Filtrare {


    public static boolean isDoubleLetter(String word, char c, int limit) {
        boolean check = true;

        for (int i = 0; i < limit; i++) {
            if (word.charAt(i) == c) {
                return false;
            }
        }
        return check;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        //         // reference class method type constructor recursive structure
        String word = sc.next();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < str.length; j++) {
                if (isDoubleLetter(word, word.charAt(i), i)) {
                    if (word.charAt(i) == str[j].charAt(0)) {
                        System.out.print(str[j] + " ");
                    }
                }
            }
        }
    }
}

//