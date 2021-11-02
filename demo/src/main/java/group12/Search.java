package group12;

import java.util.ArrayList;
import java.util.Date;

public class Search {
    private String[] keywords;
    private String[] authors;
    private Date dateFrom;
    private Date dateTo;    

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
    public ArrayList<Post> search()
    {
        //get post from dbms
        ArrayList<Post> properPosts = new ArrayList<>();
        ArrayList<Post> temp = new ArrayList<>();
        for (String aa : authors)
        {
            ArrayList<Post> kwaPosts = DBMS.getPost(aa);
            temp.addAll(kwaPosts);

        }

        for (Post pp : temp)
        {
            if (pp.getDatePosted().getTime() >= dateFrom.getTime() &&  pp.getDatePosted().getTime() <= dateTo.getTime())
            {
                int found = 0;
                for (String tagSearch : keywords)
                {
                    for (String tt : pp.getTag())
                    {
                        if (tagSearch == tt)
                        {
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
                    properPosts.add(pp);
                }
            }
        }
        return properPosts;
    }
}