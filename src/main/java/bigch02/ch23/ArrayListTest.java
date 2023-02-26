package bigch02.ch23;

import bigch02.ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("가", "홍길동"));
        library.add(new Book("나", "홍길동"));
        library.add(new Book("다", "홍길동"));
        library.add(new Book("라", "홍길동"));
        library.add(new Book("마", "홍길동"));

        for (int i = 0; i < library.size(); i++){
            library.get(i).showInfo();
        }
    }
}
