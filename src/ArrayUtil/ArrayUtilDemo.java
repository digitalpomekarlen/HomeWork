package ArrayUtil;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        //Create Array

        int[] numbers = {1,5,4,23,8,56,3,789};

        //Create object of class ArrayUtil

        ArrayUtil demoArray = new ArrayUtil();

        //Print All elements

        System.out.println("Array elements is ");
        demoArray.PrintAllElements(numbers);

        //Return maximum element

        System.out.println("Max value is " + demoArray.PrintMaxElement(numbers));

        //Return minimum value

        System.out.println("Min value is " + demoArray.PrintMinElement(numbers));

        //Return odd elements count

        System.out.println("Odd elements count of Array is " + demoArray.OddElementsCount(numbers));

        //Return even elements count

        System.out.println("Even elements count of Array is " + demoArray.EvenElementsCount(numbers));

        //Return average

        System.out.println("Average of array is " + demoArray.AverageOfarray(numbers));

        //Sum elements of array

        System.out.println("Average of array is " + demoArray.SumOfArray(numbers));




    }
}
