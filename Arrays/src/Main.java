import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//////////////////////// NUMBER 1//////////////////////////////////
//        int[] num = {10, 20 , 30 , 10};
//        if (num[0]==num[3]){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
//////////////////////// NUMBER 2//////////////////////////////////
//        int[] num = {1, 4 , 17 , 7,25,3,100};
//        int sum = 0 ;
//        for (int i = 0; i < num.length ; i++) {
//            sum = sum+ num[i];
//        }
//
//        double avg = sum / num.length;
//        System.out.println("The average is " + avg );
//        System.out.println("The Numbers greater than the average are:");
//
//        for (int i = 0; i < num.length ; i++) {
//           if (num[i]>avg) {
//               System.out.println(num[i]);
//           }
//        }
//////////////////////// NUMBER 3//////////////////////////////////
//                int[] num = {110, 20 , 30 , 100};
//        if (num[0]>num[3]){
//            System.out.println("Larger value between first and last element is " + num[0] );
//        }
//        else{
//            System.out.println("Larger value between first and last element is " + num[3]);
//        }
//////////////////////// NUMBER 4//////////////////////////////////
//        int[] num = {20, 30, 40};
//        int first = num[0];
//        num[0] = num[num.length - 1];
//        num[num.length - 1] = first;
//        System.out.println("New array after swapping the first and last elements:" + Arrays.toString(num));
//////////////////////// NUMBER 5//////////////////////////////////
//        int[] num = {2, 3, 40, 1 ,5 , 9 , 4 , 10 , 7};
//        int left = 0 ;
//        int right = num.length-1 ;
//        while (left<right){
//            while(num[left]%2==1 && left<right)
//                left++;
//             while(num[right]%2==0 && left<right)
//                 right--;
//
//             if(left<right){
//                 int temp = num[left];
//                 num[left]= num[right];
//                 num[right]=temp;
//                 left++;
//                 right--;
//             }
//        }
//            System.out.print(Arrays.toString(num));
//////////////////////// NUMBER 6//////////////////////////////////
//        int[] array1 = {2, 3, 7, 6 ,4};
//        int[] array2 = {2, 3, 6, 6 ,4};
//        for (int i = 0; i <array1.length  ; i++) {
//            if(array1[i]!=array2[i]){
//                System.out.println("#" + i + " Element :" + "False");
//            }
//            else {
//                System.out.println("#" + i + " Element :" + "True");
//            }
//        }

    }
}
