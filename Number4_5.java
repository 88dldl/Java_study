public class Number4_5 {
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;
        for (int grade : marks) {
            sum += grade;
        }
        System.out.println((double) sum / marks.length);
    }
}
