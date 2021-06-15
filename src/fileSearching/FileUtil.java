package fileSearching;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input 1 for findLines");
        System.out.println("please input 2 for printSizeOfPackage");
        System.out.println("please input 3 for createFileWithContent");
        int command = Integer.parseInt(scanner.nextLine());
        switch (command){
            case 1:
                System.out.println("please input text path");
                String textPath = scanner.nextLine();
                System.out.println("please input keyword");
                String keyword = scanner.nextLine();
                try {
                    findLines(textPath, keyword);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.println("please input path for printSizeOfPackage");
                String path = scanner.nextLine();
                printSizeOfPackage(path);
                break;
            case 3:
                System.out.println("please input pathName");
                String pathName = scanner.nextLine();
                System.out.println("please input fileName");
                String fileName = scanner.nextLine();
                System.out.println("please input content");
                String content = scanner.nextLine();
                createFileWithContent(pathName, fileName, content);
        }

    }

    private static void findLines(String txtPath, String keyword) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains(keyword)) {
                System.out.println(line);
            }
        }
    }

    private static void printSizeOfPackage(String path) {
        File file = new File(path);
        File[] fileArray = file.listFiles();
        int num = 0;
        for (File file1 : fileArray) {

            num += file1.length();

        }
        System.out.println(num);
    }

    private static void createFileWithContent(String path, String filename, String content){
            String pathName = path + File.separator + filename + ".txt";
            File file = new File(pathName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();

        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
