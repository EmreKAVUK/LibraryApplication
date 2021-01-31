package libraryproject;
public class Columns {
    private int books_code;
    private String name;
    private String author;
    private String Selected;
    private int page;
    private String date;

    public Columns(int books_code, String name, String author, String type, int page, String date) {
        this.books_code = books_code;
        this.name = name;
        this.author = author;
        this.Selected = type;
        this.page = page;
        this.date = date;
    }

    public int getBooks_code() {
        return books_code;
    }

    public void setBooks_code(int books_code) {
        this.books_code = books_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String Selected() {
        return Selected;
    }

    public void Selected(String Selected) {
        this.Selected = Selected;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }
    public String getSelected(){
        return  Selected;
    }
    public void setSelected(String Selected){
        this.Selected = Selected;
    }

}
