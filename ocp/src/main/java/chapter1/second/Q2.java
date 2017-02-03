package chapter1.second;

public class Q2 {
    static class Book {
        private int ISBN;

        public Book(int ISBN) {
            this.ISBN = ISBN;
        }

        @Override
        public int hashCode() {
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

    public static void main(String[] args) {
        Book b1 = new Book(111);
        Book b2 = new Book(111);

        System.out.println(b1.equals(b2));
    }
}
