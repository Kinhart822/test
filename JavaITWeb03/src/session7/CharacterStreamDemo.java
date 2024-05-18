/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        String str = "Java Core ";

        try(Writer writer = new FileWriter("character.txt", true)){
            writer.write(str);
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            readFile("character.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFile(String file) throws FileNotFoundException, IOException {
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line;
//
//        while((line = bufferedReader.readLine()) != null){
//            System.out.println(line);
//        }

        try(Stream<String> lines = Files.lines(Path.of(file))){
            lines.forEach(line -> {
                System.out.println(line);
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
