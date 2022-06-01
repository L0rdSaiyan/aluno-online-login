import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Control {

    @FXML
    private Button btncancel;

    @FXML
    private Label labelmassa;

    @FXML
    private Label firstacc;
    
    @FXML
    private Button btnentrar;

    @FXML
    private RadioButton checkaluno;

    @FXML
    private RadioButton checkrespons;


    @FXML
    private ImageView eyepass;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    Alert alert = new Alert(AlertType.NONE);

    @FXML
    void btnentrar(ActionEvent event) {

        String name = username.getText();
        String senha = password.getText();

         if(name.equals("") || senha.equals("")){

        alert.setAlertType(AlertType.ERROR);  
        alert.setTitle("Erro ao efetuar o login");
        alert.setHeaderText("Insira os seus dados corretamente para efetuar o login.");     
        alert.show();    
        System.out.println("Erro ao efetuar o login. \nTente novamente.");

         }else{

           alert.setAlertType(AlertType.INFORMATION);
           alert.setTitle("Login bem sucedido.");
           alert.setHeaderText("Seja Bem-Vindo(a) "+name+"!");
           alert.show();
           username.setText("");
           password.setText("");
           System.out.println("Bem-vindo "+name);


         }


    }

    @FXML
    void cancel(ActionEvent event) {

        username.setText("");
        password.setText("");
        System.out.println("Escolheu cancelar o login.");

    }
     

    @FXML
    void checkradioaluno(ActionEvent event) {

        if(checkaluno.isSelected()){

         System.out.println("Escolheu entrar como aluno.");

        }

    }

    @FXML
    void checkradioresponsavel(ActionEvent event) {

     if(checkrespons.isSelected()){

      System.out.println("Escolheu entrar como responsável.");

     }

    }



    @FXML
    void eyeshow(MouseEvent event) {

        Image icon = new Image("eyeslash.PNG"); 
        eyepass.setImage(icon); 
        password.setVisible(true); 
        System.out.println("Escolheu deixar a senha visível.");

    }


    @FXML
    void pass(ActionEvent event) {
     
        //Em desenvolvimento.

    }

    @FXML
    void user(ActionEvent event) {
             //Em desenvolvimento.

    }

    @FXML
    void rpass(MouseEvent event) {

        alert.setAlertType(AlertType.INFORMATION);
        alert.setTitle("Recuperação de senha");
        alert.setHeaderText("Você será redirecionado para a página de recuperação de senha.");
        alert.show();
        System.out.println("Escolheu recuperar a senha.");

    }

    @FXML
    void firstacess(MouseEvent event) {

       alert.setAlertType(AlertType.INFORMATION);
       alert.setTitle("Primeiro acesso");
       alert.setHeaderText("Você está sendo redirecionado para a página de primeiro acesso.");
       alert.show();
       System.out.println("Escolheu entrar como primeiro acesso.");

    }
   

}
