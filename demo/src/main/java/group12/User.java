package group12;
    
import java.util.ArrayList;

//User class represents a user
public class User {
    private String name;
    private String userName;
    private String password;
    private String emailAddress;
    private String phoneNumber;
    private Search[] searchHistory;
    ArrayList<Post> posts;


    //Constructors
    public User()
    {
        posts = new ArrayList<Post>();
    }
    public User(String name, String userName, String password, String emailAddress, 
                String phoneNumber, Search[] searchHistory, ArrayList<Post> posts)
    {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.searchHistory = searchHistory;
        this.posts = posts;
    }

    //getters and setters
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

    //function to add a post
    public void addPost(Post post)
    {
        //add a post into the array
        posts.add(post);
    }

    //function to delete a post
    public void deletePost(Post post)
    {
        //delete a post from the array
        posts.remove(post);
    }

    //function to edit a post
    public void editPost(Post oldPost , Post newPost)
    {
        //replace old post by new post
        posts.remove(oldPost);
        posts.add(newPost);
    }
}  