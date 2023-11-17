import java.util.Arrays;
import java.util.Scanner;

public class User {
    private String first_name;
    private String lsat_name;
    private String gmail;
    private int password;
    private Product [] products;

    public User() {
    }

    public User(String first_name, String lsat_name, String gmail, int password, Product[] products) {
        this.first_name = first_name;
        this.lsat_name = lsat_name;
        this.gmail = gmail;
        this.password = password;
        this.products = products;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLsat_name() {
        return lsat_name;
    }

    public void setLsat_name(String lsat_name) {
        this.lsat_name = lsat_name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void Register(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите фмилию: ");
        setFirst_name(scanner.next());
        System.out.print("Ведите имя: ");
        setLsat_name(scanner.next());
       while (true){
           System.out.print("Ведите gmail: ");
           setGmail(scanner.next());
           if (getGmail().contains("@gmail.com")) break;
           else {
               System.out.println("Ваш gmail должен содержать (@gmail.com)!");
           }
       }
        System.out.print("Ведите пароль :");
        this.password = scanner.nextInt();
    }
    public void  Add_new_Product(Product [] products ,Product product){

    }

    @Override
    public String toString() {
        return "User " +
                "first name = " + first_name +
                ", lsat name = " + lsat_name +
                ", gmail = " + gmail +
                ", password = " + password +
                ", products = " + Arrays.toString(products) + "\n";
    }
}
