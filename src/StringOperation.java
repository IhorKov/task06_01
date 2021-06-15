import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOperation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первую строку: ");
        String str = reader.readLine();

        getMiddleChar(str);
    }

    public static void getMiddleChar(String s) {
        char[] chArr = s.toCharArray();
        String result = "";
        int index;

        if(chArr.length % 2 == 0) {
            index = chArr.length / 2;
            result += chArr[index - 1];
            result += chArr[index];
        }
        else {
            index = chArr.length / 2;
            result += chArr[index];
        }

        System.out.println("Результат: " + result);
    }
}
