import com.sun.istack.internal.NotNull;

import java.util.*;

public class MyJewelList implements List<Jewel> {

    private static final int INIT_SIZE = 15;
    private static final float INCREASE_SIZE = 0.3f;

    private Jewel[] circlet;
    private int size;

    static void separator(String title) {
        System.out.println("========" + title + "========");
    }

    MyJewelList() {
        circlet = new Jewel[INIT_SIZE];
        size = 0;
    }

    MyJewelList(Jewel Jewel) {
        this();
        add(Jewel);
    }

    public MyJewelList(Collection<Jewel> collection) {
        this();
        /*
         for (Jewel o : collection) {
         add(o);
         }
         **/
        this.addAll(collection);
    }

    Jewel[] getCirclet() {
        return circlet;
    }

    @Override
    public Jewel[] toArray() {
        return Arrays.copyOf(circlet, size);
    }

    @Override
    public <jewel> jewel[] toArray(@NotNull jewel[] jewel) {
        if (!(jewel instanceof MyJewelList[])) throw new ArrayStoreException();
        if (this.size() > jewel.length) {
            return (jewel[]) this.toArray();
        }

        int i = 0;
        for (Object obj : this.toArray()) {
            jewel[i] = (jewel) obj;
            ++i;
        }
        return jewel;
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
        System.arraycopy(circlet, 0, newcirclet, 0, circlet.length);
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
        for (Jewel jewel : this) {
            if (jewel.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Jewel> iterator() {
        return new Iterator<Jewel>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Jewel next() {
                return circlet[index++];
            }
        };
    }

    @Override
    public void clear() {
        size = 0;
    }


    @Override
    public boolean remove(Object o) {
        if (o == null) {
            throw new NullPointerException();
        } else {
            int index = indexOf(o);
            if (index == -1) {
                return false;
            }
            remove(index);
            return true;
        }
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        if (c == null) throw new NullPointerException();
        for (Object d : c) {
            if (!this.contains(d)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends Jewel> c) {
        if (circlet.length == size) {
            resize();
        }
        for (Jewel o : c) this.add(o);
        return true;
    }

    @Override
    public boolean addAll(int index, @NotNull Collection<? extends Jewel> c)
            throws IllegalArgumentException {
        if (circlet.length == size) {
            resize();
            if (index > this.size()) {
                throw new IllegalArgumentException();
            } else {
                for (Object obj : c) {
                    this.add((Jewel) obj);
                }
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Object[] a = c.toArray();
        for (Object o : a) {
            if (circlet.equals(o)) {
                remove(circlet);
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if (c == null) throw new NullPointerException();
        for (Jewel jewel : this.circlet) {
            if (!c.contains(jewel) && jewel != null)
                this.remove(jewel);
        }
        return true;
    }


    @Override
    public Jewel get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return circlet[index];
    }

    @Override
    public Jewel set(int index, Jewel jewel) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Jewel res = get(index);
        circlet[index] = jewel;
        return res;
    }

    @Override
    public void add(int index, Jewel element) throws IndexOutOfBoundsException {
        this.set(index + 1, element);
    }

    @Override
    public Jewel remove(int index) {
        if (index < 0 | index > circlet.length) {
            throw new IndexOutOfBoundsException();
        } else {
            Jewel element = get(index);
            if (size - 1 - index >= 0) System.arraycopy(circlet, index + 1, circlet, index, size - 1 - index);
            size--;
            return element;
        }
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size(); i++) {
            if (circlet[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (circlet[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(circlet[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public ListIterator<Jewel> listIterator() {
        return (ListIterator<Jewel>) this.iterator();
    }

    @Override
    public ListIterator<Jewel> listIterator(int index) {
        if (index < 0 || index > this.size())
            throw new IndexOutOfBoundsException();
        ListIterator<Jewel> listIterator = this.listIterator();
        for (int i = 0; i < index; ++i) listIterator.next();
        return listIterator;
    }


    @Override
    public List<Jewel> subList(int fromIndex, int toIndex)
            throws IndexOutOfBoundsException {
        if (fromIndex > toIndex && toIndex > this.size()) {  //&& fromIndex < 0)
            throw new IndexOutOfBoundsException();
        }
        Jewel[] copy = Arrays.copyOfRange(circlet, fromIndex, toIndex);
        return Arrays.asList(copy);
    }


    @Override
    public String toString() {
        return Arrays.toString(circlet);
    }
}
