public enum Month {
    JANUARY("JANUAR"),
    FEBRUARY("FEBRUAR"),
    MARCH("MARCIUS"),
    APRIL("APRILIS"),
    MAY("MAJIUS"),
    JUNE("JUNIUS"),
    JULY("JULIUS"),
    AUGUST("AUGUSZTUS"),
    SEPTEMBER("SZEPZEMBER"),
    OCTOBER("OKTOBER"),
    NOVEMBER("NOVEMBER"),
    DECEMBER("DECEMBER");

    private String magyarNev;

    Month(String magyarNev) {
        this.magyarNev = magyarNev;
    }

    public String getMagyarNev() {
        return magyarNev;
    }

    public void setMagyarNev(String magyarNev) {
        this.magyarNev = magyarNev;
    }
}