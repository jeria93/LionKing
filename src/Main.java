//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Hyena hyena = new Hyena("Benzi");
    Lion lion = new Lion("Mufasa");
    TimonPumba timonPumba = new TimonPumba("Timon", true);

    hyena.laugh();
    lion.roar();
    timonPumba.isSinging();

    }
}