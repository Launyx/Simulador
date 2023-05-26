import java.io.IOException;
import java.lang.reflect.Array;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class UnidadeControle extends Application implements EventHandler<ActionEvent>{

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField Registro1;

    @FXML
    private TextField Registro2;

    @FXML
    private TextField Resultado;

    @FXML
    private TextField ULAA;

    @FXML
    private TextField ULAB;

    @FXML
    private TextField barramentoA;

    @FXML
    private TextField barramentoB;

    @FXML
    private TextField barramentoC;

    @FXML
    private TextField memoria1;

    @FXML
    private TextField memoria2;

    @FXML
    private TextField memoria3;

    @FXML
    private TextField memoria4;

    @FXML
    private TextField memoria5;

    @FXML
    private TextField memoria6;

    @FXML
    private Button escolheMemoria;

    @FXML
    private Button escolheRegistrador;

    @FXML
    private Button retornar;

    @FXML
    private Button buttonIniciar;

    @FXML
    private Rectangle barra1;

    @FXML
    private Rectangle barra10;

    @FXML
    private Rectangle barra11;

    @FXML
    private Rectangle barra2;

    @FXML
    private Rectangle barra3;

    @FXML
    private Rectangle barra4;

    @FXML
    private Rectangle barra5;

    @FXML
    private Rectangle barra6;

    @FXML
    private Rectangle barra7;

    @FXML
    private Rectangle barra8;

    @FXML
    private Rectangle barra9;

    Button button;
     public static void main(String[] args) throws InterruptedException {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("escolha.fxml"));
        Parent root2 = fxmlLoader2.load();
        Scene tela2 = new Scene(root2);
        
        primaryStage.getIcons().add(new Image("JavaIcon.png"));
        primaryStage.setTitle("Simulador de CPU");
        primaryStage.setScene(tela2);
        primaryStage.show();

    }

    @FXML
    public void IniciarR(ActionEvent event) throws InterruptedException{

        barra1.setStyle("-fx-fill: green");
        barra2.setStyle("-fx-fill: green");
        barra3.setStyle("-fx-fill: green");
        barra4.setStyle("-fx-fill: green");
        barra5.setStyle("-fx-fill: green");
        barra6.setStyle("-fx-fill: green");
        barra7.setStyle("-fx-fill: green");
        barra8.setStyle("-fx-fill: green");
        barra9.setStyle("-fx-fill: green");
        barra10.setStyle("-fx-fill: green");
        barra11.setStyle("-fx-fill: green");

        String registradores[] = new String[2];

        String reg1 = Registro1.getText();
        String reg2 = Registro2.getText();

        Array.set(registradores, 0, reg1);
        Array.set(registradores, 1, reg2);


        delay(2000, () -> { 
            barra3.setStyle("-fx-fill: red");
            barra4.setStyle("-fx-fill: red");
            barramentoA.setText(Registro1.getText());
            barramentoB.setText(Registro2.getText());  
        });


        delay(4000, () -> { 
            barra5.setStyle("-fx-fill: red");
            barra6.setStyle("-fx-fill: red");
            barra7.setStyle("-fx-fill: red");
            barra8.setStyle("-fx-fill: red");
            ULAA.setText(barramentoA.getText());
            ULAB.setText(barramentoB.getText());
        });
    }

    @FXML
    public void IniciarM(ActionEvent event) throws InterruptedException {

        Registro1.setText("");
        Registro2.setText("");

        barra1.setStyle("-fx-fill: green");
        barra2.setStyle("-fx-fill: green");
        barra3.setStyle("-fx-fill: green");
        barra4.setStyle("-fx-fill: green");
        barra5.setStyle("-fx-fill: green");
        barra6.setStyle("-fx-fill: green");
        barra7.setStyle("-fx-fill: green");
        barra8.setStyle("-fx-fill: green");
        barra9.setStyle("-fx-fill: green");
        barra10.setStyle("-fx-fill: green");
        barra11.setStyle("-fx-fill: green");

        String memoria[] = new String[6];

        String mem1 = memoria1.getText();
        String mem2 = memoria2.getText();
        String mem3 = memoria3.getText();
        String mem4 = memoria4.getText();
        String mem5 = memoria5.getText();
        String mem6 = memoria6.getText();

        Array.set(memoria, 0, mem1);
        Array.set(memoria, 1, mem2);
        Array.set(memoria, 2, mem3);
        Array.set(memoria, 3, mem4);
        Array.set(memoria, 4, mem5);
        Array.set(memoria, 5, mem6);

        
        for (int i = memoria.length - 1; i >= 0; i--){
            if(memoria[i] != "" && Registro2.getText() == ""){
                Registro2.setText(memoria[i]);
            }else if(memoria[i] != "" && Registro1.getText() == ""){
                Registro1.setText(memoria[i]);
            }
        }
        
        barra1.setStyle("-fx-fill: red");
        barra2.setStyle("-fx-fill: red");

        // Registro1.setText(mem1);
        // Registro2.setText(mem2);

        delay(2000, () -> { 
            barra3.setStyle("-fx-fill: red");
            barra4.setStyle("-fx-fill: red");
            barramentoA.setText(Registro1.getText());
            barramentoB.setText(Registro2.getText());              
        });
        

        delay(4000, () -> { 
            barra5.setStyle("-fx-fill: red");
            barra6.setStyle("-fx-fill: red");
            barra7.setStyle("-fx-fill: red");
            barra8.setStyle("-fx-fill: red");
            ULAA.setText(barramentoA.getText());
            ULAB.setText(barramentoB.getText());
        });

    }

    @FXML
    public void ResetarR(ActionEvent event) {
        memoria1.setText(null);
        memoria2.setText(null);
        memoria3.setText(null);
        memoria4.setText(null);
        memoria5.setText(null);
        memoria6.setText(null);

        Registro1.setText(null);
        Registro2.setText(null);

        barramentoA.setText(null);
        barramentoB.setText(null);
        barramentoC.setText(null);

        ULAA.setText(null);
        ULAB.setText(null);

        Resultado.setText(null);

        barra1.setStyle("-fx-fill: green");
        barra2.setStyle("-fx-fill: green");
        barra3.setStyle("-fx-fill: green");
        barra4.setStyle("-fx-fill: green");
        barra5.setStyle("-fx-fill: green");
        barra6.setStyle("-fx-fill: green");
        barra7.setStyle("-fx-fill: green");
        barra8.setStyle("-fx-fill: green");
        barra9.setStyle("-fx-fill: green");
        barra10.setStyle("-fx-fill: green");
        barra11.setStyle("-fx-fill: green");
    }

    @FXML
    public void ResetarM(ActionEvent event) {
        memoria1.setText("");
        memoria2.setText("");
        memoria3.setText("");
        memoria4.setText("");
        memoria5.setText("");
        memoria6.setText("");

        Registro1.setText("");
        Registro2.setText("");

        barramentoA.setText("");
        barramentoB.setText("");
        barramentoC.setText("");

        ULAA.setText("");
        ULAB.setText("");

        Resultado.setText("");

        barra1.setStyle("-fx-fill: green");
        barra2.setStyle("-fx-fill: green");
        barra3.setStyle("-fx-fill: green");
        barra4.setStyle("-fx-fill: green");
        barra5.setStyle("-fx-fill: green");
        barra6.setStyle("-fx-fill: green");
        barra7.setStyle("-fx-fill: green");
        barra8.setStyle("-fx-fill: green");
        barra9.setStyle("-fx-fill: green");
        barra10.setStyle("-fx-fill: green");
        barra11.setStyle("-fx-fill: green");
    }

    @FXML
    public void Soma(ActionEvent event) {

        barra1.setStyle("-fx-fill: green");
        barra2.setStyle("-fx-fill: green");
        barra9.setStyle("-fx-fill: green");
        barra10.setStyle("-fx-fill: green");
        barra11.setStyle("-fx-fill: green");

        float n1 = Float.parseFloat(ULAA.getText());
        float n2 = Float.parseFloat(ULAB.getText());

        float soma = n1 + n2;

        Resultado.setText(String.valueOf(soma));

        delay(2000, () -> { 
            barra9.setStyle("-fx-fill: red");
            barra10.setStyle("-fx-fill: red");
            barramentoC.setText(String.valueOf(soma));
        });


        delay(4000, () -> { 
            barra11.setStyle("-fx-fill: red");
            Registro1.setText(barramentoC.getText());
        });
        
        delay(6000, () -> { 
            barra1.setStyle("-fx-fill: red");
            barra2.setStyle("-fx-fill: red");
            if (memoria1.getText() == ""){
                memoria1.setText(Registro1.getText());
            }else if(memoria2.getText() == ""){
                memoria2.setText(Registro1.getText());
            }else if(memoria3.getText() == ""){
                memoria3.setText(Registro1.getText());
            }else if(memoria4.getText() == ""){
                memoria4.setText(Registro1.getText());
            }else if(memoria5.getText() == ""){
                memoria5.setText(Registro1.getText());
            }else if(memoria6.getText() == ""){
                memoria6.setText(Registro1.getText());
            }
        });
    }

    @FXML
    public void Subtracao(ActionEvent event) {

        barra1.setStyle("-fx-fill: green");
        barra2.setStyle("-fx-fill: green");
        barra9.setStyle("-fx-fill: green");
        barra10.setStyle("-fx-fill: green");
        barra11.setStyle("-fx-fill: green");

        float n1 = Float.parseFloat(ULAA.getText());
        float n2 = Float.parseFloat(ULAB.getText());

        float sub = n1 - n2;

        Resultado.setText(String.valueOf(sub));

        delay(2000, () -> { 
            barra9.setStyle("-fx-fill: red");
            barra10.setStyle("-fx-fill: red");
            barramentoC.setText(String.valueOf(sub));
        });

        delay(4000, () -> { 
            barra11.setStyle("-fx-fill: red");
            Registro1.setText(barramentoC.getText());
        });

        delay(6000, () -> { 
            barra1.setStyle("-fx-fill: red");
            barra2.setStyle("-fx-fill: red");
            if (memoria1.getText() == ""){
                memoria1.setText(Registro1.getText());
            }else if(memoria2.getText() == ""){
                memoria2.setText(Registro1.getText());
            }else if(memoria3.getText() == ""){
                memoria3.setText(Registro1.getText());
            }else if(memoria4.getText() == ""){
                memoria4.setText(Registro1.getText());
            }else if(memoria5.getText() == ""){
                memoria5.setText(Registro1.getText());
            }else if(memoria6.getText() == ""){
                memoria6.setText(Registro1.getText());
            }
            
        });
    }

    @FXML
    public void multi(ActionEvent event) {

        barra1.setStyle("-fx-fill: green");
        barra2.setStyle("-fx-fill: green");
        barra9.setStyle("-fx-fill: green");
        barra10.setStyle("-fx-fill: green");
        barra11.setStyle("-fx-fill: green");

        float n1 = Float.parseFloat(ULAA.getText());
        float n2 = Float.parseFloat(ULAB.getText());

        float mult = n1 * n2;

        Resultado.setText(String.valueOf(mult));
        delay(2000, () -> { 
            barra9.setStyle("-fx-fill: red");
            barra10.setStyle("-fx-fill: red");
            barramentoC.setText(String.valueOf(mult));
        });

        delay(4000, () -> { 
            barra11.setStyle("-fx-fill: red");
            Registro1.setText(barramentoC.getText());
        });

        delay(6000, () -> { 
            barra1.setStyle("-fx-fill: red");
            barra2.setStyle("-fx-fill: red");
            if (memoria1.getText() == ""){
                memoria1.setText(Registro1.getText());
            }else if(memoria2.getText() == ""){
                memoria2.setText(Registro1.getText());
            }else if(memoria3.getText() == ""){
                memoria3.setText(Registro1.getText());
            }else if(memoria4.getText() == ""){
                memoria4.setText(Registro1.getText());
            }else if(memoria5.getText() == ""){
                memoria5.setText(Registro1.getText());
            }else if(memoria6.getText() == ""){
                memoria6.setText(Registro1.getText());
            }
            
        });
    }

    @FXML
    public void divisao(ActionEvent event) {

        barra1.setStyle("-fx-fill: green");
        barra2.setStyle("-fx-fill: green");
        barra9.setStyle("-fx-fill: green");
        barra10.setStyle("-fx-fill: green");
        barra11.setStyle("-fx-fill: green");

        float n1 = Float.parseFloat(ULAA.getText());
        float n2 = Float.parseFloat(ULAB.getText());

        float div = n1 / n2;

        Resultado.setText(String.valueOf(div));
        delay(2000, () -> { 
            barra9.setStyle("-fx-fill: red");
            barra10.setStyle("-fx-fill: red");
            barramentoC.setText(String.valueOf(div));
        });

        delay(4000, () -> { 
            barra11.setStyle("-fx-fill: red");
            Registro1.setText(barramentoC.getText());
        });

        delay(6000, () -> { 
            
            barra1.setStyle("-fx-fill: red");
            barra2.setStyle("-fx-fill: red");
            if (memoria1.getText() == ""){
                memoria1.setText(Registro1.getText());
            }else if(memoria2.getText() == ""){
                memoria2.setText(Registro1.getText());
            }else if(memoria3.getText() == ""){
                memoria3.setText(Registro1.getText());
            }else if(memoria4.getText() == ""){
                memoria4.setText(Registro1.getText());
            }else if(memoria5.getText() == ""){
                memoria5.setText(Registro1.getText());
            }else if(memoria6.getText() == ""){
                memoria6.setText(Registro1.getText());
            }
            
        });
    }

    @FXML
    public void potencia(ActionEvent event) {

        barra1.setStyle("-fx-fill: green");
        barra2.setStyle("-fx-fill: green");
        barra9.setStyle("-fx-fill: green");
        barra10.setStyle("-fx-fill: green");
        barra11.setStyle("-fx-fill: green");

        float n1 = Float.parseFloat(ULAA.getText());
        float n2 = Float.parseFloat(ULAB.getText());

        double pot = Math.pow(n1, n2);

        Resultado.setText(String.valueOf(pot));
        delay(2000, () -> { 
            barra9.setStyle("-fx-fill: red");
            barra10.setStyle("-fx-fill: red");
            barramentoC.setText(String.valueOf(pot));
        });

        delay(4000, () -> { 
            barra11.setStyle("-fx-fill: red");
            Registro1.setText(barramentoC.getText());
        });

        delay(6000, () -> { 
            barra1.setStyle("-fx-fill: red");
            barra2.setStyle("-fx-fill: red");
            if (memoria1.getText() == ""){
                memoria1.setText(Registro1.getText());
            }else if(memoria2.getText() == ""){
                memoria2.setText(Registro1.getText());
            }else if(memoria3.getText() == ""){
                memoria3.setText(Registro1.getText());
            }else if(memoria4.getText() == ""){
                memoria4.setText(Registro1.getText());
            }else if(memoria5.getText() == ""){
                memoria5.setText(Registro1.getText());
            }else if(memoria6.getText() == ""){
                memoria6.setText(Registro1.getText());
            }
            
        });
    }

    @FXML
    public void resto(ActionEvent event) {

        barra1.setStyle("-fx-fill: green");
        barra2.setStyle("-fx-fill: green");
        barra9.setStyle("-fx-fill: green");
        barra10.setStyle("-fx-fill: green");
        barra11.setStyle("-fx-fill: green");

        float n1 = Float.parseFloat(ULAA.getText());
        float n2 = Float.parseFloat(ULAB.getText());

        float rest = n1 % n2;

        Resultado.setText(String.valueOf(rest));
        delay(2000, () -> { 
            barra9.setStyle("-fx-fill: red");
            barra10.setStyle("-fx-fill: red");
            barramentoC.setText(String.valueOf(rest));
        });    

        delay(4000, () -> { 
            barra11.setStyle("-fx-fill: red");
            Registro1.setText(barramentoC.getText());
        });


        delay(6000, () -> { 
            barra1.setStyle("-fx-fill: red");
            barra2.setStyle("-fx-fill: red");
            if (memoria1.getText() == ""){
                memoria1.setText(Registro1.getText());
            }else if(memoria2.getText() == ""){
                memoria2.setText(Registro1.getText());
            }else if(memoria3.getText() == ""){
                memoria3.setText(Registro1.getText());
            }else if(memoria4.getText() == ""){
                memoria4.setText(Registro1.getText());
            }else if(memoria5.getText() == ""){
                memoria5.setText(Registro1.getText());
            }else if(memoria6.getText() == ""){
                memoria6.setText(Registro1.getText());
            }
            
        });
    }

    @FXML
    public void escolheMemo(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void escolheRegis(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Layout2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void retornaTelaR(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("escolha.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void retornaTelaM(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("escolha.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void delay(long millis, Runnable continuation) {
        Task<Void> sleeper = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try { Thread.sleep(millis); }
                catch (InterruptedException e) { }
                return null;
            }
        };
        sleeper.setOnSucceeded(event -> continuation.run());
        new Thread(sleeper).start();
      }

    @Override
    public void handle(ActionEvent arg0) {
        throw new UnsupportedOperationException("Unimplemented method 'handle'");
    }
}