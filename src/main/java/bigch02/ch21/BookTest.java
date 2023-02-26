package bigch02.ch21;

public class BookTest {
    public static void main(String[] args) {
         Book[] library = new Book[5];

//         for (int i = 0; i<library.length; i++){
//             library[i] = new Book("1", "성준");
//         }
        library[0] = new Book("태백1", "임성준");
        library[1] = new Book("태백2", "임성준");
        library[2] = new Book("태백3", "임성준");
        library[3] = new Book("태백4", "임성준");
        library[4] = new Book("태백5", "임성준");

        for (Book book : library){
            book.showInfo();
        }
    }
}
