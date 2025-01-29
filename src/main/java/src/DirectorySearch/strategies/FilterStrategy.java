package src.DirectorySearch.strategies;

import src.DirectorySearch.models.Directory;
import src.DirectorySearch.models.File;

import java.util.List;

public interface FilterStrategy {
    public List<File> filter(Directory directory);
}
