package paradox.com.jats;

/**
 * Created by winbr on 7/12/2017.
 */

public class Task {
    public String getType() {
        return type;
    }

    public Task(String type, String image, String detail, String time) {
        this.type = type;
        this.image = image;
        this.detail = detail;
        this.time = time;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String type, image, detail, time;
}
