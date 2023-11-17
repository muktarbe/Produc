public class Devais extends Product{
    //brand, color, is New, memory
    // бренд, цвет, новый, память
    public static long ID = 1;
    private long id;
    private String brand;
    private String color;
    private boolean is_new;
    private int memory;


    public Devais(String name, String description, int price, String created_at,
                  String brand, String color, boolean is_new, int memory) {
        super(name, description, price, created_at);
        this.id = ID++;
        this.brand = brand;
        this.color = color;
        this.is_new = is_new;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIs_new() {
        return is_new;
    }

    public void setIs_new(boolean is_new) {
        this.is_new = is_new;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public Product[] addNewProduct(Product[] products, Product product) {
        return new Product[0];
    }

    @Override
    public String toString() {
        return "Devais " +
                "brand = " + brand +
                ", color = " + color +
                ", is new = " + is_new +
                ", memory = " + memory +
                super.toString() +"\n" ;
    }
}
