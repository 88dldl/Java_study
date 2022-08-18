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

    boolean isOdd(int number) {
        return (number % 2 == 1);
    }
}

public class Number5_4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.isOdd(1));
        System.out.println(calculator.isOdd(2));
    }
}
