package author;

import java.util.Scanner;

public class AuthorStorage {
    Author[] authors = new Author[10];
    int size = 0;

    void add(Author author) {
        if (size > authors.length - 1) {
            extend();
        } else {
            authors[size] = author;

            size++;
        }
    }

    private void extend() {
        Author[] newAuthor = new Author[size + 10];
        for (int i = 0; i < size; i++) {
            newAuthor[i] = authors[i];

        }
        authors = newAuthor;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }

    }

    Author createAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("surname");
        String surname = scanner.nextLine();
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("gender");
        String gender = scanner.nextLine();
        System.out.println("age");
        int age = scanner.nextInt();
        Author author = new Author();
        author.setName(name);
        author.setSurname(surname);
        author.setEmail(email);
        author.setAge(age);
        author.setGender(gender);
        return author;
    }

}
