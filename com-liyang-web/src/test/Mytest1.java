import org.junit.Assert;

public class Mytest1 {

    private  final  int a=0;
    public static void main(String[] args) {

        int[] data = {1, 2, 4, 6, 33, 78, 212};
//        int result = new Mytest1().search(data, 1);
//        int result2 = new Mytest1().search(data, 212);
//        int result3 = new Mytest1().search(data, 33);



        int result = new Mytest1().search1(data, 0, data.length, 1);
        int result2 = new Mytest1().search1(data, 0, data.length, 212);
        int result3 = new Mytest1().search1(data, 0, data.length, 33);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    public int search(int[] data, int m) {

        if (data == null) {
            return -1;
        }

        int i = 0;
        int j = data.length;
        while (i <= j) {
            int findDataLocation = (i + j) >> 1;

            if (m < data[findDataLocation]) {
                j = findDataLocation - 1;
            } else if (m > data[findDataLocation]) {
                i = findDataLocation + 1;
            } else {
                return findDataLocation;
            }
        }

        return -1;

    }

    public int search1(int[] data, int i, int j, int m) {


        int location = (i + j) >> 1;
        if (m == data[location]) {
            return i;
        } else if (m < data[location]) {
            return search1(data, i, location - 1, m);
        } else {
            return search1(data, location + 1, j, m);
        }
    }



}
