package Creation.Builder;

public class HistoryBookBuilder extends BookBuilder{

    @Override
    public void createName() {
        book.setName("History of the Russian State");
    }

    @Override
    public void createPrice() {
        book.setPrice(1320);
    }

    @Override
    public void createAuthor() {
        book.setAuthor("Nikolay Karamzin");
    }

    @Override
    public void createYear() {
        book.setYear("1883");
    }
}
