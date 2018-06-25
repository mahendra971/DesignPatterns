package Bridge.Movie;

import java.util.List;

public class PrintFormatter implements Formatter {
    public String format(String header, List<Detail> details) {
        StringBuilder data = new StringBuilder();

        data.append(header);
        data.append("\n");
        for(Detail dt:details)
        {
            data.append(dt.getLable());
            data.append(":");
            data.append(dt.getValue());
            data.append("\n");
        }
        return data.toString();
    }
}
