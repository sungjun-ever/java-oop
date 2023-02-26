package bigch02.ch20;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] arr = new char[26];
        char ch = 'A';
        for(int i =0; i<arr.length; i++){
            arr[i] = ch++;
        }

        for (char alpa : arr){
            System.out.println(alpa);
        }
    }
}
