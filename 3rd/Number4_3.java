public class Number4_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int g = 0; g < i + 1; g++) {
                System.out.print("*");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

}
