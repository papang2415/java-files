package insertarray;

public class InsertArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 6, 10, 25, 48};
        int insert = 10;
        int temp = 0;
        int[] newArr = new int[arr.length + 1];
        int len = arr.length;

        for (int cnt = len - 1; cnt >= 0; cnt--) {
            temp = arr[cnt];
            newArr[cnt + 1] = temp;
            if (cnt == 0) {
                newArr[0] = insert;
            }
        }
        System.out.print("The Original Array: ");
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        System.out.println(" ");
        System.out.print("The  Array: ");
        System.out.print("{");
        for (int b = 0; b < newArr.length; b++) {
            System.out.print(newArr[b]);
            if (newArr.length - 1 != b) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
