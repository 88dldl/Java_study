public class Number4_2 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;

        while (n <= 1000) {
            if (n % 3 == 0) {
                sum += n;
            }
            n++;
        }
        System.out.println(sum);
    }
}
