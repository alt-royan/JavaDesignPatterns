package Creation.Builder;

public class Publisher {
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
        Publisher publisher =new Publisher();
        Book book =publisher.createBook(new HistoryBookBuilder());
        System.out.println(book);
    }
}
