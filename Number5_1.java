class TV {
    String brand;
    int year;
    int size;

    TV(String brand, int year, int size) {
        this.brand = brand;
        this.year = year;
        this.size = size;
    }

    void show() {
        System.out.println(brand + "에서 만든 " + year + "년형 " + size + "인치 TV");

    }
}

public class Number5_1 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
