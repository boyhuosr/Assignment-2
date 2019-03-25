
public class Library{


        // YOUR VARIABLES HERE
    public Book[] library;
    public int add;

    public Library(int size){

        // YOUR CODE HERE
        library = new Book[size];

    }

    public void addBook (Book book){

        // YOUR CODE HERE
        for(int i=0; i<library.length; i++){
            if(add<library.length){
                library[i]=book;
                add++;
            }else{
                System.out.println("The library is full");
            }
        }  
    }


    public void printLibrary(){

        // YOUR CODE HERE
        for(int i=0; i<library.length; i++){System.out.println(library[i]);}
    }


    public void searchAuthor(String author){

        // YOUR CODE HERE
        
        for(int i=0; i<library.length; i++){
            if(author.equals(library[i].author)){
                System.out.println(library[i]);
            }
        }
    }

    public void searchTitle(String title){

        // YOUR CODE HERE
        for(int i=0; i<library.length; i++){
            if(title.equals(library[i].title)){
                System.out.println(library[i]);
            }
        }
    }

    public void searchYear(int year){

        // YOUR CODE HERE
        for(int i=0; i<library.length; i++){
            if(year==library[i].year){
                System.out.println(library[i]);
            }
        }
    }

    public void sort() {

        // YOUR CODE HERE

    }

}
