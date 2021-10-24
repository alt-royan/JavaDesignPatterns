package Creation.Builder;

public abstract class BookBuilder {
    Book book;

   public void createBook(){
       book=new Book();
   }

   public abstract void createName();
   public abstract void createPrice();
   public abstract void createAuthor();
   public abstract void createYear();

   public Book getBook(){
       return book;
   }
}
