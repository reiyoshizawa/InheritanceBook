package InheritanceBook;

public class Dictionary extends Book {

    private int definitions;

    public Dictionary(int pages, int definitions) {
        super(pages);
        this.definitions = definitions;
    }

    /**
     * Definitions Per Page
     * Prints a message using both local and inherited
     * @return
     */
    public double computeRatio() {
        return definitions / pages;
    }

    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }

    public void printInfo() {
        System.out.println("This is a dictionary with "
        + pages + " pages per ");
        System.out.println("This book has " + computeRatio() +
        "definition per page.");
    }
}
