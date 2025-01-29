package src.DirectorySearch.strategies;

import src.DirectorySearch.models.Directory;
import src.DirectorySearch.models.File;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByName implements FilterStrategy {
    private String name;

    public FilterByName(String name) {
        this.name = name;
    }

    @Override
    public List<File> filter(Directory directory) {
        return directory.getFiles().stream()
                .filter(file -> file.getName().contains(name))
                .collect(Collectors.toList());
    }
}