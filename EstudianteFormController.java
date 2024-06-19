
/**
 * Write a description of class Controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EstudianteFormController {

    @FXML
    private TextField codigoField;
    @FXML
    private TextField documentoField;
    @FXML
    private ComboBox<String> tipoDocumentoCombo;
    @FXML
    private TextField nombresField;
    @FXML
    private TextField apellidosField;
    @FXML
    private DatePicker fechaNacimientoPicker;
    @FXML
    private ComboBox<String> generoCombo;
    @FXML
    private TextField estratoField;
    @FXML
    private TextField correoField;

    // Método para inicializar el controlador
    @FXML
    public void initialize() {
        tipoDocumentoCombo.getItems().addAll("CC", "CE", "TI", "RC", "NUIP");
        generoCombo.getItems().addAll("M", "F");
    }

    // Manejar la acción del botón Guardar
    @FXML
    private void handleGuardarAction(ActionEvent event) {
        String codigo = codigoField.getText();
        String documento = documentoField.getText();
        String tipoDocumento = tipoDocumentoCombo.getValue();
        String nombres = nombresField.getText();
        String apellidos = apellidosField.getText();
        java.time.LocalDate fechaNacimiento = fechaNacimientoPicker.getValue();
        String genero = generoCombo.getValue();
        int estrato = Integer.parseInt(estratoField.getText());
        String correo = correoField.getText();

        // Aquí puedes crear un nuevo estudiante con los datos ingresados
        // y guardarlo o realizar la acción correspondiente.
        // Ejemplo:
        Estudiante estudiante = new Estudiante(codigo, documento, tipoDocumento, nombres, apellidos, java.sql.Date.valueOf(fechaNacimiento), genero.charAt(0), estrato, correo);

        // Agregar el estudiante a la lista o base de datos.
    }
    
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("EstudianteForm.fxml"));
        primaryStage.setTitle("Registro de Estudiante");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    
}
