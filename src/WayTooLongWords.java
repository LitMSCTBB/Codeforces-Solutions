import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int words = Integer.parseInt(scanner.nextLine());
        String[] word = new String[words];
        for (int i=0; i<words; i++) {
            word[i] = scanner.nextLine();
        }
        for (int i=0; i<words; i++) {
            if (word[i].length()>10) {
                int newLength = word[i].length()-2;
                System.out.println(word[i].substring(0, 1)+newLength+word[i].substring(word[i].length()-1, word[i].length()));
            } else {
                System.out.println(word[i]);
            }
        }

    }

}
