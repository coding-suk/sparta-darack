package part2.arrangement;

public class Array02 {
    public static void main(String[] args) {

        int[][] gugu = new int[10][10];

        for (int i = 2; i<gugu.length;i++) {
            for (int j = 1; j < gugu.length; j++) {
                gugu[i][j] = i * j;
//                System.out.println(i + " * " + j + " = " + gugu[i][j]);
            }
        }
        System.out.println();
        for (int i = 2; i<gugu.length;i++) {
            for (int j = 1; j < gugu.length; j++) {
                System.out.println(i + " * " + j + " = " + gugu[i][j]);
            }
        }
    }
}
