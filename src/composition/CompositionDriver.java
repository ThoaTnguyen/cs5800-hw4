package composition;

public class CompositionDriver {
    public static void main(String[] args) {
        System.out.println("\nCOMPOSITION\n");

        Folder root = buildFileSystem();

        System.out.println("Initial structure:");
        root.print();

        System.out.println("\nAfter deleting folder 'app':");
        Folder.deleteFolderByName(root, "app");
        root.print();

        System.out.println("\nAfter deleting folder 'public':");
        Folder.deleteFolderByName(root, "public");
        root.print();
    }

    private static Folder buildFileSystem() {
        Folder root = new Folder("php_demo1");
        Folder srcF = new Folder("Source Files", root);

        new Folder(".phalcon", srcF);

        Folder app = new Folder("app", srcF);
        new Folder("config", app);
        new Folder("controllers", app);
        new Folder("library", app);
        new Folder("migrations", app);
        new Folder("models", app);
        new Folder("views", app);

        new Folder("cache", srcF);
        new Folder("public", srcF);

        new File(".htaccess", srcF);
        new File(".htrouter.php", srcF);
        new File("index.html", srcF);

        return root;
    }
}
