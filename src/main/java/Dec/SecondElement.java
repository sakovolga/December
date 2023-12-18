package Dec;


public class SecondElement {
    public static void main(String[] args) {
        int[] arr = {90, 54, 5, 8, 5, 13, 9, 9};
        System.out.println(getSecondMin(arr));
        System.out.println(getThirdMin(arr));
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    public static int getSecondMin(int[] arr){
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondMin && arr[i] > getMin(arr)) secondMin = arr[i];
        }
        return secondMin;
    }
    public static int getThirdMin(int[] arr){
        int thirdMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < thirdMin && arr[i] > getMin(arr) && arr[i] > getSecondMin(arr))
                thirdMin = arr[i];
        }
        return thirdMin;
    }
}

//    найти второй и третий по минимальности элемент в массиве.

