package Bridge.Movie;

import java.util.List;

public class HTMLFormat implements  Formatter{
    public String format(String header, List<Detail> details) {
        StringBuilder data = new StringBuilder();
        data.append("<name>");
        data.append(header);
        data.append("</name>");
        data.append("\n");

        for(Detail dt : details){
            data.append("<"+dt.getLable() + ">");
            data.append(dt.getValue());
            data.append("</"+dt.getLable() + ">");
            data.append("\n");

        }
        return data.toString();
    }
}
