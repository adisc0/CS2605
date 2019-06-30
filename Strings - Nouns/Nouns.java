import java.util.Scanner;

public class Noun {

    public static void main(String[] args) {

      
        System.out.println("Enter 5 words...");
        String word = " ";
        for (int i = 1; i <= 5; i++) {
            System.out.println("Word " + i + ":");
            Scanner sc = new Scanner(System.in);
            word = sc.next();
            System.out.println(word);
        }

        for (String noun : word) {

            System.out.println("NOUN " + "\t" + "PLURAL ");
            if (noun.endsWith("y")) {
                
                String replaceChar = word.replace("y", "ies");
                System.out.println(word + "\t" + replaceChar);
                
                System.out.println("---------------------");

            } else if (word.endsWith("s")) {
                System.out.println(word + "\t" + word.concat("es"));
                
                System.out.println("---------------------");

            } else if (word.endsWith("ch")) {
                System.out.println(word + "\t" + word.concat("es"));
               
                System.out.println("---------------------");

            } else if (word.endsWith("sh")) {
                System.out.println(word + "\t" + word.concat("es"));
               
                System.out.println("---------------------");

            } else {

                System.out.println(word + "\t" + word.concat("s"));
                
                System.out.println("---------------------");

            }

        }
    }
}

