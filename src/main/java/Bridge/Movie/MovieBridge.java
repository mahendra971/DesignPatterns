package Bridge.Movie;

public class MovieBridge {

    public static void main(String[] args){
        Movie movie = new Movie();
        movie.setName("ABCD");
        movie.setYear("2014");
        movie.setTime("2h30min");

        Printer mvprint = new MoviePrinter(movie);

        Formatter prinformat = new PrintFormatter();
        String printmaterial = mvprint.print(prinformat);
        String htmlmaterial = mvprint.print(new HTMLFormat());
        System.out.println(printmaterial);
        System.out.println(htmlmaterial);


    }
}
