package InheritanceBook;

public class Book {
    protected int pages;

    public Book(int pages) {
        this.pages = pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void printInfo() {
        System.out.println("This is a book with "
        + pages + " pages.");
    }

}
