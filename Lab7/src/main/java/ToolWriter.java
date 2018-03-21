import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ToolWriter {
    public void writeToFile(List<Tool> tools) {
        try (PrintWriter writer = new PrintWriter("file.csv")) {

            for (Tool tool: tools) {
                writer.println(tool.toCSV());
                writer.println(tool.getHeaders());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
