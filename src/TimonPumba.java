public class TimonPumba extends Animal {

    private Boolean sings;

    public TimonPumba(String name, Boolean sings) {
        super(name);
        this.sings = sings;
    }

    public void isSinging() {
        System.out.println("♫Hakuna Matata♫");
    }

    public Boolean getSings() {
        return sings;
    }

    public void setSings(Boolean sings) {
        this.sings = sings;
    }
}
