import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập vào số phần tử của mảng số nguyên: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Nhập vào phần tử thứ %d: ",i);
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for(Integer arrI :  arr ){
            sum+= arrI;
        }
        System.out.printf("Mảng có tổng là: %d",sum);
        scanner.close();
    }
}
