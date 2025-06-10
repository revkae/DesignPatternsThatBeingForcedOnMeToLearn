package Builder.Easier;

public class PCBuilder {

    public static void main(String[] args) {
        Builder builder = new Builder();
        Computer computer = builder.setCPU("Intel i7")
                                   .setRAM("16GB")
                                   .setStorage("512GB SSD")
                                   .build();

        System.out.println("Computer built with:");
        System.out.println("CPU: " + computer.CPU);
        System.out.println("RAM: " + computer.RAM);
        System.out.println("Storage: " + computer.storage);
    }
}
