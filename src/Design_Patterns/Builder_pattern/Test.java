package Design_Patterns.Builder_pattern;

public class Test {
    public static void main(String[] args) {
        DesktopDirector director = new DesktopDirector();

        DesktopBuilder IntelDesktopBuilder = new IntelDesktopBuilder();
        Desktop intelDesktop = director.desktopBuild(IntelDesktopBuilder);

        DesktopBuilder RyzenDesktopBuilder = new RyzenDesktopBuilder();
        Desktop ryzenDesktop = director.desktopBuild(RyzenDesktopBuilder);

        intelDesktop.Display();
        ryzenDesktop.Display();
    }
}
