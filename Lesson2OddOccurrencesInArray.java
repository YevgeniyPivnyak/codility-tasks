
public class Lesson2OddOccurrencesInArray {
    public static void main(String[] args) {

        int[] Array11 = new int[11];
        int[] Array12;

        Array11[0] = 1;
        Array11[1] = 2;
        Array11[2] = 1;
        Array11[3] = 3;
        Array11[4] = 4;
        Array11[5] = 3;
        Array11[6] = 4;
        Array11[7] = 6;
        Array11[8] = 5;
        Array11[9] = 6;
        Array11[10] = 1;

        Array12 = Array11;

        for (int i = 0; i < Array11.length; i++) {
            System.out.print(Array11[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < Array12.length; j++) {
            System.out.print(Array12[j] + " ");
        }
        System.out.println();
        System.out.println("////////////////////////////////////");

        unpairedArray(Array11, Array12);

    }

    public static int unpairedArray(int[] Array11, int[] Array12) {

        for (int i = 0; i < Array11.length; i++) {
//            System.out.println(i);
            int count = 0;

            for (int j = 0; j < Array12.length; j++) {

                System.out.println(i);
                if (i == j) {count++; }
            }if (count == 1) {
                return i;
            }
        }
        return 0;
    }
}
