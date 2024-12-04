public class Shark extends Animal {
    private int oceanDepth;

    public Shark(String name, String kingdom, String power,int oceanDepth) {
        super( name,kingdom,power);
        this.oceanDepth = oceanDepth;

    }

    public void huntInOcean(){
        System.out.println("Акула плавает и охотется на глубине " + oceanDepth);

}
}
