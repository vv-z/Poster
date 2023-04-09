import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {


    @Test
    public void test() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");

        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test7() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test8() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");


        String[] expected = {"Film VII", "Film VI", "Film V", "Film IV", "Film III"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test9() {
        MovieManager manager = new MovieManager(5);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");

        String[] expected = {"Film VII", "Film VI", "Film V", "Film IV", "Film III"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}