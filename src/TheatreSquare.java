import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine();
        long n = Long.parseLong(inputs.split(" ")[0]);
        long m = Long.parseLong(inputs.split(" ")[1]);
        long a = Long.parseLong(inputs.split(" ")[2]);
        long horizontal;
        if (n%a==0) {
            horizontal=n/a;
        } else {
            horizontal=n/a+1;
        }
        long vertical;
        if (m%a==0) {
            vertical=m/a;
        } else {
            vertical=m/a+1;
        }
        System.out.println(horizontal*vertical);
    }
}
