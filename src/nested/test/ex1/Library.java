package nested.test.ex1;

public class Library {

    private int countBook;
    private Book[] books;

    private static class Book {
        private String bookName;
        private String directorName;

        public Book(String bookName, String directorName) {
            this.bookName = bookName;
            this.directorName = directorName;
        }
    }
    // 생성자, i개 만틈 도서를 저장할 수 있는 도서관 생성
    Library(int numOfBook) {
        books = new Book[numOfBook];
        countBook = 0;
    }

    // 도서관에 책을 추가한다.
    public void addBook(String bookName, String directorName) {
        if (countBook >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[countBook++] = new Book(bookName, directorName);

    }
    // 도서관의 모든 도서 정보 출력
    public void showBooks() {
        System.out.println("== 책 목록 출력==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.bookName + ", 저자: " + book.directorName);
        }
    }

}
