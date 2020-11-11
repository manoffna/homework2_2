package geekbrains.homework2_2;

public class Main {

    public static void main(String[] args) {
        String[][] array = {
                {"45", "1", "ds", "6"},
                {"3", "21", "3", "wq!"},
                {"45", "1", "ds", "6"},
                {"3", "21", "3", "wq!"},
        };

        size(array);
        System.out.println(check(array));
    }
        static int check(String[][] array){
            int s = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                    s += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                        throw new ArrayDataException(String.format("Значение массива не является цифрой : (%s)", array[i][j],e));
                }
            }
        }
            return s;
    }

    static void size(String[][] val) {
           if (val.length != 4) {
               throw new ArraySizeException(String.format("Размер массива %s вместо 4", val.length));
           }

           for (int i = 0; i < val.length; i++) {
               if (val[i].length !=4) {
                   throw new ArraySizeException(String.format("Размер массива(%s) вместо 4", i, val.length));
           }
       }
    }
}
