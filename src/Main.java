import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyJewelList simple = new MyJewelList();
        simple.add(new Jewel("Diamond", 10, 100, 0.5));
        simple.add(new Jewel("Diamond", 11, 110, 0.5));
        simple.add(new Jewel("Diamond", 12, 120, 0.5));
        simple.add(new Jewel("Diamond", 13, 130, 0.5));
        simple.add(new Jewel("Diamond", 14, 140, 0.5));
        simple.add(new Jewel("Diamond", 15, 150, 0.5));
        simple.add(new Jewel("Diamond", 16, 160, 0.5));
        simple.add(new Jewel("Diamond", 17, 170, 0.5));
        simple.add(new Jewel("Diamond", 18, 180, 0.5));
        simple.add(new Jewel("Diamond", 19, 190, 0.5));
        simple.add(new Jewel("Diamond", 20, 200, 0.5));
        simple.add(new Jewel("Diamond", 21, 210, 0.5));
        simple.add(new Jewel("Diamond", 22, 220, 0.5));
        simple.add(new Jewel("Diamond", 23, 230, 0.5));
        simple.add(new Jewel("Diamond", 24, 240, 0.5));
        simple.add(new Jewel("Diamond", 25, 250, 0.5));
        simple.add(new Jewel("Diamond", 26, 270, 0.5));


        for (Jewel jewel : simple.getCirclet()) {
            System.out.println(jewel);
        }


        System.out.println("=============");
        Iterator<Jewel> iterator = simple.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
