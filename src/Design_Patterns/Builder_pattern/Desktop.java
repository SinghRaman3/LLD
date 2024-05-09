package Design_Patterns.Builder_pattern;

public class Desktop implements DesktopPlan{
    String motherboard;
    String processor;
    String graphicsCard;
    String ram;
    String storage;

    @Override
    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public void Display(){
        System.out.print("Your desktop specs: ");
        System.out.print(" Motherboard: " + motherboard);
        System.out.print(", Processor: " + processor);
        System.out.print(", GraphicsCard: " + graphicsCard);
        System.out.print(", Ram: " + ram);
        System.out.println(", Storage: " + storage);
    }
}
