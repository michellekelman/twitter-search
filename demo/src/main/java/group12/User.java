package group12;
    
import java.util.ArrayList;

public class User {
    private String name;
    private String userName;
    private String password;
    private String emailAddress;
    private String phoneNumber;
    private Search[] searchHistory;
    ArrayList<Post> posts;
    public User()
    {
        posts = new ArrayList<Post>();
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }
    public void setSearchHistory(Search[] searchHistory) {
        this.searchHistory = searchHistory;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public ArrayList<Post> getPosts() {
        return posts;
    }
    public Search[] getSearchHistory() {
        return searchHistory;
    }
    public String getUserName() {
        return userName;
    }
    public void addPost(Post post)
    {
        posts.add(post);
    }
    public void deletePost(Post post)
    {
        posts.remove(post);
    }
    public void editPost(Post oldPost , Post newPost)
    {
        posts.remove(oldPost);
        posts.add(newPost);
    }
}  