package Bridge.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private  Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    protected String getHeader() {
        return movie.getName();
    }

    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<Detail>();
        details.add(new Detail("year",movie.getYear()));
        details.add(new Detail("time", movie.getTime()));
        return  details;
    }
}
