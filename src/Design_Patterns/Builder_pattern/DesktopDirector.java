package Design_Patterns.Builder_pattern;

public class DesktopDirector {
    public Desktop desktopBuild(DesktopBuilder builder){
        builder.buildMotherboard();
        builder.buildCPU();
        builder.buildGPU();
        builder.buildRam();
        builder.buildStorage();

        return builder.getDesktop();
    }
}
