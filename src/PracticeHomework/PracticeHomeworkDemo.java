package PracticeHomework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {

        //Create object of class PracticeHomework

        PracticeHomework MyObject = new PracticeHomework();

        //Minutes to seconds

        System.out.println("Seconds is " + MyObject.minutesToSeconds(60));

        //Years to months

        System.out.println("Months is " + MyObject.yearToMonths(5));

        //Return next number

        System.out.println("Next number is " + MyObject.nextNumber(5));

        //Return true,if numbers are equal,else return false

        System.out.println("Numbers are equal  " + MyObject.isSameNum(0,5));

        //Return true,if munber less or equal 0,else return false

        System.out.println("Number less or equal 0 " + MyObject.lessThanEqualToZero(5));

        //Return false,if value true.Return true,if value false

        System.out.println("Reverse bool is " + MyObject.reverseBool(false));

        //Return max length of arrays

        int[] array1 = {1,5,4,23,8,56,3,789};
        int[] array2 = {11,65,41,23,1368,545,3,7,146,541,546,87};
        System.out.println("Max length of arrays is " + MyObject.maxLength(array1,array2));





    }
}
