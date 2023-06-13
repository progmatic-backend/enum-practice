public class Main {
    public static void main(String[] args) {
        System.out.println("A mostani hónap: " + Month.JUNE.getMagyarNev());

        for (Month month : Month.values()) {
            System.out.println(month);
        }

        System.out.println("Most " + Season.SUMMER + " van.");

        for (Season evszak : Season.values()) {
            System.out.println(evszak);
        }
    }
}
