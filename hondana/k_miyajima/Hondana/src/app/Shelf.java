package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Shelf<E extends Item> {
    private int number;
    private ArrayList<E> itemList = new ArrayList<>();

    public E getItem(int index) {
        return this.getItemList().get(index);
    }

    public boolean addItem(E item) {
        return this.getItemList().add(item);
    }

    public Iterator<E> getIterator() {
        return getItemList().iterator();
    }

    public int getNumber() { return this.number; }
    public List<E> getItemList() { return this.itemList; }
}