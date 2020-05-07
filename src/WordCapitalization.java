import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1, str.length()));
    }
}
