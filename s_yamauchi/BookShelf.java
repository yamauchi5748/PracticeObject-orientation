public class BookShelf extends Shelf {
    private String id = "";

    public Book() {
        this.id = createId();
    }

    public String getId() {
        return this.id;
    }
}