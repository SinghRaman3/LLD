package Design_Patterns.Builder_pattern;

public interface DesktopPlan {
    void setMotherboard(String motherboard);
    void setProcessor(String processor);
    void setGraphicsCard(String graphicsCard);
    void setRam(String ram);
    void setStorage(String storage);
    public void Display();
}
