import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User();

        while (true) {
            menu();
            int d = scanner.nextInt();
            switch (d) {
                case 1:
                    user.Register();
                    break;
                case 2:
                    while (true) {
                        System.out.print("Ведите gmail: ");
                        String gmail = scanner.next();
                        if (gmail.contains(user.getGmail())) break;
                        else {
                            System.out.println("Ваш gmail ведён не провильно!");
                        }
                    }
                    while (true) {
                        System.out.print("Ведитне пароль:");
                        int y = scanner.nextInt();
                        if (y == user.getPassword()) {
                            while (true) {
                                menu2();
                                int o = scanner.nextInt();
                                switch (o) {
                                    case 0:
                                        return;
                                    case 1:

                                        break;
                                    case 2:

                                        break;
                                    case 3:

                                        break;
                                    case 4:

                                        break;
                                }
                            }

                        } else {
                            System.out.println("Ваш пароль ведён не провильно!");
                        }
                    }
                case 3:
                    return;
                default:
                    System.out.println("У вас нету такова вункции!");
            }

        }
    }




    public static void menu(){
        System.out.println("""
                1. Каттоо. Register
                2. Кирүү Login
                3. Чыгyy. Exit
                """);
    }
    public static void menu2(){
        System.out.println("""
                0. Logout             Чыгуу
                1. Add new Product    Жаңы продукт кошуңуз
                2. Get all Products   Бардык продукталарды алыңыз
                3. Get all Book       Бардык китепти алыңыз
                4. Get all            Device Бардык устройстволарды алыңыз
                                
                """);
    }
}
