public class Book extends Product{
    public static long ID = 1;
    private long id;
    private String authorFullName;
    public Book(String name, String description, int price, String created_at,String authorFullName) {
        super(name, description, price, created_at);
        this.id = ID++;
        this.authorFullName = authorFullName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    @Override
    public Product[] addNewProduct(Product[] products, Product product) {
        return new Product[0];
    }

    @Override
    public String toString() {
        return "Book " +
                "author full name = " + authorFullName +
                super.toString() + "\n";
    }
}
