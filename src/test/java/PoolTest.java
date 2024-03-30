import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PoolTest {

    @Test
    public void findAllTest() {
        Pool pool = new Pool();
        pool.addFilm("1");
        pool.addFilm("2");
        pool.addFilm("3");

        String[] expected = {"1", "2", "3"};
        String[] actual = pool.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefault() {
        Pool pool = new Pool();
        pool.addFilm("1");
        pool.addFilm("2");
        pool.addFilm("3");
        pool.addFilm("4");
        pool.addFilm("5");
        pool.addFilm("6");

        String[] expected = {"6", "5", "4", "3", "2"};
        String[] actual = pool.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoreThenDefault() {
        Pool pool = new Pool(7);
        pool.addFilm("1");
        pool.addFilm("2");
        pool.addFilm("3");

        String[] expected = {"3", "2", "1"};
        String[] actual = pool.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLessThenDefault() {
        Pool pool = new Pool(3);
        pool.addFilm("1");
        pool.addFilm("2");
        pool.addFilm("3");
        pool.addFilm("4");
        pool.addFilm("5");
        pool.addFilm("6");
        pool.addFilm("7");

        String[] expected = {"7", "6", "5"};
        String[] actual = pool.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
