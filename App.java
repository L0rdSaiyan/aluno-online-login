// Author: Lord Saiyan (Joao Victor)
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
    
    public static void main(String args[]) throws Exception
    {
        // Executa a aplicação.
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{

//Carrega o arquivo FXML do SceneBuilder
   FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("layout.fxml"));
   Parent root = fxmlloader.load();
   Scene tela = new Scene(root);

//Define o icone para a aplicação
Image icon = new Image("favicon.PNG");
primaryStage.getIcons().add(icon);

    //Nomeia o titulo da janela
    primaryStage.setTitle("Aluno Online");
    primaryStage.setScene(tela);
    primaryStage.show();
    }


}