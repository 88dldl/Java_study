import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    int avg(int[] data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return (sum / data.length);
    }

    int avg(ArrayList<Integer> data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return (sum / data.size());
    }
}

public class Number5_5 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] data1 = {1, 3, 5, 7, 9};
        System.out.println(calculator.avg(data1));

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        System.out.println(calculator.avg(data2));
    }
}
