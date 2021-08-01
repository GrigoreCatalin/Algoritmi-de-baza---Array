public class CautareBonus {

    public static String removeCharacters(String str) {
        String str2 = str.replaceAll("[^A-za-z0-9]", "");
        return str2.toLowerCase();
    }

    public static void main(String[] args) {
        String str = "Not a palindrom, I'm afraid..";
        boolean check = true;

        StringBuilder str2 = new StringBuilder(removeCharacters(str));
        StringBuilder str3 = new StringBuilder(str2);
        str3.reverse();

        if (str3.compareTo(str2) == 0) {
            System.out.println(check);
        } else {
            check = false;
            System.out.println(check);
        }
    }
}
