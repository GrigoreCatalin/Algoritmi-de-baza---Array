import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        String word = sc.next();

        int contorStr = 0;
        int contorWord = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 0) {
                contorWord++;
            }
        }
        System.out.println(contorWord);

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); i++) {
                if (str[i].charAt(j) != ' ') {
                    contorStr++;
                }
                System.out.println(contorStr);
            }

        }

    }
}
