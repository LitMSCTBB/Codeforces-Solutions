import java.util.Scanner;

public class BitPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x=0;
        for (int i=0; i<n; i++) {
            String statement = scanner.nextLine();
            if (statement.charAt(1)=='+') {
                x+=1;
            } else {
                x-=1;
            }
        }
        System.out.println(x);
    }
}
