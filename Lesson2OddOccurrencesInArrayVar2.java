
public class Lesson2OddOccurrencesInArrayVar2 {
    public static void main(String[] args) {

        int Array1[] = {4, 5, 23, 7, 7, 23, 4, 5, 9};
        int answer1 = Array1[0];
        for (int i = 1; i < Array1.length; i++) {
            answer1 = answer1 ^ Array1[i];
        }
        System.out.println("answer1 - " + answer1);


        int[] Array2 = new int[9];

        Array2[0] = 4;
        Array2[1] = 5;
        Array2[2] = 23;
        Array2[3] = 7;
        Array2[4] = 7;
        Array2[5] = 23;
        Array2[6] = 4;
        Array2[7] = 5;
        Array2[8] = 9;

        int answer2 = Array2[0];

        for (int j = 1; j < Array2.length; j++) {

            answer2 ^= Array2[j];
//            answer2 = answer2 ^ Array2[j];

        }
        System.out.println("answer2 - " + answer2);


        int x0 = 4, x1 = 5, x2 = 23, x3 = 7, x4 = 7, x5 = 23, x6 = 4, x7 = 5, x8 = 9;

        int answer3 = x0;

        answer3 = answer3 ^ x1; // стало 1
        System.out.println(answer3);
        answer3 = answer3 ^ x2; // стало 22
        System.out.println(answer3);
        answer3 = answer3 ^ x3; // стало 17
        System.out.println(answer3);
        answer3 = answer3 ^ x4; // стало 22
        System.out.println(answer3);
        answer3 = answer3 ^ x5; // стало 1
        System.out.println(answer3);
        answer3 = answer3 ^ x6; // стало 5
        System.out.println(answer3);
        answer3 = answer3 ^ x7; // стало 0
        System.out.println(answer3);
        answer3 = answer3 ^ x8; // стало 9
        System.out.println("answer3 - " + answer3);

    }
}
