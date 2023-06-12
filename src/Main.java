public class Main {
    public static void main(String[] args) {
        // Enum konstansok lértehozása
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);

        // Ugyanez egy sorban
        System.out.println("Tomorrow is " + Day.TUESDAY);

        // Enum konstansok összehasonlítása
        if (today == Day.WEDNESDAY) {
            System.out.println("It's Wednesday!");
        }

        System.out.println("The days of the week:");
        // Enum konstansokon való végigiterálás
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
