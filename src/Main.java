
public class Main {
    public static void main(String[] args) {
        int[] array = {17, 12, 35, 54, 8};

        //Reversed array
        int[] reversedArray = new int[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            reversedArray[j - 1] = array[i];
            j = j - 1;
        }
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }

        //Array is sorted or not
        boolean isSorted = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                isSorted = true;
            } else {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }

        //Second largest element in array
        int max=array[0];
        int secondMax =0;
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                secondMax=max;
                max=array[i];

            }
        }
        System.out.println(secondMax);
    }
}