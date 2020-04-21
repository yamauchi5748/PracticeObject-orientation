package com;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() { return this.index < this.bookShelf.getLength(); }

    public Object next() { return this.bookShelf.getBookAt(this.index++); }
}