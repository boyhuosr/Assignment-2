
public class Library{


        // YOUR VARIABLES HERE
    public Book[] library;
    public int add;

    public Library(int size){

        // YOUR CODE HERE
        Book[] library = new Book[size];
        this.library = library;
    }

    public void addBook (Book book){

        // YOUR CODE HERE
        
            if(add<library.length){
                library[add++]=book;
                
            }else{
                System.out.println("The library is full");
            }
         
    }


    public void printLibrary(){

        // YOUR CODE HERE
        for(int i=0; i<library.length; i++){System.out.println(library[i]);}
    }


    public void searchAuthor(String author){

        // YOUR CODE HERE
        System.out.println("Search library for books by "+ author);
        for(int i=0; i<library.length; i++){
            if(author.equals(library[i].author)){
                System.out.println(library[i]);
            }
        }
    }

    public void searchTitle(String title){

        // YOUR CODE HERE
        System.out.println("Search library for books by "+ title);
        for(int i=0; i<library.length; i++){
            if(title.equals(library[i].title)){
                System.out.println(library[i]);
            }
        }
    }

    public void searchYear(int year){

        // YOUR CODE HERE
        System.out.println("Search library for books by "+ year);
        for(int i=0; i<library.length; i++){
            if(year==library[i].year){
                System.out.println(library[i]);
            }
        }
    }

    public void sort() {

        // YOUR CODE HERE
        for(int i=0; i<library.length; i++){
                Book temp;
            for(int j=i; j<library.length-1; j++){
                if(library[i].compareTo(library[j+1])>0){
                    temp = library[i];
                    library[i] = library[j+1];
                    library[j+1] = temp;
                }
            }
        }
        
    }

}
