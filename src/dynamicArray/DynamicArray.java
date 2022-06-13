package dynamicArray;

public class DynamicArray {

    int arr[];
    int count;

    public DynamicArray(int lenght){
        arr = new int[lenght];
    }

    public void printArray(){
        for(int i = 0; i < count;i++){
            System.out.println(arr[i]);
        }
    }

    public void add(int element){
        if(arr.length == count) {
            int newArr[] = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[count++] = element;

    }


}
