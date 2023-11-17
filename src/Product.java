public abstract class Product {
//название, описание, цена, создано на
    public static long ID = 1;
    private long id;
    private String name;
    private String description;
    private int price;
    private String created_at;

    public Product( String name, String description, int price, String created_at) {
        this.id = ID++;
        this.name = name;
        this.description = description;
        this.price = price;
        this.created_at = created_at;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public abstract Product []  addNewProduct(Product [] products,Product product);
    @Override
    public String toString() {
        return "Product " +
                "name = " + name +
                ", description = " + description +
                ", price = " + price +
                ", created at = " + created_at + "\n";
    }
}