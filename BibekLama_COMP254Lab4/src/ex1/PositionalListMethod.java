package ex1;

import java.util.Iterator;
import java.util.LinkedList;

public class PositionalListMethod<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void add(E e) {
        list.add(e);
    }

    public int indexOf(E element) {
        int index = 0;
        for (E item : list) {
            if (item.equals(element)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return list.iterator();
    }
}
