
public class Book implements Comparable<Book> {
    int numberOfPages;
    String title;
    String author;

    @Override
    public int compareTo(Book specifiedBook) {
        if (this.numberOfPages != specifiedBook.numberOfPages) {
            return this.numberOfPages - specifiedBook.numberOfPages;
        }
        if (!this.title.equals(specifiedBook.title)) {
            return this.title.compareTo(specifiedBook.title);
        }
        return this.author.compareTo(specifiedBook.author);
    }
}

