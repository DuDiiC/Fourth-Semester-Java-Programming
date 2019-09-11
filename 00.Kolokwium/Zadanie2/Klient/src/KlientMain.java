import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class KlientMain {

    public static void main(String[] args) throws IOException {

        Socket gniazdoKlienta = new Socket("localhost", 8889);

        Scanner input = new Scanner(System.in);
        Integer iloscDanych = input.nextInt();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gniazdoKlienta.getOutputStream()));
        bufferedWriter.write(iloscDanych);
        bufferedWriter.flush();

        for(int i = 0; i < iloscDanych; i++) {
            Integer tmp = input.nextInt();
            bufferedWriter.write(tmp);
        }
        bufferedWriter.flush();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gniazdoKlienta.getInputStream()));
        String suma = String.valueOf(bufferedReader.read());
        System.out.println(suma);

    }
}
