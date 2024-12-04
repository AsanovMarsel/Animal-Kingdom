public class Lion extends Animal {
    private int prideSize;


    public Lion(String name, String kingdom, String power,int prideSize) {
        super(name, kingdom, power);
        this.prideSize = prideSize;
    }

    public void  leadPride(){
        System.out.println("Лев видет свой прайд из "+ prideSize +  " львов, чтобы защитить свои земли " );
    }
}
