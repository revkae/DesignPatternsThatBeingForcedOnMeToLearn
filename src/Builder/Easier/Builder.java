package Builder.Easier;

public class Builder {
    public String CPU;
    public String RAM;
    public String storage;

    public Builder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public Builder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public Builder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }
}
