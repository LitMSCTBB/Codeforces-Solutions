import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kn = scanner.nextLine().split(" ");
        int n = Integer.parseInt(kn[0]);
        int k = Integer.parseInt(kn[1]);
        List<Integer> nonzeroScores = new ArrayList<Integer>();
        String[] scores = scanner.nextLine().split(" ");
        for (int i=0; i<n; i++) {
            if (Integer.parseInt(scores[i])<1) {
                break;
            } else {
                nonzeroScores.add(Integer.parseInt(scores[i]));
            }
        }
        if (nonzeroScores.size()<=k) {
            System.out.println(nonzeroScores.size());
        } else {
            int qualScore = nonzeroScores.get(k-1);
            int end=nonzeroScores.size();
            for (int i=0; i<nonzeroScores.size(); i++) {
                if (nonzeroScores.get(i) < qualScore) {
                    end=i;
                    break;
                }
            }
            System.out.println(end);
        }
    }
}
