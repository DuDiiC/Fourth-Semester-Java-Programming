import java.io.*;
import java.net.Socket;

public class Watek extends Thread {

    private Socket gniazdoKlienta;

    public Watek(Socket gniazdoKlienta) {
        this.gniazdoKlienta = gniazdoKlienta;
    }

    @Override
    public void run() {

        try {

            System.out.println("Polaczenie z klientem " + gniazdoKlienta.getPort());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gniazdoKlienta.getInputStream()));
            Integer iloscDanych = bufferedReader.read();

            System.out.println("Ilosc zmiennych na ktora czekam: " + iloscDanych);

            Integer suma = 0;

            for(int i = 0; i < iloscDanych; i++) {
                Integer tmp = bufferedReader.read();
                System.out.println(tmp);
                suma += tmp;
            }

            System.out.println("Wyliczylem sume... " + suma);

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gniazdoKlienta.getOutputStream()));
            bufferedWriter.write(suma);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            bufferedReader.close();
            bufferedWriter.close();
            gniazdoKlienta.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
