public class Eagle extends Animal {
    private int flightRange;
     String name;

    public Eagle(String name, String kingdom, String power,int flightRange) {
       super( name,kingdom,power);
        this.flightRange = flightRange;
        this.name = name;
    }

    public void scanTerritory(){
        System.out.println("Сокол парит высоко над небом сканируя наличие угорозы, на высоте "+ flightRange);
    }
}
