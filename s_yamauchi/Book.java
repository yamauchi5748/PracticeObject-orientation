public class Book {
    private String id = "";
    private String shelf_id = "";
    private String name = "";

    public Book(String shelf_id, String name) {
        this.id = createId();
        this.shelf_id = shelf_id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getShelfId() {
        return this.shelf_id;
    }
    public String setShelfId(String shelf_id) {
        this.shelf_id = shelf_id;
    }

    public String getName() {
        return this.shelf_id;
    }
    public String setName(String name) {
        this.name = name;
    }

}