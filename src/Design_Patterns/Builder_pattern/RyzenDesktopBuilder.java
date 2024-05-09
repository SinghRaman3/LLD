package Design_Patterns.Builder_pattern;

public class RyzenDesktopBuilder implements DesktopBuilder{
    Desktop desktop = new Desktop();

    @Override
    public void buildMotherboard() {
        desktop.setMotherboard("X670");
    }

    @Override
    public void buildCPU() {
        desktop.setProcessor("Ryzen 9 7900");
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

    public Desktop getDesktop() {
        return desktop;
    }
}
