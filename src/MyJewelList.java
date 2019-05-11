import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyJewelList implements List<Jewel> {

    private static final int INIT_SIZE = 15;
    private static final float INCREASE_SIZE = 0.3f;

    private Jewel[] circlet;
    private int size;


    public MyJewelList() {
        circlet = new Jewel[INIT_SIZE];
        size = 0;
    }

    public MyJewelList(Jewel Jewel) {
//        circlet = new list.Jewel[INIT_SIZE];
        this();
//        circlet[0] = Jewel;
        add(Jewel);
    }

    public MyJewelList(Collection<Jewel> collection) {
        this();
//        circlet = new list.Jewel[collection.size()];
        for (Jewel o : collection) {
            add(o);
        }
    }

    public Jewel[] getCirclet() {
        return circlet;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Jewel Jewel) {
        if (size == circlet.length) {
            resize();
        }
        circlet[size++] = Jewel;
        return true;
    }

    private void resize() {
        int newSize = (int) (circlet.length *
                (1 + INCREASE_SIZE));
        Jewel[] newcirclet = new Jewel[newSize];
        for (int i = 0; i < circlet.length; i++) {
            newcirclet[i] = circlet[i];
        }
        circlet = newcirclet;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Jewel> iterator() {
        return null;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Jewel> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Jewel> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Jewel get(int index) {
        return null;
    }

    @Override
    public Jewel set(int index, Jewel element) {
        return null;
    }

    @Override
    public void add(int index, Jewel element) {

    }

    @Override
    public Jewel remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Jewel> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Jewel> listIterator(int index) {
        return null;
    }

    @Override
    public List<Jewel> subList(int fromIndex, int toIndex) {
        return null;
    }
}
