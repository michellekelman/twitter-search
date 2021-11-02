package group12;

import java.util.Date;

public class Post {
    private String content;
    private String[] tag;
    private Date datePosted;
    private String link;
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }
    public Date getDatePosted() {
        return datePosted;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getLink() {
        return link;
    }
    public void setTag(String[] tag) {
        this.tag = tag;
    }
    public String[] getTag() {
        return tag;
    }
}