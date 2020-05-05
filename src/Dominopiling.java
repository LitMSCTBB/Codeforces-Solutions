import java.util.Scanner;

public class Dominopiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] MN = scanner.nextLine().split(" ");
        int M = Integer.parseInt(MN[0]);
        int N = Integer.parseInt(MN[1]);
        int area = M*N;
        if (M%2==0 || N%2==0) {
            System.out.println(area/2);
        } else {
            System.out.println((area-1)/2);
        }
    }
}
