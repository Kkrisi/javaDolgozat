package feladat;

public class Tabla {
    private char[][] T;
    private char UresCella;
    private char ertek;

    public Tabla(char ertek) {
        T = new char[8][8];
        this.UresCella = ertek;
        feltolt();
    }

    public void feltolt() {
        for (int i = 1; i < 9; i++) {
            T[i][0] = i;
            for (int j = 1; j < 9; j++) {
                T = [0][j];
            }
        }
    }

    public void kiIr(){
        if (ertek == "") {
            System.out.println("Nincs megadva betű.");
        }

        for (char[] sor : T) {
            System.out.print(sor);
            for (char[] cella : T) {
                System.out.print(cella);
            }
            System.out.println();
        }
}
