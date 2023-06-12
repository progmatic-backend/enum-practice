public class Main {
    public static void main(String[] args) {
        System.out.println("Jelenlegi hónap: " + Month.JUNE.getHungarianName());
        System.out.println(Month.AUGUST.isSpringMonth() ? "Augusztus tavaszi hónap" : "Augusztus NEM tavaszi hónap");

        for (Month month : Month.values()) {
            System.out.println(
                    month.getMonthNumber() + ". hónap: " +
                    month.getHungarianName());
        }

        System.out.println("Current season: " + Season.SPRING);

        for (Season season : Season.values()) {
            System.out.println(season);
        }
    }
}
