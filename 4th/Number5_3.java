class Song {
    String title;
    String singer;
    int year;
    String country;

    Song(String title, String singer, int year, String country) {
        this.title = title;
        this.singer = singer;
        this.year = year;
        this.country = country;
    }

    void show() {
        System.out.println(year + "년 " + country + "국적의 " + singer + "가 부른 " + title);
    }
}

public class Number5_3 {
    public static void main(String[] args) {
        Song DancingQueen = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        DancingQueen.show();
    }
}