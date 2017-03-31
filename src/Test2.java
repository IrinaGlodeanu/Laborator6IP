import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by pc on 3/31/2017.
 */
public class Test2 {

    private User service;

    @BeforeEach
    public void setUp() {
        service = new User("asd", "asd", "asd", "asd");
    }

    @AfterEach
    public void tearDown() {
        service = null;
    }

    @Test
    public void add_email_with_at_should_return_true() {
        String email = "irina@ss.ac";
        User user5 = new User(email, "", "", "");

        assertEquals(user5.getEmail(), email);
    }



    @Test
    public void add_email_without_at_should_return_false() {
        String email = "irina-ss.ac";
        User user5 = new User(email, "", "", "");

        assertNotEquals(user5.getEmail(), email);
    }

    @Test
    public void add_name_with_space_should_return_true() {
        String nume = "Irina Irina";
        User user5 = new User("", nume, "", "");

        assertEquals(user5.getName(), nume);
    }

    @Test
    public void add_name_without_space_should_return_false() {
        String nume = "-IrinaIrina.ac";
        User user5 = new User("", nume, "", "");

        assertNotEquals(user5.getName(), nume);
    }

    @Test
    public void add_url_with_www_should_return_true() {
        String url = "www.fds.com";
        User user5 = new User("", "", url, "");

        assertEquals(user5.getUrl(), url);
    }

    @Test
    public void add_url_without_www_should_return_false() {
        String url = "fds.com";
        User user5 = new User("", "", url, "");

        assertNotEquals(user5.getUrl(), url);
    }

    @Test
    public void add_username_without_space_should_return_true() {
        String username = "www.fds.com";
        User user5 = new User("", "", "", username);

        assertEquals(user5.getUsername(), username);
    }

    @Test
    public void add_username_with_space_should_return_false() {
        String username = "fds com";
        User user5 = new User("", "", "", username);

        assertNotEquals(user5.getUsername(), username);
    }


}
