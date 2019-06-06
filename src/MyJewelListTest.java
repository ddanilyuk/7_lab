import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;


public class MyJewelListTest {
    private Jewel diamond1 = new Jewel("Diamond1", 10, 20, 1);
    private MyJewelList one = new MyJewelList();
    private Jewel diamond2 = new Jewel("Diamond2", 20, 30, 1);
    private MyJewelList another = new MyJewelList();
    private Jewel diamond3 = new Jewel("Diamond3", 30, 40, 0.4);

    @Test
    public void size() {
        one.add(diamond2);
        int expected = 1;
        int actual = one.size();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isEmpty() {
        one.add(diamond1);
        Assert.assertFalse(one.isEmpty());
        Assert.assertTrue(another.isEmpty());
    }


    @Test
    public void contains() {
        one.add(diamond1);
        Assert.assertTrue(one.contains(diamond1));
        Assert.assertFalse(one.contains(diamond2));
    }

    @Test
    public void iterator() {
        another.add(diamond1);
        another.add(diamond2);
        another.add(diamond3);
        Iterator<Jewel> iter = another.iterator();
        Assert.assertTrue(iter.hasNext());
        Assert.assertEquals(diamond1, iter.next());
        Assert.assertEquals(diamond2, iter.next());
        Assert.assertEquals(diamond3, iter.next());
        Assert.assertFalse(iter.hasNext());
    }

    @Test
    public void toArray() {
        another.add(diamond1);
        another.add(diamond2);
        Object[] arr = another.toArray();
        Assert.assertEquals((arr[0]), diamond1);
        Assert.assertEquals((arr[1]), diamond2);
    }


    @Test
    public void add() {
        Assert.assertTrue(one.add(diamond1));
    }


    @Test
    public void remove() {
        one.add(diamond2);
        Assert.assertTrue(one.remove(diamond2));
    }

    @Test
    public void addAll() {
        another.add(diamond1);
        another.add(diamond2);
        Assert.assertTrue(one.addAll(another));
    }


    @Test
    public void removeAll() {
        another.add(diamond1);
        another.add(diamond2);
        one.add(diamond1);
        Assert.assertTrue(another.removeAll(one));

    }

    @Test
    public void containsAll() {
        another.add(diamond1);
        another.add(diamond2);
        one.add(diamond3);
        Assert.assertFalse(another.containsAll(one));
    }

    @Test
    public void retainAll() {
        ArrayList<Jewel> test = new ArrayList<>();
        test.add(diamond1);
        test.add(diamond3);
        test.add(diamond2);
        another.addAll(test);
        Assert.assertTrue(another.retainAll(test));
        Assert.assertEquals(3, another.size());
    }


    @Test
    public void clear() {
        another.add(diamond1);
        another.clear();
        Assert.assertEquals(0, another.size());
    }

    @Test
    public void get() {
        another.add(diamond1);
        another.add(diamond2);
        Assert.assertEquals(diamond1, another.get(0));
        Assert.assertEquals(diamond2, another.get(1));
    }

    @Test
    public void set() {
        another.add(diamond2);
        another.set(0, diamond1);
        Assert.assertEquals(another.get(0), diamond1);
    }

    @Test
    public void indexOf() {
        one.add(diamond1);
        Assert.assertEquals(0, one.indexOf(diamond1));
        Assert.assertEquals(-1, one.indexOf(diamond2));
    }

    @Test
    public void lastIndexOf() {
        one.add(diamond1);
        one.add(diamond2);
        Assert.assertEquals(1, one.lastIndexOf(diamond2));
        Assert.assertEquals(-1, one.indexOf(diamond3));
    }

    @Test
    public void listIterator() {
        another.add(diamond1);
        another.add(diamond2);
        another.add(diamond3);
        Iterator<Jewel> iter = another.iterator();
        Assert.assertTrue(iter.hasNext());
        Assert.assertEquals(diamond1, iter.next());
        Assert.assertEquals(diamond2, iter.next());
        Assert.assertEquals(diamond3, iter.next());
        Assert.assertFalse(iter.hasNext());
    }


    @Test
    public void subList() {
        another.add(diamond1);
        another.add(diamond2);
        another.add(diamond3);
        one.add(diamond2);
        one.add(diamond1);
        one.add(diamond3);
        Assert.assertEquals(one.subList(1, 2), another.subList(0, 1));
    }

}