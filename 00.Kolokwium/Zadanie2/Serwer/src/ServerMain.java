import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

    public static void main(String[] args) throws IOException {

        ServerSocket gniazdoSerwera = new ServerSocket(8889);

        while(true) {

            Socket gniazdoKlienta = gniazdoSerwera.accept();

            Watek watekDoObsugi = new Watek(gniazdoKlienta);
            watekDoObsugi.start();
        }

    }
}
