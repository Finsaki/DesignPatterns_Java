package akiko.factorymethod;

/**
 * This was the first assignment which at that point I made in finnish
 * 
 * @author akiko
 *
 */
public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus tyoton = new Tyoton();
        opettaja.aterioi();
        opiskelija.aterioi();
        tyoton.aterioi();
    }
}
