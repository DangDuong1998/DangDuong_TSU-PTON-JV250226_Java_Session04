import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0; i<n-1;i++){
            int max = arr[i];
            int maxIndex=-1;
            for(int j = i+1;j < n; j++){
                if(arr[j]> max){
                    max = arr[j];
                    maxIndex=j;
                }
            }
            arr[maxIndex] = arr[i];
            arr[i] = max;
        }
        System.out.print("Mảng tìm kiếm theo thứ tự giảm dần: [");
        for (int i = 0; i < n;i++ ){
            if(i == n-1){
                System.out.printf("%d",arr[i]);
            }
            else{
                System.out.printf("%d, ",arr[i]);
            }
        }
        System.out.println("]");
        System.out.print("Nhập số cần tìm: ");
        int searchNumber = scanner.nextInt();

        int searchIndex=-1;

//        Tuyến tinh
        for(int i =0; i<n;i++){
            if(arr[i]==searchNumber){

                searchIndex = i;
            }
        }
        if(searchIndex != -1){
            System.out.printf("Tìm kiếm tuyến tính: Phần tử %d tìm thấy tại chỉ số %d\n",searchNumber,searchIndex);
        }
        else{
            System.out.printf("Tìm kiếm tuyến tính: Phần tử %d không tồn tại\n",searchNumber);
        }

        //Nhị phân
        int searchIndexBinary=-1;
        int left = 0;
        int right = n -1;
        while(left <= right){
            int mid = (right + left) /2;
            if(arr[mid] == searchNumber){
                searchIndexBinary= mid;
                break;
            } else if (searchNumber >arr[mid]) {
                right = mid - 1;

            }else if(searchNumber < arr[mid]){
                left = mid +1;
            }
        }
        if(searchIndexBinary!=-1){
            System.out.printf("Tìm kiếm tuyến tính: Phần tử %d tìm thấy tại chỉ số %d",searchNumber,searchIndexBinary);
        }
        else{
            System.out.printf("Tìm kiếm tuyến tính: Phần tử %d không tồn tại",searchNumber);
        }


    }
}
