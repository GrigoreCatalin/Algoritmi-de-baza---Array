import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.min;

public class Ex2Filtrare {

    public static String lettersMatchIgnoreCase(String[] array, String key) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toLowerCase();
        }

        int min = 0;
        int r = 0;
        int contor = 0;

        //border ant drop fly racoon class plane

        for (int i = 0; i < array.length; i++) {
            min = min(key.length(), array[i].length());
            for (int k = 0; k < min; k++) {
                if (key.charAt(k) == (array[i].charAt(k))) {
                    contor++;
                    break;
                }
            }
        }

        String[] newArray = new String[contor];

        for (int i = 0; i < array.length; i++) {
            min = min(key.length(), array[i].length());
            for (int k = 0; k < min; k++) {
                if (key.charAt(k) == array[i].charAt(k)) {
                    newArray[r] = array[i];
                    r++;
                    break;
                }
            }
        }
            displayArray(newArray);
            return key;
        }

        public static void displayArray (String[]array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            String[] str = new String[n];

            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
            }

            String word = sc.next();
            lettersMatchIgnoreCase(str, word);
        }
    }