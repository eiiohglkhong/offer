public class Main {

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 8;
        array[0][3] = 9;

        array[1][0] = 2;
        array[1][1] = 4;
        array[1][2] = 9;
        array[1][3] = 12;

        array[2][0] = 4;
        array[2][1] = 7;
        array[2][2] = 10;
        array[2][3] = 13;

        array[3][0] = 6;
        array[3][1] = 8;
        array[3][2] = 11;
        array[3][3] = 15;

        int found_number = 4;

        int rows = 4;
        int columns = 4;

        int row = 0;
        int column = columns - 1;
        boolean isFound = false;
        while(row >= 0 && column >=0 && row < rows) {
            if(array[row][column] == found_number) {
                isFound = true;
                break;
            } else if(array[row][column] > found_number) {
                column--;
            } else {
                row++;
            }
        }
        if(isFound) {
            System.out.println("found it!");
        } else {
            System.out.println("Don't found it!");
        }

    }
}
