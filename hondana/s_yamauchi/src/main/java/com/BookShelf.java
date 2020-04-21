package com;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
       this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) { return this.books[index]; }

    public int getLength() { return this.last; }

    public void appendBook(Book book) { this.books[this.last++] = book; }
    
    public Iterator iterator() { return new BookShelfIterator(this); }
}