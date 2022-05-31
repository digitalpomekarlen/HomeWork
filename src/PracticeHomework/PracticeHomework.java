package PracticeHomework;

public class PracticeHomework {

    //Convert minutes to seconds
    long minutesToSeconds(int minutes){
        return minutes * 60;
    }

    //Convert year to months
    int yearToMonths(int years){
        return years * 12;
    }

    //Return next number

    int nextNumber(int number){
        return number + 1;
    }

    //Return equal or not 2 numbers
    boolean isSameNum(int a,int b){
        if(a == b){
            return true;
        }else{
            return false;
        }
    }

    //Return true,if munber less or equal 0,else return false
    boolean lessThanEqualToZero(int number){
        if(number <= 0){
            return true;
        }else{
            return false;
        }
    }

    //Reverse bool
    boolean reverseBool(boolean value){
        return !value;
    }

    //Return maxLength of arrays
    int maxLength(int[] array1,int[] array2){
        if(array1.length > array2.length){
            return array1.length;
        }else if(array1.length < array2.length){
            return array2.length;
        }else{
            return 0;
        }
    }

}
