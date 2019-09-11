package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Kontroler {

    @FXML private TextField licznik1;

    @FXML private TextField mianownik1;

    @FXML private TextField licznik2;

    @FXML private TextField mianownik2;

    @FXML public void oblicz() {
        Integer licz1 = Integer.valueOf(licznik1.getText());
        Integer mian1 = Integer.valueOf(mianownik1.getText());
        Integer licz2 = Integer.valueOf(licznik2.getText());
        Integer mian2 = Integer.valueOf(mianownik2.getText());

        System.out.println(licz1*licz2 + "/" + mian1*mian2);

        licznik1.clear();
        mianownik1.clear();
        licznik2.clear();
        mianownik2.clear();
    }
}
