package author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        AuthorStorage authorStorage = new AuthorStorage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many authors are you have");
        int num = scanner.nextInt();
        for (int i = 0; i <num; i++) {

           authorStorage.add(authorStorage.createAuthor());
        }
        authorStorage.print();

    }
}
