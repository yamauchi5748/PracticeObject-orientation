package app;

public class Book extends Item{
    private String text;
    private String isbn;
    private String author;

    public String getText() { return this.text; }
    public void setText(String text) { this.text = text; }

    public String getISBN() { return this.isbn; }
    public void setISBN(String isbn) { this.isbn = isbn; }

    public String getAuthor() { return this.author; }
    public void setAuthor(String author) { this.author = author; }
}