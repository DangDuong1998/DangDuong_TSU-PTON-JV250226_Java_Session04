import jdk.dynalink.beans.StaticClass;

import java.lang.reflect.Array;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một mảng");
        System.out.println("Mảng bao gồm bao nhiêu phần tử?");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Nhập phần tử thứ %d: ", i);
            arr[i] = scanner.nextInt();
//            System.out.println();
        }
        scanner.close();
        System.out.print("Mảng vừa nhập là: ");
        for (int i = 0; i < n ; i++){
            if(i == n-1){
                System.out.printf("%d.\n", arr[i]);
            }
            else{
                System.out.printf("%d, ", arr[i]);
            }

        }
        System.out.print("Mảng sau khi sắp xếp là: ");

            for(int i = 0; i < n-1; i++){
                int max = arr[i];
                for(int j = i+1; j <n; j++){
                    if(arr[j]> max){
                        max = arr[j];
                        arr[j] = arr[i];
                        arr[i] = max;
                    }
                }

            }
//        for (int i = 1; i < n; i++) {
//            int temp = arr[i];
//            int j = i -1;
//            while(j >=0 && arr[j]<temp){
//                arr[j +1] = arr[j];
//                j--;
//            }
//            arr[j+1]=temp;
//        }
        for (int i = 0; i < n ; i++){
            if(i == n-1){
                System.out.printf("%d.", arr[i]);
            }
            else{
                System.out.printf("%d, ", arr[i]);
            }

        }

    }
}
