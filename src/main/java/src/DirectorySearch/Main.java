package src.DirectorySearch;

import src.DirectorySearch.models.Directory;
import src.DirectorySearch.models.File;
import src.DirectorySearch.services.FilterService;
import src.DirectorySearch.strategies.FilterByName;
import src.DirectorySearch.strategies.FilterBySize;

import java.util.List;

import static src.DirectorySearch.services.ShowResults.show;


public class Main {
    public static void main(String[] args) {

        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 50);
        File file3 = new File("file3.txt", 60);

        Directory directory = new Directory(List.of(file1, file2, file3));

        FilterService filterService = new FilterService(new FilterByName("file"));
        filterService.setFilterStrategy(new FilterBySize(30));

        List<File> filteredFiles = filterService.filter(directory);

        show(filteredFiles);


    }
}
