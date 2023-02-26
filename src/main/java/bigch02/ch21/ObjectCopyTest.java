package bigch02.ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibary = new Book[5];

        library[0] = new Book("태백1", "임성준");
        library[1] = new Book("태백2", "임성준");
        library[2] = new Book("태백3", "임성준");
        library[3] = new Book("태백4", "임성준");
        library[4] = new Book("태백5", "임성준");

//        System.arraycopy(library, 0, copyLibary, 0, 5);
//
//        System.out.println("== library ==");
//        for (Book book : library){
//            System.out.println(book);
//            book.showInfo();
//        }
//
//        library[0].setAuthor("홍길동");
//        library[0].setTitle("나");
//
//        System.out.println("== copy library ==");
//        for (Book book : copyLibary){
//            System.out.println(book);
//            book.showInfo();
//        }
//
//        System.out.println("== library ==");
//        for (Book book : library){
//            System.out.println(book);
//            book.showInfo();
//        }

        for(int i = 0; i < library.length; i++){
            copyLibary[i] = new Book();
            copyLibary[i].setAuthor("홍길동");
            copyLibary[i].setTitle("가");
        }

        for (Book book : copyLibary){
            book.showInfo();
        }
    }
}
