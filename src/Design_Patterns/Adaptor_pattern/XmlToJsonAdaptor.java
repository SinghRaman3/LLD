package Design_Patterns.Adaptor_pattern;

public class XmlToJsonAdaptor implements AnalyticsTool {
    private final JsonAnalyticsTool jsonAnalyticsTool;

    public XmlToJsonAdaptor() {
        jsonAnalyticsTool = new JsonAnalyticsTool();
        System.out.println("Converting XML to JSON");
        String newData = "json";
        jsonAnalyticsTool.setData(newData);
    }

    @Override
    public void AnalyzeData() {
        jsonAnalyticsTool.AnalyzeData();
    }
}
