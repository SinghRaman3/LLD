package Design_Patterns.Builder_pattern;

public interface DesktopBuilder {
    public void buildMotherboard();
    public void buildCPU();
    public void buildGPU();
    public void buildRam();
    public void buildStorage();
    public Desktop getDesktop();
}
