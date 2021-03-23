package main.java;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        SceneManager.setStage(primaryStage);

        SceneManager.addScene("login", "../resources/view/login.fxml");
        SceneManager.addScene("register", "../resources/view/register.fxml");
<<<<<<< HEAD
        SceneManager.addScene("password_reset", "../resources/view/passwordReset.fxml");
=======
        SceneManager.addScene("passwordReset", "../resources/view/passwordReset.fxml");

        SceneManager.addScene("client", "../resources/view/client/client.fxml");

        SceneManager.addScene("courier", "../resources/view/courier.fxml");
        SceneManager.addScene("courierHome", "../resources/view/courier.fxml");

        //TU SCENY KURIERA MIEDZYODDZIALOWEGO

        //TU SCENY KIEROWNIKA

        SceneManager.addScene("admin", "../resources/view/admin/admin.fxml");


        SceneManager.renderScene("login");
>>>>>>> e63fa5f0662cb180f94c1c75e3401291fb48262d

        primaryStage.setResizable(false);

    }
}
