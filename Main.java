import java.util.Random;

public class Main {
    public static void main(String[] args){
        int i, a, sum;
        Random rand = new Random();
        int[][] znak = new int[10][10];
        for (i = 0; i < 10; i++) {
            for(a = 0; a < 10; a++) {
                znak[i][a] = rand.nextInt(50+50) - 50;
                System.out.print(znak[i][a] + " ");
            }
            sum = 0;
            for (a = 0; a < 10; a++) {
                sum += znak[i][a];
            }
            System.out.print("| Suma wiersza: " + sum);
            System.out.println();
        }
        for (a = 0; a < 10; a++) {
            System.out.print("--");
        }
        System.out.println();
        for (a = 0; a < 10; a++) {
            sum = 0;
            for (i = 0; i < 10; i++) {
                sum += znak[i][a];
            }
            System.out.print(sum + " ");
        }
        System.out.print("| Suma kolumny");
        System.out.println();
    }
}