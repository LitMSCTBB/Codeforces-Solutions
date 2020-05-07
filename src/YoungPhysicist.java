import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i=0; i<n; i++) {
            String[] coords = scanner.nextLine().split(" ");
            sum += Integer.parseInt(coords[0])+Integer.parseInt(coords[1])+Integer.parseInt(coords[2]);
        }
        if (sum==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
