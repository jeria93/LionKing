public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;

    }

//    Äta metoden
    public void eat(String food) {
        System.out.println(name + " doesnt eat meat, he's " + food);
    }
}
