import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by pc on 3/31/2017.
 */
public class Test1 {


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
    public void add_message_not_null_should_return_true() {
        boolean result = service.addMessage("asdsad");
        assertTrue(result);
    }

    @Test
    public void add_message_null_should_return_false() {
        boolean result = service.addMessage("");
        assertFalse(result);
    }

    @Test
    public void add_following_should_return_true() {
        User user1 = new User("asd", "asd", "asd", "asd");
        User user2 = new User("asd", "asd", "asd", "asd");

        boolean result = user2.addFollowing(user1);

        assertTrue(result);
    }

    @Test
    public void add_following_should_return_false() {
        User user3 = new User("asd", "asd", "asd", "asd");
        User user4 = new User("asd", "asd", "asd", "asd");
        user4.following.add(user3);
        boolean result = user4.addFollowing(user3);

        assertFalse(result);
    }


}
