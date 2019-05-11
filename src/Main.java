import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyJewelList simple = new MyJewelList();
        simple.add(new Jewel(10));
        simple.add(new Jewel(20));
        simple.add(new Jewel(30));
        simple.add(new Jewel(40));
        simple.add(new Jewel(50));
        simple.add(new Jewel(60));
        simple.add(new Jewel(70));
        simple.add(new Jewel(80));
        simple.add(new Jewel(90));
        simple.add(new Jewel(100));
        simple.add(new Jewel(110));
        simple.add(new Jewel(120));
        simple.add(new Jewel(130));
        simple.add(new Jewel(140));
        simple.add(new Jewel(150));
        simple.add(new Jewel(160));



        for (Jewel jewel : simple.getElements()) {
            System.out.println(jewel);
        }

    }
}
