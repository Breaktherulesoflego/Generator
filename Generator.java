public class Generator {
    public static void main(String[] args) {
        stars(7);
        triangle(9);
        odds(9);
        eo(6);
        pyramid(5);
    }

    public static void stars(int rows) {
        int row = 0;
        while (row < rows) {
            int count = 0;
            while (count < 2 * row + 1) {
                System.out.print('*');
                count++;
            }
            System.out.println();
            row++;
        }
    }

    public static void triangle(int rows) {
        int row = 1;
        while (row <= rows) {
            int count = 0;
            while (count < row) {
                System.out.print(row);
                count++;
            }
            System.out.println();
            row++;
        }
    }

    public static void odds(int start) {
        for (int value = start; value >= 1; value -= 2) {
            for (int count = 0; count < value; count++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void eo(int maxE) {
        if (maxE <= 0) {
            return;
        }

        char first = maxE % 2 == 0 ? 'O' : 'E';
        int row = 1;
        while (row <= maxE) {
            printLetters(first, row);
            row++;
        }
        row = maxE - 1;
        while (row >= 1) {
            printLetters(first, row);
            row--;
        }
    }

    public static void pyramid(int rows) {
        int row = 1;
        while (row <= rows) {
            int spaces = 1;
            while (spaces < row) {
                System.out.print(' ');
                spaces++;
            }
            int count = 0;
            while (count < 2 * (rows - row) + 1) {
                System.out.print(row);
                count++;
            }
            System.out.println();
            row++;
        }
    }

    private static void printLetters(char first, int row) {
        char letter = row % 2 == 1 ? first : (first == 'O' ? 'E' : 'O');
        int count = 0;
        while (count < row) {
            System.out.print(letter);
            count++;
        }
        System.out.println();
    }
}