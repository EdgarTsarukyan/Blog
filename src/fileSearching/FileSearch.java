package fileSearching;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input file name");
        String filename = scanner.nextLine();

        File file = new File(path);
        String[] s = file.list();
        boolean b = false;
        for (String s1 : s) {
            if (s1.equals(filename)) {
                b = true;
                break;
            }


        }
        System.out.println(b);
    }


}


