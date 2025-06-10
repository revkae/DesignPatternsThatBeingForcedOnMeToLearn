package Composite;

public interface FileSystemComponent {
    void display(int indent);
    long getSize();
    void add(FileSystemComponent component);
    void remove(FileSystemComponent component);
}
