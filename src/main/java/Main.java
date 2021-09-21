import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] gridArray = new String[5][5];
        String ships = "X";

        for(int i = 0; i < gridArray.length; i++){
            for(int y = 0; y < gridArray.length; y++){
                gridArray[y][i] = "O";
            }
        }

        System.out.println("0 | " + gridArray[0][0] + " - " + gridArray[0][1] + " - " + gridArray[0][2] +
                " - "+ gridArray[0][3] + " - "+ gridArray[0][4] + " |\n" +

                "1 | " + gridArray[1][0] + " - " + gridArray[1][1] + " - " + gridArray[1][2] +
                " - "+ gridArray[1][3] + " - "+ gridArray[1][4] + " |\n" +

                "2 | " + gridArray[2][0] + " - " + gridArray[2][1] + " - " + gridArray[2][2] +
                " - "+ gridArray[2][3] + " - "+ gridArray[2][4] + " |\n" +

                "3 | " + gridArray[3][0] + " - " + gridArray[3][1] + " - " + gridArray[3][2] +
                " - "+ gridArray[3][3] + " - "+ gridArray[3][4] + " |\n" +

                "4 | " + gridArray[4][0] + " - " + gridArray[4][1] + " - " + gridArray[4][2] +
                " - "+ gridArray[4][3] + " - "+ gridArray[4][4] + " |\n" +

                "↑y  0   1   2   3   4  ←x");






        for(int i = 1; i <= 2;) {
            System.out.println("Please choose your spot: y-axis");
            int input1 = scanner.nextInt();
            System.out.println("Please choose your spot: x-axis");
            int input2 = scanner.nextInt();

            System.out.println("Please give the direction: \n" +
                    "r = right \n" +
                    "l = left \n" +
                    "u = up \n" +
                    "d = down");


            String direction = scanner.next();
            switch (direction) {
                case "r":
                    if ((input1 >= 0 && input1 < 5) && (input2 >= 0 && input2 < 5)) {
                        gridArray[input1][input2] = ships;
                        gridArray[input1][input2 + 1] = ships;
                        i++;
                    }
                    break;
                case "l":
                    if ((input1 >= 0 && input1 < 5) && (input2 >= 0 && input2 < 5)) {
                        gridArray[input1][input2] = ships;
                        gridArray[input1][input2 - 1] = ships;
                        i++;
                    }
                    break;
                case "u":
                    if ((input1 >= 0 && input1 < 5) && (input2 >= 0 && input2 < 5)) {
                        gridArray[input1][input2] = ships;
                        gridArray[input1 - 1][input2] = ships;
                        i++;
                    }
                    break;
                case "d":
                    if ((input1 >= 0 && input1 < 5) && (input2 >= 0 && input2 < 5)) {
                        gridArray[input1][input2] = ships;
                        gridArray[input1 + 1][input2] = ships;
                        i++;
                    }
                    break;
            }
        }


        System.out.println("0 | " + gridArray[0][0] + " - " + gridArray[0][1] + " - " + gridArray[0][2] +
                " - "+ gridArray[0][3] + " - "+ gridArray[0][4] + " |\n" +

                "1 | " + gridArray[1][0] + " - " + gridArray[1][1] + " - " + gridArray[1][2] +
                " - "+ gridArray[1][3] + " - "+ gridArray[1][4] + " |\n" +

                "2 | " + gridArray[2][0] + " - " + gridArray[2][1] + " - " + gridArray[2][2] +
                " - "+ gridArray[2][3] + " - "+ gridArray[2][4] + " |\n" +

                "3 | " + gridArray[3][0] + " - " + gridArray[3][1] + " - " + gridArray[3][2] +
                " - "+ gridArray[3][3] + " - "+ gridArray[3][4] + " |\n" +

                "4 | " + gridArray[4][0] + " - " + gridArray[4][1] + " - " + gridArray[4][2] +
                " - "+ gridArray[4][3] + " - "+ gridArray[4][4] + " |\n" +

                "    " + "0" + "   " + "1" + "   " + "2" +
                "   "+ "3" + "   "+ "4");

    }

}

