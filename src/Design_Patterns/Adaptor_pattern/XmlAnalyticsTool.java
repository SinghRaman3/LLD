package Design_Patterns.Adaptor_pattern;

public class XmlAnalyticsTool implements AnalyticsTool {
    String data;
    public void setData(String data) {
        this.data = data;

    }

    @Override
    public void AnalyzeData() {
        if(data.contains("xml")) System.out.println("Analyzing XML Data");
        else System.out.println("Format not supported. Use json format.");
    }
}