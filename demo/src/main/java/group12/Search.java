package group12;

import java.util.ArrayList;
import java.util.Date;
//The search class is called by each user.
public class Search {
    //Fields needed as in the UML classes. We have to seach post that
    //its author is in the list of authors, one of its tag is in the list of
    //keywords, and its time posted fall in the range [dateFrom, dateTo]
    private String[] keywords;
    private String[] authors;
    private Date dateFrom;
    private Date dateTo;    

    //constructors
    Search()
    {

    }
    Search(String[] keywords, String[] authors, Date dateFrom, Date dateTo)
    {
        this.keywords = keywords;
        this.authors = authors;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }


    //setters and getters
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }
    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }
    public String[] getAuthors() {
        return authors;
    }
    public Date getDateFrom() {
        return dateFrom;
    }
    public Date getDateTo() {
        return dateTo;
    }
    public String[] getKeywords() {
        return keywords;
    }

    //the search function. Users will initialize the fields above and hit the "search"
    //button
    public ArrayList<Post> search()
    {
        //properPosts should contain all posts that is consistent with 
        //all the fields
        ArrayList<Post> properPosts = new ArrayList<>();
        ArrayList<Post> temp = new ArrayList<>();

        //get all posts with relevant authors, put those into a temp array list
        for (String aa : authors)
        {
            ArrayList<Post> kwaPosts = DBMS.getPostByAuthors(aa);
            temp.addAll(kwaPosts);

        }

        //for all post with relevant authors, choose posts with relevant
        //timeline and tag
        for (Post pp : temp)
        {
            //check if a post falls into a specific time line
            if (pp.getDatePosted().getTime() >= dateFrom.getTime() &&  pp.getDatePosted().getTime() <= dateTo.getTime())
            {
                int found = 0;
                //for all keywords, search all tag of the post to find a match
                for (String tagSearch : keywords)
                {
                    for (String tt : pp.getTag())
                    {
                        //check if one of the keywords is in the post's tags
                        if (tagSearch == tt)
                        {
                            //if it is, then found = 1 and stop searching for tag
                            found = 1;
                            break;
                        }
                    }
                    if (found == 1)
                    {
                        break;
                    }
                }
                if (found == 1)
                {
                    //if a pp reaches here, it should have a relevant time posted
                    //and one of its tags appears in the keywords
                    properPosts.add(pp);
                }
            }
        }
        return properPosts;
    }
}