import java.util.*;

public class Account {
	String name;
	String username;
	String password;
	String emailAddress;
	String phoneNumber;
	ArrayList<Post> posts;
	Search[] searchHistory;
	
	public Account(String n, String user, String pass, String email, String phone) {
		name = n;
		username = user;
		password = pass;
		emailAddress = email;
		phoneNumber = phone;
		posts = null;
		searchHistory = new Search[5];
	}
	
	public Account() {
		name = "";
		username = "";
		password = "";
		emailAddress = "";
		phoneNumber = "";
		posts = null;
		searchHistory = new Search[5];
	}
	
	void setName(String n) {
		name = n;
	}
	
	String getName() {
		return name;
	}
	
	void setUsername(String user) {
		username = user;
	}
	
	String getUserame() {
		return username;
	}
	
	void setPassword(String pass) {
		password = pass;
	}
	
	String getPassword() {
		return password;
	}
	
	void setEmailAddress(String email) {
		emailAddress = email;
	}
	
	String getEmailAddress() {
		return emailAddress;
	}
	
	void setPhoneNumber(String phone) {
		phoneNumber = phone;
	}
	
	String getPhoneNumber() {
		return phoneNumber;
	}
	
	void addPost(Post p) {
		// add post
	}
	
	void editPost(Post old, Post updated) {
		// edit post
	}
	
	void deletePost(Post p) {
		// delete post
	}
	
	ArrayList<Post> getPosts() {
		return posts;
	}
}
