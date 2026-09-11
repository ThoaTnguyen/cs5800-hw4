package composition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder {
    private String nm;
    private Folder parentFld;
    private final List<File> fls = new ArrayList<>();
    private final List<Folder> subFlds = new ArrayList<>();

    public Folder(String nm) {
        this(nm, null);
    }

    public Folder(String nm, Folder parentFld) {
        this.nm = nm;
        this.parentFld = parentFld;
        if (parentFld != null) {
            parentFld.addSubFolder(this);
        }
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

    public List<File> getFiles() {
        return fls;
    }

    public List<Folder> getSubFolders() {
        return subFlds;
    }

    void addFile(File f) {
        if (!fls.contains(f)) {
            fls.add(f);
        }
    }

    void addSubFolder(Folder fld) {
        if (!subFlds.contains(fld)) {
            subFlds.add(fld);
        }
    }

    public void delete() {
        if (parentFld != null) {
            parentFld.removeSubFolder(this);
        }
        parentFld = null;
        fls.clear();
        subFlds.clear();
    }

    private void removeSubFolder(Folder fld) {
        subFlds.remove(fld);
    }

    public Folder findSubFolder(String fn) {
        for (Folder sf : subFlds) {
            if (sf.getName().equals(fn)) {
                return sf;
            }
        }
        return null;
    }

    public void print() {
        print(0);
    }

    private void print(int d) {
        System.out.println("  ".repeat(d) + "Folder: " + nm);

        for (Folder sf : subFlds) {
            sf.print(d + 1);
        }

        for (File f : fls) {
            System.out.print("  ".repeat(d + 1));
            f.print();
        }
    }

    public static void deleteFolderByName(Folder root, String fn) {
        deleteFolderRecursive(root, fn);
    }

    private static boolean deleteFolderRecursive(Folder cur, String fn) {
        Iterator<Folder> it = cur.subFlds.iterator();
        while (it.hasNext()) {
            Folder sf = it.next();
            if (sf.getName().equals(fn)) {
                sf.parentFld = null;
                sf.fls.clear();
                sf.subFlds.clear();
                it.remove();
                return true;
            }
            if (deleteFolderRecursive(sf, fn)) {
                return true;
            }
        }
        return false;
    }
}
