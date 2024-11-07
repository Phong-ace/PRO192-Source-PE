
public class SpecComment extends Comment{
    private String status;

    public SpecComment() {
    }

    public SpecComment(String content, int like, String status) {
        super(content, like);
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "," + status;
    }
    
    public void setData() {
        setContent(getContent().substring(1));
    }
    
    public String getValue() {
        int n = getContent().toCharArray().length;
        if ( getLike() <= n) {
            return n + status;
        }
        else
            return status;
    }
}
