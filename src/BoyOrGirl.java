import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String distinctChars = "";
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (distinctChars.indexOf(c)==-1) {
                distinctChars += c;
            }
        }
        if (distinctChars.length()%2==1) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}
