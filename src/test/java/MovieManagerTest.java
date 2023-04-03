import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.MovieManager;

public class MovieManagerTest {

    @Test
    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");

        String[] expected = {"Movie one", "Movie two", "Movie three"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");
        manager.addMovie("Movie four");
        manager.addMovie("Movie five");

        manager.findLast();

        String[] expected = {"Movie five", "Movie four", "Movie three", "Movie two", "Movie one"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Movie one");
        manager.addMovie("Movie two");
        manager.addMovie("Movie three");

        manager.findLast();

        String[] expected = {"Movie three", "Movie two", "Movie one"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

}

