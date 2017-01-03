package chapter1.first.questions.q2;

/**
 * Created by chaialong on 8/20/2016.
 */
public class Book {
    private int ISBN;
    private String title, author;
    private int pageCount;
    public int hashCode(){
        return ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.ISBN == other.ISBN;
    }
}
