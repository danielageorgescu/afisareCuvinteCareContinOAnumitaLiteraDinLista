package com.itfactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
    try{
        Path path = Paths.get("cuvinte.txt");
        List<String> textLines= Files.readAllLines(path);

        if (!textLines.isEmpty()){
            System.out.println(textLines);
            char deEvidentiat = 'a';
            String contineChar = String.valueOf(deEvidentiat);

            System.out.println("Urmatoarele cuvinte din fisierul ales contin litera \"a\": ");

            for(String contineA: textLines){
                if(contineA.contains(contineChar)){
                     System.out.println(contineA);
                }
            }
        } else {
            System.out.println("Fisierul gasit nu contine informatii. Va rugam sa verificati fisierul.");
        }

    }catch (IOException e){
        System.out.println("Fisierul nu exista.");
}



    }
}
