package geekbrains.homework2_2;

public class ArrayCreater {
    private String[][] array;

    public ArrayCreater(String[][] array) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                this.array[i][j] = array[i][j];
            }
        }
    }
}

