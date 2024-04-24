package extends1.ex;

public class Book extends Item {
    String autor;
    String isbn;

    public Book(String name, int price,  String autor, String isbn){
        super(name, price);
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 저자: " + this.autor + " , isbn :" + this.isbn);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
