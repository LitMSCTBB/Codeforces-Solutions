import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int length = str1.length();
        int result = 0;
        for (int i=0; i<length; i++) {
            char c1 = Character.toLowerCase(str1.charAt(i));
            char c2 = Character.toLowerCase(str2.charAt(i));
            int char1 = c1;
            int char2 = c2;
            if (char1<char2) {
                result=-1;
                break;
            } else if (char1>char2) {
                result=1;
                break;
            }
        }
        System.out.println(result);
    }
}
