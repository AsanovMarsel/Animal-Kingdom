public class Animal {
    private String name;
    private String kingdom;
    private String power;

    public Animal(String name, String kingdom, String power) {
        this.name = name;
        this.kingdom = kingdom;
        this.power = power;
    }

    public void ruleKingdom(){
        System.out.println(name + " правит королевством "+ kingdom +" со свойей силой "+ power);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", kingdom='" + kingdom + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}