package composition;

public class File {
    private String nm;
    private Folder parentFld;

    public File(String nm, Folder parentFld) {
        this.nm = nm;
        this.parentFld = parentFld;
        parentFld.addFile(this);
    }

    public String getName() {
        return nm;
    }

    public void setName(String nm) {
        this.nm = nm;
    }

    public Folder getParentFolder() {
        return parentFld;
    }

    public void print() {
        System.out.println("File: " + nm);
    }
}
