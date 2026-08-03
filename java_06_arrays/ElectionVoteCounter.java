package java_06_arrays;

import java.util.Scanner;

public class ElectionVoteCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] count = new int[5];
        int spoilt = 0;

        System.out.print("Enter total ballots: ");
        int ballots = sc.nextInt();

        for (int i = 0; i < ballots; i++) {

            System.out.print("Enter candidate number : ");
            int vote = sc.nextInt();

            if (vote >= 1 && vote <= 5) {
                count[vote - 1]++;
            } else {
                spoilt++;
            }
        }

        System.out.println("\nvote count");

        for (int i = 0; i < 5; i++) {
            System.out.println("Candidate " + (i + 1) + " = " + count[i]);
        }
        System.out.println("Spoilt Ballots = " + spoilt);

        sc.close();
    }
}