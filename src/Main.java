//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Lion lion = new Lion("Лев","Cаванна","Великий рык предков",10);
        System.out.println(lion);
        Eagle eagle = new Eagle("Сокол","над сованой","скрость",500);
        System.out.println(eagle);
        Shark shark = new Shark("Акула","Глубины окиана","Быстрый",2000);
        System.out.println(shark);

        lion.ruleKingdom();
        shark.huntInOcean();



        Kingdom kingdom = new Kingdom(lion, eagle);
        eagle.scanTerritory();
        kingdom.enemyApproaching();
        lion.leadPride();




    }
}