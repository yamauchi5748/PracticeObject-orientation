package com;

public class App 
{
    public static void main( String[] args )
    {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook( new Book( "Book1" ) );
        bookShelf.appendBook( new Book( "Book2" ) );
        bookShelf.appendBook( new Book( "Book3" ) );
        bookShelf.appendBook( new Book( "Book4" ) );
        Iterator it = bookShelf.iterator();

        while( it.hasNext() ) {
            Book book = (Book)it.next();
            System.out.println( book.getName() );
        }
    }
}
