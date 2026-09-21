// 07-08-2026

// Task 2: create a class Book with below attributes -> create 5 book objects using arrays

package constructorE;
class Book {
    private int id;
    private String author;
    private double price;
    private String name;
    //constructor
    public Book(int id,String author,double price,String name){
        this.id = id;
        this.author = author;
        this.price = price;
        this.name = name;
    }
    //tostring
    public String toString(){
        return "Book id : "+this.id+
        "\nAuthor : "+this.author+
        "\nPrice : "+this.price+
        "\nName : "+this.name+"\n-------------------------";
    }
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Paulo Coelho", 350, "The Alchemist"),
            new Book(102, "James Clear", 450,"Atomic Habits"),
            new Book(103, "Harper Lee", 299, "To Kill a Mockingbird"),
            new Book(104, "George Orwell", 250, "1984"),
            new Book(105, "F. Scott Fitzgerald", 250, "The Great Gatsby"),
        };
        for (Book book: books){
            System.out.println(book);
        }
        System.out.println(books[1]);
    }
}
