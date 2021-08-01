public class Ex1Cautare {

    public static int search(String [] compareString, String key){
     int counter = 0;

     for (int i = 0; i < compareString.length; i++) {
         if (compareString[i].equalsIgnoreCase(key)) {
             counter++;
         }
     }
     return counter;
    }


    public static void main(String[] args) {
        String [] str = {"Java", "C", "Python", "JAVA", "perl", "C#", "java"};
        String key = "Java";
        System.out.println(search(str, key));
    }
}

