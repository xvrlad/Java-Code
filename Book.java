import java.util.ArrayList;

public class Book {
    private String name;
//    private Author author;
//    private Author[] authors;
    private ArrayList<Author> authors = new ArrayList<Author>();
    private double price;
    private int quantityInStock;

    Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
    Book(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }
//    Book(String name, Author author, double price) {
//        this.name = name;
//        this.author = author;
//        this.price = price;
//    }
//    Book(String name, Author[] authors, double price) {
//        this.name = name;
//        this.authors = authors;
//        this.price = price;
//    }
    Book(String name, ArrayList<Author> authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
//    Book(String name, Author author, double price, int quantityInStock) {
//        this.name = name;
//        this.author = author;
//        this.price = price;
//        this.quantityInStock = quantityInStock;
//    }
//    Book(String name, Author[] authors, double price, int quantityInStock) {
//        this.name = name;
//        this.authors = authors;
//        this.price = price;
//        this.quantityInStock = quantityInStock;
//    }
    Book(String name, ArrayList<Author> authors, double price, int quantityInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void addAuthor(Author a) {
        this.authors.add(a);
    }

    public void setName(String name) {
        this.name = name;
    }
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
//    public void setAuthors(Author[] authors) {
//        this.authors = authors;
//    }
    public void setAuthors(ArrayList<Author> a) {
        this.authors = a;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return this.name;
    }
//    public Author getAuthor() {
//        return this.author;
//    }
//    public Author[] getAuthors() {
//        return this.authors;
//    }
    public ArrayList<Author> getAuthors() {
        return this.authors;
    }
    public double getPrice() {
        return this.price;
    }
    public int getQuantityInStock() {
        return this.quantityInStock;
    }

    public String toString() {
//        return this.name + " by " + this.author.toString();
        if (this.authors.size() != 1) {
            return this.name + " by " + this.authors.size() + " authors";
        } else {
            return this.name + " by 1 author";
        }
    }

    public void printAuthors() {
//        for (int i = 0; i < authors.length; i++) {
//            System.out.println(authors[i]);
//        }
        for (Author author : authors) {
            System.out.println(author);
        }
    }

    public boolean removeAuthorByEmail(String email) {
        for(Author author : authors) {
            if (author.getEmail() == email) {
                this.authors.remove(author);
                return true;
            }
        }
        return false;
    }
    public boolean removeAuthorByName(String name) {
        for(Author author : authors) {
            if (author.getName() == name) {
                this.authors.remove(author);
                return true;
            }
        }
        return false;
    }
}
