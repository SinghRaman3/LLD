package Design_Patterns.Adaptor_pattern;

public class Test {
    public static void main(String[] args) {
        String data = "xml";

        XmlAnalyticsTool xmlAnalyticsTool = new XmlAnalyticsTool();
        xmlAnalyticsTool.setData(data);
        xmlAnalyticsTool.AnalyzeData();

        JsonAnalyticsTool jsonAnalyticsTool = new JsonAnalyticsTool();
        jsonAnalyticsTool.setData(data);
        jsonAnalyticsTool.AnalyzeData();

        AnalyticsTool adaptor = new XmlToJsonAdaptor();
        adaptor.AnalyzeData();
    }
}
