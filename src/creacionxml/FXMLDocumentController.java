/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionxml;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Empleado;

/**
 *
 * @author daniel_f.caicedo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label ltitulo;
    @FXML
     private Label lnombre;
    @FXML
      private Label ldir;
    @FXML
       private Label ledad;
    @FXML
        private Label lem;
    @FXML
         private Label ldep;
    
    @FXML
  private TextField Tnom;
    @FXML
     private TextField tdir;
    @FXML
      private TextField ted;
    @FXML
       private TextField tco;
    
     @FXML
        private TextField tder;
    LinkedList<Empleado> listaempleados;
    
    @FXML
    private void agregar(ActionEvent event){
    String nombre =Tnom.getText();
    String direccion = tdir.getText();
    int edad = Integer.parseInt(ted.getText());
    String codigoEmpleado = tco.getText();
    String departamento = tder.getText();
    
     Empleado objE = new Empleado (codigoEmpleado, departamento, nombre, direccion, edad);
     listaempleados.add(objE);
     
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        listaempleados= new LinkedList<>();
    }    
    
}
