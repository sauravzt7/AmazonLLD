package src.DirectorySearch.services;

import src.DirectorySearch.models.File;

import java.util.List;

public class ShowResults {


    public static void show(List<File> files){
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
