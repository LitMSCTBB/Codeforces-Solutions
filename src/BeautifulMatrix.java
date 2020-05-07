import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 0;
        int c = 0;
        for (int i=0; i<5; i++) {
            String[] strEnts = scanner.nextLine().split(" ");
            for (int j=0; j<5; j++) {
                if (strEnts[j].equals("1")) {
                    r=i;
                    c=j;
                }
            }
        }
        System.out.println(Math.abs(r-2)+Math.abs(c-2));

    }
}
