package src.DirectorySearch.models;

import java.util.List;

public class Directory {
    private List<File> files;

    public Directory(List<File> files) {
        this.files = files;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
