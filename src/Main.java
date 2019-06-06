import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyJewelList jewelListFirst = new MyJewelList();
        Jewel someJewel1 = new Jewel("Ruby", 40, 400, 1);
        Jewel someJewel2 = new Jewel("Ruby", 40, 400, 1);
        jewelListFirst.add(someJewel1);
        MyJewelList jewelListSecond = new MyJewelList(someJewel1);
        MyJewelList jewelListThird = new MyJewelList(jewelListSecond);
        jewelListThird.add(someJewel2);
        jewelListFirst.add(new Jewel("Diamond", 10, 100, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 11, 110, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 12, 120, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 13, 130, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 14, 140, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 15, 150, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 16, 160, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 17, 170, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 18, 180, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 19, 190, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 20, 200, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 21, 210, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 22, 220, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 23, 230, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 24, 240, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 25, 250, 0.5));
        jewelListFirst.add(new Jewel("Diamond", 26, 270, 0.5));



        MyJewelList.separator("Iterator");
        Iterator<Jewel> iterator = jewelListFirst.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        //End printing
        MyJewelList.separator("FirstJewelList");
        for (Jewel jewel : jewelListFirst.getCirclet()) {
            System.out.println(jewel);
        }

        MyJewelList.separator("SecondJewelList");
        for (Jewel jewel : jewelListSecond.getCirclet()) {
            System.out.println(jewel);
        }

        MyJewelList.separator("ThirdJewelList");
        for (Jewel jewel : jewelListThird.getCirclet()) {
            System.out.println(jewel);
        }

    }
}
