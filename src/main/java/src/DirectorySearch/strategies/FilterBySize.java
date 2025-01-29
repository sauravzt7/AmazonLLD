package src.DirectorySearch.strategies;

import src.DirectorySearch.models.Directory;
import src.DirectorySearch.models.File;

import java.util.ArrayList;
import java.util.List;

public class FilterBySize implements FilterStrategy {

    private int size;

    public FilterBySize(int size) {
        this.size = size;
    }

    @Override
    public List<File> filter(Directory directory) {

        List<File> filterResult = new ArrayList<>();
        for(File file: directory.getFiles()){
            if(file.getSize() > size){
                filterResult.add(file);
            }
        }
        return filterResult;
    }
}
