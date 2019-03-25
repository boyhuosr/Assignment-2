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
        int result=0;
        char[] thisAuthor = this.author.toCharArray();
        char[] otherAuthor = other.author.toCharArray();
        char[] thisTitle = this.title.toCharArray();
        char[] otherTitle = other.author.toCharArray();

        if(this.author.equals(other.author) 
            && this.title.equals(other.title)
            && this.year==other.year){
            result = 0;
        //If their authors are different
        }else if(!this.author.equals(other.author)){
            for(int i=0; i<this.author.length(); i++){
                if(thisAuthor[i]<otherAuthor[i]){
                    result = -1;
                    break;
                }else if(thisAuthor[i]>otherAuthor[i]){
                    result = 1;
                    break;
                }else{i++;}

            }
        //if their authors are the same but with different titles
        }else if(this.author.equals(other.author) 
            && !this.title.equals(other.title)){
            for(int i=0; i<this.title.length(); i++){
                if(thisTitle[i]<otherTitle[i]){
                    result = -1;
                    break;
                }else if(thisTitle[i]>otherTitle[i]){
                    result = 1;
                    break;
                }else{i++;}
            }
            if(this.title.length()<other.title.length()){
                result = -1;
            }
        //if only their years are varied.
        }else if(this.author.equals(other.author) 
            && this.title.equals(other.title)
            && this.year!=other.year){
            if(this.year>other.year){
                result=1;
            }else{result = -1;}
        }

        return result;    
    }

}
