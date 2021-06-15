package fileSearching;

import java.io.*;
import java.util.Scanner;

public class ContentSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input name for searching");
        String contentSearchByName = scanner.nextLine();
        File file = new File(path);
        String[] str = file.list();

        for (String s : str) {
           String path1 = path + File.separator + s;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    if(line.contains(contentSearchByName)  ){
                        System.out.println(s);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }



        }
    }
    
}
