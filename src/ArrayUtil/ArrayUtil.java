package ArrayUtil;

public class ArrayUtil {

        //Print All elements
        void PrintAllElements(int[] MyArray ){
                for(int i = 0; i < MyArray.length; i++) {
                        System.out.println(MyArray[i]);
                }
        }

        //Return max element
        int PrintMaxElement(int[] MyArray){
                int max = MyArray[0];
                for (int i = 0; i < MyArray.length; i++) {
                        if (MyArray[i] > max) {
                                max = MyArray[i];
                        }
                }
                return max;
        }

        //Return min elemenet

        int PrintMinElement(int[] MyArray){
                int min = MyArray[0];
                for (int i = 0; i < MyArray.length; i++) {
                        if (MyArray[i] < min) {
                                min = MyArray[i];
                        }
                }
                return min;
        }

        //Return odd elements count
        int OddElementsCount(int[] MyArray){
                int countOdd = 0;
                for(int i = 0;i < MyArray.length;i++){
                        if(MyArray[i] % 2 == 1) {
                                countOdd++;
                        }
                }
                return countOdd;
        }

        //Return even elements count
        int EvenElementsCount(int[] MyArray){
                int countEven = 0;
                for(int i = 0;i < MyArray.length;i++){
                        if(MyArray[i] % 2 == 0) {
                                countEven++;
                        }
                }
                return countEven;
        }

        //The arithmetic average of array

        double AverageOfarray(int[] MyArray){
                double sumAverage = 0;
                for(int i = 0;i < MyArray.length;i++) {
                        sumAverage += MyArray[i];
                }
                return sumAverage / MyArray.length;
        }

        // Return sum of array

        int SumOfArray(int[] MyArray){
                int sumElements = 0;
                for(int i = 0;i < MyArray.length;i++) {
                        sumElements += MyArray[i];
                }
                return sumElements;
        }


}
