import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOperation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите вторую строку: ");
        String str2 = reader.readLine();

        reversString(str2);
    }

    public static void reversString(String s) {
        char[] chArr = s.toCharArray();
        String result = "";
        String buffOne = "";
        String buffTwo = "";
        int index = 0;

        if(chArr.length % 2 == 0){
            for(int i = 0; i < chArr.length; i++){
                if(i < chArr.length / 2){
                    buffOne += chArr[i];
                }
                else {
                    buffTwo += chArr[i];
                }
            }
            result = (buffTwo + buffOne);
        }

        else {
            for (int i = 0; i < chArr.length; i++) {
                if (i < chArr.length / 2) {
                    buffOne += chArr[i];
                }
                else if (i == chArr.length / 2) {
                    index = i;
                } else {
                    buffTwo += chArr[i];
                }
            }
            result = (buffTwo + chArr[index] + buffOne);
        }

        System.out.println("Результат второй строки: " + result);
    }
}
