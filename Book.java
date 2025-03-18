/*implement classes for a Library
There are different type of books are available in the
library like Printed books, E books, and Audio books

You must use inheritance, polymorphism, encapsulation...*/

class Book{
    private String title;
    private String author;
    
    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public String getInfo(){
        return title + " by " + author + " ";
    }
}