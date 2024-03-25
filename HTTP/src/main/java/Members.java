public class Members {

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    public Members(String id, String text, String type, String user, Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "   id = " + id
                + "\n   text = " + text
                + "\n   type = " + type
                + "\n   user = " + user
                + "\n   upvotes = " + upvotes + "";
    }
}
