package src.DirectorySearch.services;

import src.DirectorySearch.models.Directory;
import src.DirectorySearch.models.File;
import src.DirectorySearch.strategies.FilterStrategy;

import java.util.List;

public class FilterService {

    private FilterStrategy filterStrategy;

    public FilterService(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }
    public FilterStrategy getFilterStrategy() {
        return filterStrategy;
    }


    public List<File> filter(Directory directory) {
        List<File> filterResult = filterStrategy.filter(directory);
        return filterResult;
    }

}
