import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Movie> movies = new ArrayList<>();

    public Store() {
        // TODO
    }

    public Movie getMovie(int index) {
        return movies.get(index);
    }

    public void setMovie(int index, Movie movie) {
        // TODO
            movies.set(index, movie);
    }

    public void addMovie(Movie movie) {
        // TODO
        movies.add(movie);
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}