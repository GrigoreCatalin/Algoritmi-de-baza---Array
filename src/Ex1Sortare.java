import java.util.Scanner;

public class Ex1Sortare {

    public static void doubleArray(int[] array) {
        int aux;
        for (int k = 0; k < array.length - 1; k++) {
            for (int i = 0; i < array.length - 1 - k; i++) {
                if (array[i] > array[i + 1]) {
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
        }
        for (int j = 0; j < array.length; j++){
            System.out.print(array [j] + " ");
        }
    }

    public static void stringArray (String [] sort) {
        String aux;
        for (int k = 0; k < sort.length - 1; k++) {
            for (int i = 0; i < sort.length - 1 - k; i++) {
                if ((sort[i].compareToIgnoreCase(sort[i + 1])) > 0) {
                    aux = sort[i];
                    sort[i] = sort[i + 1];
                    sort[i + 1] = aux;
                }
            }
        }
        for (int j = 0; j < sort.length; j++){
            System.out.print(sort [j] + " ");
        }
        }


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Numarul de elemente pentru int");
            int n = sc.nextInt();

            System.out.println("introduceti elementele");
            int[] str = new int[n];

            for (int i = 0; i < n; i++) {
                str[i] = sc.nextInt();
            }

            doubleArray(str);

            System.out.println();

            System.out.println("Numarul de elemente pentru string");
            int m = sc.nextInt();

            System.out.println("introduceti elementele");
            String[] sort = new String[m];

            for (int i = 0; i < m; i++) {
                sort[i] = sc.next();

            }
            stringArray(sort);
        }
    }

