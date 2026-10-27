public class Books {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOuTo;


    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getCheckedOuTo() {
        return checkedOuTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkedOuTo='" + checkedOuTo + '\'' +
                '}';
    }

    public Books(int id, String isbn, String title, boolean isCheckedOut, String checkedOuTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOuTo = checkedOuTo;
    }

}
