package modell;

import modell.Jatek;
import modell.Babu;

import java.util.Arrays;

public class LogikaiJatek extends Jatek {
    private Babu tabla[][];
    private int sorrend[];
    private int babuDb;

    public LogikaiJatek() {
        super(0);
        this.tabla = new Babu[4][5];
        this.sorrend = new int[10];
        this.babuDb = 3;
    }

    public LogikaiJatek(int babuDb) {
        super(0);
        this.babuDb = babuDb;
        this.tabla = new Babu[4][5];
        this.sorrend = new int[10];
    }


    public boolean van8FelettiEro(int ero){
        return (ero > 0) ? true : false;
    }

    @Override
    public void kezd(){
        this.babuDb = 3;
        System.out.println("Kezdés");
    }

    @Override
    public void ment(){
        this.babuDb = 3;
        System.out.println("Mentés");
    }


    @Override
    public void vege(){
        this.babuDb = 10;
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDb=" + babuDb +
                '}';
    }
}
