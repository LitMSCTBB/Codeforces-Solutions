import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count=0;
        for (int i=0; i<str.length()-6; i++) {
            if ((str.substring(i, i+7).equals("0000000")) || (str.substring(i, i+7).equals("1111111"))) {
                count+=1;
            }
        }
        if (count>=1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
