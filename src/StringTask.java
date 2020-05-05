import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        StringTask m = new StringTask();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result="";
        for (int i=0; i<str.length(); i++) {
            if (!(m.isVowel(str.charAt(i)))) {
                String addend = "."+Character.toLowerCase(str.charAt(i));
                result = result+addend;
            }
        }
        System.out.println(result);
    }
    public boolean isVowel(char c) {
        if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='Y'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='y') {
            return true;
        }
        return false;
    }
}
