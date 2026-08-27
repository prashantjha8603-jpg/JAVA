package java_07_strings;
import java.util.Scanner;
public class Count_words_funtion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Sentence : ");
        String sentence = sc.nextLine();
        sentence = sentence.trim();
        if(sentence.isEmpty()){
            System.out.println("Number of words is 0");
        }else{
            String[] words = sentence.split("\\s+");
            System.out.print("Number of words : "+words.length);
        }
        sc.close();
    }
}
