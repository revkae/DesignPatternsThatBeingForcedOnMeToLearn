package Composite;

public class System {
    public static void main(String[] args) {
        FileSystemComponent resume = new File("resume.pdf", 250_000);
        FileSystemComponent vacationPhoto = new File("vacation.jpg", 1_500_000);
        FileSystemComponent draftDoc = new File("draft.txt", 12_000);
        FileSystemComponent budgetSheet = new File("budget.xlsx", 85_000);

        Directory documents = new Directory("Documents");
        Directory photos = new Directory("Photos");
        Directory root = new Directory("Root");

        documents.add(resume);
        documents.add(draftDoc);
        documents.add(budgetSheet);

        photos.add(vacationPhoto);

        root.add(documents);
        root.add(photos);
        root.add(new File("README.md", 3_000));

        java.lang.System.out.println("File System Structure:");
        java.lang.System.out.println("File System Structure:");
        root.display(0);

        java.lang.System.out.println("\nStorage Analysis:");
        java.lang.System.out.println("Documents size: " + documents.getSize() + " bytes");
        java.lang.System.out.println("Photos size: " + photos.getSize() + " bytes");
        java.lang.System.out.println("Total size: " + root.getSize() + " bytes");
    }
}
