package Design_Patterns.Builder_pattern;

public class IntelDesktopBuilder implements DesktopBuilder {
    Desktop desktop = new Desktop();

    @Override
    public void buildMotherboard() {
        desktop.setMotherboard("Z690");
    }

    @Override
    public void buildCPU() {
        desktop.setProcessor("Intel Core i9 13th gen");
    }

    @Override
    public void buildGPU() {
        desktop.setGraphicsCard("Nvidia 4070");
    }

    @Override
    public void buildRam() {
        desktop.setRam("16GB DDR4 Ram");
    }

    @Override
    public void buildStorage() {
        desktop.setStorage("512GB M.2 NVMe SSD");
    }

    @Override
    public Desktop getDesktop() {
        return desktop;
    }
}
