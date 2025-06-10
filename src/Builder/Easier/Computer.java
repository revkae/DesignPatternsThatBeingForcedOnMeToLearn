package Builder.Easier;

public class Computer {

    public String CPU;
    public String RAM;
    public String storage;

    public Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }
}
