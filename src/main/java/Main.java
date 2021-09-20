import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] gridArray = new String[5][5];

        for(int i = 0; i < gridArray.length; i++){
            for(int y = 0; y < gridArray.length; y++){
                gridArray[y][i] = "O";
            }
        }

        System.out.println("| " + gridArray[0][0] + " - " + gridArray[0][1] + " - " + gridArray[0][2] + " - "+ gridArray[0][3] + " - "+ gridArray[0][4] + " |\n" +
                "| " + gridArray[1][0] + " - " + gridArray[1][1] + " - " + gridArray[1][2] + " - "+ gridArray[1][3] + " - "+ gridArray[1][4] + " |\n" +
                "| " + gridArray[2][0] + " - " + gridArray[2][1] + " - " + gridArray[2][2] + " - "+ gridArray[2][3] + " - "+ gridArray[2][4] + " |\n" +
                "| " + gridArray[3][0] + " - " + gridArray[3][1] + " - " + gridArray[3][2] + " - "+ gridArray[3][3] + " - "+ gridArray[3][4] + " |\n" +
                "| " + gridArray[4][0] + " - " + gridArray[4][1] + " - " + gridArray[4][2] + " - "+ gridArray[4][3] + " - "+ gridArray[4][4] + " |\n");

    }

}

