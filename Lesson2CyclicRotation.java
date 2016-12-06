
public class Lesson2CyclicRotation {

    public static void main(String[] args) {

        int[] Array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            Array1[i] = i;
        }

        System.out.println(Array1[0] + " " + Array1[1] + " " + Array1[3]);

        shiftArray(Array1, 2);


    }

    public static int[] shiftArray(int[] Array1, int shift) {

        if (Array1 != null) {


            int length = Array1.length;
            int[] Array2 = new int[length];

            System.out.println(Array2[0] + " " + Array2[1] + " " + Array2[3]);

            System.arraycopy(Array1, shift, Array2, 0, length - shift);


            System.arraycopy(Array1, 0, Array2, length - shift, shift);
            return Array2;

        } else {
            return null;
        }

    }
}
