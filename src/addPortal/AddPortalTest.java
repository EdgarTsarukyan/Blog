package addPortal;

import addPortal.enums.Categorys;
import addPortal.interfaces.Commands;
import addPortal.model.AD;
import addPortal.model.User;
import addPortal.storage.UserStorage;
import blog.Category;

import java.util.Scanner;

public class AddPortalTest {
    static Scanner scanner = new Scanner(System.in);
    static UserStorage userStorage = new UserStorage();
    static User user;

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Pleas input " + Commands.EXIT + " for Exit");
            System.out.println("Pleas input " + Commands.LOGIN + " for Login");
            System.out.println("Pleas input " + Commands.REGISTER + " for Register");

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case Commands.EXIT:
                    run = false;
                    break;
                case Commands.LOGIN:

                    System.out.println("Pleas input your phonNumber");
                    String phonNumber = scanner.nextLine();
                    System.out.println("Pleas input your password");
                    String password = scanner.nextLine();
                    boolean isLogin = userStorage.login(phonNumber, password);
                    user = userStorage.getUser(phonNumber);//usern e
                    while (isLogin) {
                        System.out.println("Pleas input " + Commands.LOGOUT + " for Logout");
                        System.out.println("Pleas input " + Commands.ADD_NEW_AD + " for ADD_NEW_AD");
                        //avelcra case_i mej
                        System.out.println("Pleas input " + Commands.PRINT_MY_ALL_ADS + " for PRINT MY ALL ADS");
                        System.out.println("Pleas input " + Commands.PRINT_ALL_ADS + " for PRINT_ALL_ADS");
                        System.out.println("Pleas input " + Commands.PRINT_AD_BY_CATEGORY + " for PRINT_AD_BY_CATEGORY");
                        System.out.println("Pleas input " + Commands.DELETE_MY_ALL_ADS + " for DELETE_MY_ALL_ADS");
                        System.out.println("Pleas input " + Commands.DELETE_AD_BY_TITLE + " for DELETE_AD_BY_TITLE");
                        int command1 = Integer.parseInt(scanner.nextLine());
                        switch (command1) {
                            case Commands.LOGOUT:
                                isLogin = false;
                                break;
                            case Commands.ADD_NEW_AD:
                                addNewAd();
                                break;
                        }

                    }
                    break;
                case Commands.REGISTER:
                    register();
                    break;

            }
        }


    }

    private static void addNewAd() {
        AD ad = new AD();
        System.out.println("Pleas input title");
        String title = scanner.nextLine();
        ad.setTitle(title);
        System.out.println("Pleas input text");
        String text = scanner.nextLine();
        ad.setText(text);
        System.out.println("Pleas input price");
        double price = Double.parseDouble(scanner.nextLine());
        ad.setPrice(price);
        System.out.println("Pleas input category");
        Categorys category = Categorys.valueOf(scanner.nextLine());
        ad.setCategory(category);
        ad.setAuthor(user);


    }

    private static void register() {
        User user = new User();

        System.out.println("Pleas input name");
        String name = scanner.nextLine();
        user.setName(name);
        System.out.println("Pleas input surname");
        String surname = scanner.nextLine();
        user.setSurNAme(surname);
        System.out.println("Pleas input gender");
        String gender = scanner.nextLine();
        user.setGender(gender);
        System.out.println("Pleas input age");
        int age = Integer.parseInt(scanner.nextLine());
        user.setAge(age);
        System.out.println("Pleas input phonNumber");
        String phonNumber = scanner.nextLine();
        user.setPhonNumber(phonNumber);
        System.out.println("Pleas input PassWord");
        String PassWord = scanner.nextLine();
        user.setPassword(PassWord);
        userStorage.Add(user);


    }


}
