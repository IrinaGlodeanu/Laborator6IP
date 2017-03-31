import java.util.Date;

/**
 * Created by pc on 3/31/2017.
 */
public class Message extends Entity<Message> {

    private Date createdAt;
    private String Text;
    private int postedByID;


    public Message(Date createdAt, String text, int postedByID) {
        this.createdAt = createdAt;
        ++id;
        this.Text = text;
        this.postedByID = postedByID;
    }


}
