public class Book {


        // YOUR VARIABLES HERE
    public String author;
    public String title;
    public int year;

    public Book (String author, String title, int year) {

        // YOUR CODE HERE
        this.author=author;
        this.title=title;
        this.year=year;
    }

    public String getAuthor() {

        // YOUR CODE HERE
        return author;
    }
    public String getTitle() {

        // YOUR CODE HERE
        return title;
    }
    public int getYear(){

        // YOUR CODE HERE
        return year;
    }

    public boolean equals(Book other) {

        // YOUR CODE HERE
        
        return this.author.equals(other.author) 
            && this.title.equals(other.title)
            && this.year==other.year;
       
    }

    public String toString() {

        // YOUR CODE HERE
        return  author +": "+ title + "("+year+")"; 
    }

    public int compareTo(Book other) {

        // YOUR CODE HERE
        int result;
        if(this.author.equals(other.author) 
            && this.title.equals(other.title)
            && this.year==other.year){
            result = 0;
        }else if(this.author.equals(other.author) 
            || this.title.equals(other.title)
            || this.year==other.year){
            result = -1;
        }else{
            result = 1;}
        return result;    
    }
}
