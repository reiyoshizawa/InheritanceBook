package InheritanceBook;

public class Words {
    public static void main(String[] args) {
//        Dictionary webster = new Dictionary();
//        webster.setDefinitions(50000);
//        webster.setPages(5200);
//        System.out.println("Number of pages: " + webster.getPages());
//        System.out.println("Number of Definitions: " + webster.getDefinitions());
//        System.out.println("Definitions per pages: " + webster.computeRatio());
        Book book1 = new Book(100);
        Dictionary dict1 = new Dictionary(1000,500);

        book1.printInfo();
        dict1.printInfo();

    }
}
