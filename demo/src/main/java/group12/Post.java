package group12;

import java.util.Date;

//Post class represents a post
public class Post {
    //Fileds needed:
    private String content;
    private String[] tag;
    private Date datePosted;
    private String link;
    
    //Constructors
    Post()
    {
    }
    Post(String content, String[] tag, Date datePosted, String link)
    {
        this.content = content;
        this.tag = tag;
        this.datePosted = datePosted; 
        this.link = link;
    }

    //getters and setters
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