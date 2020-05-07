import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] summands = scanner.nextLine().split("\\+");
        int[] intSummands = new int[summands.length];
        for (int i=0; i<summands.length; i++) {
            intSummands[i]=Integer.parseInt(summands[i]);
        }
        Arrays.sort(intSummands);
        String str="";
        for (int i=0; i<summands.length; i++) {
            str = str + intSummands[i]+"+";
        }
        str = str.substring(0, str.length()-1);
        System.out.println(str);
    }
}
