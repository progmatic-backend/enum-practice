public class Main {
    public static void main(String[] args) {
        System.out.println("Current month: " + Month.JUNE);

        for (Month month : Month.values()) {
            System.out.println(month);
        }

        System.out.println("Current season: " + Season.SPRING);

        for (Season season : Season.values()) {
            System.out.println(season);
        }
    }
}
