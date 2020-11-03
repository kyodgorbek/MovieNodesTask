package yodgorbekkomilov.edgar.movienodestask;

public class FavoriteMovie {
    String movieID;
    String movieName;


    public FavoriteMovie() {

    }

    public FavoriteMovie(String movieID, String movieName) {
        this.movieID = movieID;
        this.movieName = movieName;
    }

    public static void findById(int add_favorite_btn) {
    }

    public String getMovieID() {
        return this.movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
