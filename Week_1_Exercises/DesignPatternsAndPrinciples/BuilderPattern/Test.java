public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setPowerSupply("750W")
                .setMotherboard("Asus ROG Strix")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        // Print out the configurations
        System.out.println("Gaming Computer Configuration:");
        System.out.println("CPU: " + gamingComputer.getCPU());
        System.out.println("RAM: " + gamingComputer.getRAM());
        System.out.println("Storage: " + gamingComputer.getStorage());
        System.out.println("GPU: " + gamingComputer.getGPU());
        System.out.println("Power Supply: " + gamingComputer.getPowerSupply());
        System.out.println("Motherboard: " + gamingComputer.getMotherboard());

        System.out.println("\nOffice Computer Configuration:");
        System.out.println("CPU: " + officeComputer.getCPU());
        System.out.println("RAM: " + officeComputer.getRAM());
        System.out.println("Storage: " + officeComputer.getStorage());
        System.out.println("GPU: " + officeComputer.getGPU());  // Might be null if not set
        System.out.println("Power Supply: " + officeComputer.getPowerSupply());  // Might be null if not set
        System.out.println("Motherboard: " + officeComputer.getMotherboard());  // Might be null if not set
    }
}
