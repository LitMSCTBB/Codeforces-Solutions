import java.util.*;

public class Watermelon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        if (w%2==0 && w!=2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


}
