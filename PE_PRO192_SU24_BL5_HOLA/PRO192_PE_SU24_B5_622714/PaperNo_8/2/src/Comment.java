
public class Comment {
    private String content;
    private int like;

    public Comment() {
    }

    public Comment(String content, int like) {
        this.content = content;
        this.like = like;
    }

    public String getContent() {
        return content;
    }

    public int getLike() {
        return like;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content + "," + like;
    }
    
}
