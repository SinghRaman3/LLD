package Design_Patterns.Adaptor_pattern;

public class JsonAnalyticsTool implements AnalyticsTool {
    String data;
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void AnalyzeData() {
        if(data.contains("json")) System.out.println("Analyzing Json Data");
        else System.out.println("Format not supported. Use json format.");
    }
}
