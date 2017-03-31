import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by pc on 3/31/2017.
 */
public class User extends Entity<User> {


    String email;
    String name;
    String url;
    String username;

    public String getEmail() {
        return email;
    }


    public String getName() {
        return name;
    }


    public String getUrl() {
        return url;
    }


    public String getUsername() {
        return username;
    }


    List<User> followers;
    List<User> following;
    List<Message> msgList;

    public User(String email, String name, String url, String username) {

        ++id;
        if (email.contains("@"))
            this.email = email;

        if (name.contains(" "))
            this.name = name;

        if (url.contains("www."))
            this.url = url;

        if (!username.contains(" "))
            this.username = username;

        followers = new ArrayList();
        following = new ArrayList();
        msgList = new ArrayList();
    }

    public boolean addFollowing(User user) {
        if (following.contains(user)) return false;
        following.add(user);

        followers.add(user);
        return true;
    }


    public boolean addMessage(String text) {
        if (text.equals("") || text == null) return false;
        else {
            msgList.add(new Message(new Date(), text, this.id));
            return true;
        }
    }
}
