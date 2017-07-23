package paradox.com.jats;

/**
 * Created by winbr on 7/12/2017.
 */

public class Message extends Task {
    private String from, to, text;

    public Message(String type, String image, String detail, String time, String from, String to, String text) {
        super(type, image, detail, time);
        this.from = from;
        this.to = to;
        this.text = text;
    }
}
