
///**
// * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
// * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
// */
public class LiyangSort {

    public static void main(String[] args) {
        int[] array = {3, 7, 4, 8, 23, 56, 77, 89, 46, 11, 66, 77};
        mysort1(array);
        for (int a : array) {
            System.out.println(" " + a);
        }
    }
    private static void mysort1(int[] array) {
        if (array == null) {
            return;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && !isEven(array[left])) {
                left++;
            }
            while (left < right && isEven(array[right])) {
                right--;
            }
            if (left < right) {
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
            }
            if (left >= right) {
                break;
            }
        }
    }

    private static boolean isEven(int i) {
        return (i & 0x1) == 0;
    }
    public static void mysort(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i]%2==1){
                i++;
                continue;
            }
            if (array[j]%2==0){
                j--;
                continue;
            }

            if (array[i] % 2 == 0 || array[j] % 2 == 1) {
                //交换
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

        }

    }
}
