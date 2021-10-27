import java.util.*;

public class Search {
	ArrayList<String> keywords;
	ArrayList<String> authors;
	ArrayList<String> tags;
	Date dateFrom;
	Date dateTo;
	
	public Search(ArrayList<String> k, ArrayList<String> a, ArrayList<String> t, Date from, Date to) {
		keywords = k;
		authors = a;
		tags = t;
		dateFrom = from;
		dateTo = to;
	}
	
	public Search() {
		keywords = null;
		authors = null;
		tags = null;
		dateFrom = new Date();
		dateTo = new Date();
	}
	
	void setKeywords(ArrayList<String> k) {
		keywords = k;
	}
	
	ArrayList<String> getKeywords() {
		return keywords;
	}
	
	void setAuthors(ArrayList<String> a) {
		authors = a;
	}
	
	ArrayList<String> getAuthors() {
		return authors;
	}
	
	void setTags(ArrayList<String> t) {
		tags = t;
	}
	
	ArrayList<String> getTags() {
		return tags;
	}
	
	void setDateFrom(Date from) {
		dateFrom = from;
	}
	
	Date getDateFrom() {
		return dateFrom;
	}
	
	void setDateTo(Date to) {
		dateTo = to;
	}
	
	Date getDatePosted() {
		return dateTo;
	}
}
