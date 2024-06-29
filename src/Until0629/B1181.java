//문자열
import java.util.*;

public class B1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Set<String> words = new HashSet<>();
        for(int i = 0; i < n; i++){
            words.add(sc.nextLine());
        }

        List<String> wordsList = new ArrayList<>(words);
        wordsList.sort((word1, word2) -> {
            int lenght = Integer.compare(word1.length(), word2.length());
            if(lenght == 0){
                return word1.compareTo(word2);
            }
            return lenght;
        });
        for(String s : wordsList){
            System.out.println(s);
        }
    }
}