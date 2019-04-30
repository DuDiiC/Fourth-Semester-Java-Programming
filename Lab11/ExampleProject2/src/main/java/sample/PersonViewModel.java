package sample;

import javafx.beans.binding.When;
import javafx.beans.property.*;

import java.time.LocalDate;

public class PersonViewModel {

    private StringProperty nameProperty = new SimpleStringProperty();

    private BooleanProperty nameOkProperty = new SimpleBooleanProperty(false);

    private StringProperty surnameProperty = new SimpleStringProperty();

    private BooleanProperty disableSurnameProperty = new SimpleBooleanProperty(true);

    private BooleanProperty surnameOkProperty = new SimpleBooleanProperty(false);

    private IntegerProperty birthYearProperty = new SimpleIntegerProperty();

    private BooleanProperty confirmProperty = new SimpleBooleanProperty(false);

    private StringProperty ageProperty = new SimpleStringProperty();

    private BooleanProperty buttonProperty = new SimpleBooleanProperty(false);

    private IntegerProperty actualYearProperty = new SimpleIntegerProperty(LocalDate.now().getYear());

    public PersonViewModel() {

        nameOkProperty.bind(nameProperty.isNotEmpty());
        disableSurnameProperty.bind(nameProperty.isEmpty());
        surnameOkProperty.bind(surnameProperty.isNotEmpty());

        buttonProperty.bind(confirmProperty.not());

        ageProperty.bind(
                new When(birthYearProperty.isNotEqualTo(0))
                        .then(actualYearProperty.subtract(birthYearProperty).asString())
                        .otherwise("")
        );
    }

    public StringProperty getNameProperty() {
        return nameProperty;
    }

    public BooleanProperty getNameOkProperty() {
        return nameOkProperty;
    }

    public StringProperty getSurnameProperty() {
        return surnameProperty;
    }

    public BooleanProperty getDisableSurnameProperty() {
        return disableSurnameProperty;
    }

    public BooleanProperty getSurnameOkProperty() {
        return surnameOkProperty;
    }

    public IntegerProperty getBirthYearProperty() {
        return birthYearProperty;
    }

    public BooleanProperty getConfirmProperty() {
        return confirmProperty;
    }

    public StringProperty getAgeProperty() {
        return ageProperty;
    }

    public BooleanProperty getButtonProperty() {
        return buttonProperty;
    }
}
