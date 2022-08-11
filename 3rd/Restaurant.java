class Burger {
    int amount;
    String taste;
    String name;
    String ham_name;

    Burger(int num, String string, String strings, String string_s) {
        amount = num;
        taste = string;
        name = strings;
        ham_name = string_s;
    }
    void combine() {
        System.out.println(ham_name + "버거에는 " + name + "소스를 뿌려 먹습니다.");
    }
    void best() {
        System.out.println(name + "소스의 맛은 " + taste + ". 따라서 소스를 둥글게 " + amount + "번 정도 짜서 먹으면 최고의 맛이 될것입니다.");
    }
}


public class Restaurant {
    public static void main(String[] args) {
        Burger bigMac = new Burger(2, "약간 짭니다", "빅벅", "빅맥");
        Burger spicy = new Burger(1, "맵습니다", "핫소스", "스파이시");
        Burger chicken = new Burger(3, "달달합니다", "데리야끼", "치킨");

        System.out.println("손님 주문하시겠어요? 혹시 고민이 되신다면 전체음식의 소스조합에 대하여 소개해드리겠습니다");

        bigMac.combine();
        bigMac.best();

        spicy.combine();
        spicy.best();

        chicken.combine();
        chicken.best();
    }
}
