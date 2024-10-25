import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int[][] directions = { {0, 1}, {-1, 0}, {0, -1}, {1, 0} }; //right up left down
        int directionIndex = 0;

        int x = n / 2;
        int y = n / 2;

        int num = 1;
        array[x][y] = num;
        num++;
        int steps = 1;

        while (num <= n * n) {
            for (int i = 0; i < 2; i++) {   //after 2 directions number of steps increases by one
                for (int j = 0; j < steps; j++) {
                    if (num > n * n) break;
                    x += directions[directionIndex][0];
                    y += directions[directionIndex][1];
                    array[x][y] = num++;
                }
                directionIndex = (directionIndex + 1) % 4;
            }
            steps++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(array[i][j]<10){
                    System.out.print(array[i][j]+"  ");
                }else {
                    System.out.print(array[i][j] + " ");
                }
            }

            System.out.println();
        }


    }
}