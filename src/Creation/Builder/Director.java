package Creation.Builder;

public class Director {
    BookBuilder bookBuilder;

    public Book createBook(BookBuilder builder){
        bookBuilder=builder;
        bookBuilder.createBook();
        bookBuilder.createAuthor();
        bookBuilder.createName();
        bookBuilder.createPrice();
        bookBuilder.createYear();
        return bookBuilder.getBook();
    }

    public static void main(String[] args) {
        Director dir =new Director();
        Book book =dir.createBook(new HistoryBookBuilder());
        System.out.println(book);
    }
}
