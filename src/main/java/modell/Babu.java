package modell;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this.szin = szin;
        this.ero = 1;
    }

    public Babu(int ero, String szin) {
        if (ero < 1 || ero > 9) {
            throw new IllegalArgumentException("Az 'ero' értékének 1 és 9 között kell lennie.");
        }
        this.ero = ero;
        this.szin = szin;
    }
}
