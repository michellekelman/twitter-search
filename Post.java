import java.util.*;

public class Post {
	String content;
	ArrayList<String> tags;
	Date datePosted;
	String media; // file pathname?
	String link; // postID
	String author;
	
	public Post(String c, ArrayList<String> t, String m, String l, String a) {
		content = c;
		tags = t;
		datePosted = new Date();
		media = m;
		link = l;
		author = a;
	}
	
	public Post() {
		content = "";
		tags = null;
		datePosted = new Date();
		media = "";
		link = "";
		author = "";
	}
	
	void setContent(String c) {
		content = c;
	}
	
	String getContent() {
		return content;
	}
	
	void setTags(ArrayList<String> t) {
		tags = t;
	}
	
	ArrayList<String> getTags() {
		return tags;
	}
	
	void setDatePosted(Date d) {
		datePosted = d;
	}
	
	Date getDatePosted() {
		return datePosted;
	}
	
	void setMedia(String m) {
		media = m;
	}
	
	String getMedia() {
		return media;
	}
	
	void setLink(String l) {
		link = l;
	}
	
	String getLink() {
		return link;
	}
	
	void setAuthor(String a) {
		author = a;
	}
	
	String getAuthor() {
		return author;
	}
}
