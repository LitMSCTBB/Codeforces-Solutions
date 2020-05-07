import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        StonesOnTheTable m = new StonesOnTheTable();
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String str=scanner.nextLine();
        List<String> runSep = m.splitStringByCharacter(str);
        int counter=0;
        for (int i=0; i<runSep.size(); i++) {
            counter += (runSep.get(i).length()-1);
        }
        System.out.println(counter);
    }


    public List<String> splitStringByCharacter(String string){

        List<String> resultStrings = new ArrayList<>();
        StringBuilder currentString = new StringBuilder();

        for (int pointer = 0; pointer < string.length(); pointer++){

            currentString.append(string.charAt(pointer));

            if (pointer == string.length() - 1
                    || currentString.charAt(0) != string.charAt(pointer + 1)) {
                resultStrings.add(currentString.toString());
                currentString = new StringBuilder();
            }
        }

        return resultStrings;
    }

}
