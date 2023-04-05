import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.MovieManager;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();
    @Test
    public void shouldAddMoviesBelowLimit() {

        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");

        String[] expected = {"Movie one", "Movie two", "Movie three"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoviesEqualLimit() {

        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");
        manager.addMovie("Movie four");
        manager.addMovie("Movie five");

        String[] expected = {"Movie one", "Movie two", "Movie three", "Movie four", "Movie five"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddMoviesOverLimit() {
        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");
        manager.addMovie("Movie four");
        manager.addMovie("Movie five");
        manager.addMovie("Movie six");

        String[] expected = {"Movie one", "Movie two", "Movie three", "Movie four", "Movie five", "Movie six"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindMoviesEqualLimitReverseOrder() {

        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");
        manager.addMovie("Movie four");
        manager.addMovie("Movie five");

        String[] expected = {"Movie five", "Movie four", "Movie three", "Movie two", "Movie one"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindMoviesBelowLimitReverseOrder() {

        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");
        manager.addMovie("Movie four");

        String[] expected = {"Movie four", "Movie three", "Movie two", "Movie one"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindMoviesOverLimitReverseOrder() {

        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");
        manager.addMovie("Movie four");
        manager.addMovie("Movie five");
        manager.addMovie("Movie six");

        String[] expected = {"Movie six","Movie five", "Movie four", "Movie three", "Movie two"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindMoviesSetEqualLimitReverseOrder() {
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");
        manager.addMovie("Movie four");
        manager.addMovie("Movie five");

        String[] expected = {"Movie five", "Movie four", "Movie three", "Movie two", "Movie one"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindMoviesSetBelowLimitReverseOrder() {
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");
        manager.addMovie("Movie four");

        String[] expected = {"Movie four", "Movie three", "Movie two", "Movie one"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindMoviesSetOverLimitReverseOrder() {
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");
        manager.addMovie("Movie four");
        manager.addMovie("Movie five");
        manager.addMovie("Movie six");

        String[] expected = {"Movie six", "Movie five", "Movie four", "Movie three", "Movie two"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}

