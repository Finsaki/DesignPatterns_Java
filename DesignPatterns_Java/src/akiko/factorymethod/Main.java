package akiko.factorymethod;

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
