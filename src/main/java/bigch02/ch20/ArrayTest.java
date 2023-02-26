package bigch02.ch20;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;
        for(int i=0, num=1; i < arr.length; i++, num++){
            arr[i] = num;
        }

        //enhanced for => 처음부터 끝까지 for문을 돌 경우 사용
        for(int num : arr) {
            total += num;
        }
//        total = Arrays.stream(arr).sum();
        System.out.println(total);
    }
}
