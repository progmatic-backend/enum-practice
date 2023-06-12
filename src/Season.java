public enum Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;

    public static Season getSeasonByMonth(Month month) {
        return switch (month) {
            case MARCH, APRIL, MAY -> SPRING;
            case JUNE, JULY, AUGUST -> SUMMER;
            case SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN;
            case DECEMBER, JANUARY, FEBRUARY -> WINTER;
        };
    }

    public String getHungarianName() {
        return switch (this) {
            case SPRING -> "Tavasz";
            case SUMMER -> "Nyár";
            case AUTUMN -> "Ősz";
            case WINTER -> "Tél";
        };
    }

}