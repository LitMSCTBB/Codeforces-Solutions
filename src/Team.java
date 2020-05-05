import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i=0; i<n; i++) {
            String[] able = scanner.nextLine().split(" ");
            if (Integer.parseInt(able[0])+Integer.parseInt(able[1])+Integer.parseInt(able[2])>=2) {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
