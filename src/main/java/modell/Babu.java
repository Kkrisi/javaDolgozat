package modell;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this.szin = szin;
        this.ero = 1;
    }

    public Babu(int ero, String szin) {
        this.ero = ero;
        this.szin = szin;
    }
}
