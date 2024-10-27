import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//Question 1 (is first and last index in array equal to each other ?)
//        ArrayList<Integer> num = new ArrayList<>();
//
//        num.add(1);
//        num.add(2);
//        num.add(3);
//        num.add(4);
//        if(num.size()>= 2){
//           if(num.get(0)==num.get(num.size()-1))
//              System.out.println("True");
//                   else System.out.println("False "); }
//else System.out.println("Size of array must be greater or equal than 2 ");
//
//
//


////**************************************************************8
//        //Question 2
//
//        ArrayList<Integer> allNum = new ArrayList<>();
//        double sum =  0;
//
//        allNum.add(1);
//        allNum.add(4);
//        allNum.add(17);
//        allNum.add(7);
//        allNum.add(25);
//        allNum.add(3);
//        allNum.add(100);
//
//
//
//        for (int a : allNum){
//            sum = sum+a;
//        }
//        double average = sum /allNum.size();
//        System.out.println("The average of numbers = "+average);
//        for (int a :allNum){
//            if(a>average){
//                System.out.println("Number grater than average : "+a);
//            }
//        }

////***************************************************************************
//        //Question 3 (Larger value)
//
//ArrayList<Integer> numbers = new ArrayList<>();
//numbers.add(200);
//numbers.add(30);
//numbers.add(40);
//numbers.add(50);
// int max = numbers.get(0);
//
//for (int n: numbers){
//    if(n>max){
//        max=n;
//    }
//}
//        System.out.println("Larger value in the array = "+max);

//***********************************************************************************
        //Question 4 (Swap)

//        ArrayList<Integer> original = new ArrayList<>();
//        ArrayList<Integer> swaping = new ArrayList<>();
//
//        original.add(20);
//        original.add(30);
//        original.add(40);
//
//        int first = original.get(0);
//        int last = original.get(original.size()-1);
//
//        for (int i : original){
//            swaping.add(i);
//
//        }
//
//        swaping.set(0 , last);
//        swaping.set(original.size()-1 , first);
//
//        System.out.println(original);
//        System.out.println(swaping);

// //***********************************************************************************
//        //Question 5 (odd before even in array)
//
//        ArrayList<Integer> original = new ArrayList<>();
//
//        original.add(2);
//        original.add(3);
//        original.add(40);
//        original.add(1);
//        original.add(5);
//        original.add(9);
//
//        ArrayList<Integer> temp = new ArrayList<>();
//
//        for (int n: original){
//
//            if(n%2!=0){
//               temp.add(n);
//            }
//        }
//
//
//        for (int n: original){
//            if(n%2==0){
//                temp.add(n);
//
//            }}
//        original.clear();
//        original.addAll(temp);
//        System.out.println(original);

//***********************************************************************************
        //Question 6 (Equality of two arrays)

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);

        int counter=0;
        boolean result =true;

        for (int i : arr1){
            if(i!=arr2.get(counter)){
                result=false;
                break;
            }
            counter++;
        }
        System.out.println(result);





    }
}