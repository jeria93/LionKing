public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    public void roar() {
        System.out.println(name + " Roar");

//        Anropa eat metoden
        eat(" is vegetarian");
    }
}