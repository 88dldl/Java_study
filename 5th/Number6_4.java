import java.util.Scanner;

public class Number6_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("영문을 입력하세요: ");
            String word = scan.nextLine();
            if (word.equals("END")) {
                break;
            }
            System.out.println(word.toUpperCase());
        }
    }
}