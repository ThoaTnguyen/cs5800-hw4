package aggregation;

public class Textbook {
    private String ttl;
    private String auth;
    private String pub;

    public Textbook(String ttl, String auth, String pub) {
        this.ttl = ttl;
        this.auth = auth;
        this.pub = pub;
    }

    public String getTitle() {
        return ttl;
    }

    public void setTitle(String ttl) {
        this.ttl = ttl;
    }

    public String getAuthor() {
        return auth;
    }

    public void setAuthor(String auth) {
        this.auth = auth;
    }

    public String getPublisher() {
        return pub;
    }

    public void setPublisher(String pub) {
        this.pub = pub;
    }
}
