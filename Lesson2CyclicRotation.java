
public class Lesson2CyclicRotation {

    public static void main(String[] args) {

        int[] Array1 = new int[10];

        for (int i = 0; i < 10; i++) {
            Array1[i] = i;
        }
        for (int i = 0; i < Array1.length; i++) {
            System.out.print(Array1[i] + " ");
        }System.out.println();


        shiftArray(Array1, 2);

    }

    public static int[] shiftArray(int[] Array1, int shift) {

        if (Array1 != null) {
            int length = Array1.length;
            int[] Array2 = new int[length];

            for (int j = 0; j < Array2.length; j++) {
                System.out.print(Array2[j] + " ");
            }System.out.println();
//
//            System.arraycopy(Array1, shift, Array2, 0, length - shift);
//
//            System.arraycopy(Array1, 0, Array2, length - shift, shift);

            for (int i = 0; i < Array1.length; i++) {
                Array2[i+shift]=Array1[i];
//                System.out.println(Array2[0] + " " + Array2[1] + " " + Array2[3]);
            }

            return Array2;


        } else {
            return null;

        }

    }

}
