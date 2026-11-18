import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;

public class Controller {

    @FXML
    private Label display;

    @FXML
    private TextField inputField;

    private Random rand = new Random();
    private int value = rand.nextInt(1, 51);

    @FXML
    private void checkInput(ActionEvent e){

        if(isInteger(inputField.getText())) {
            int userInput = Integer.parseInt(inputField.getText());

            if(inputField.getText().isEmpty()){
                display.setText("No Input Found");
            }
            else if(userInput == value){
                display.setText("-----GREAT JOB!!!!!-----");
                value = rand.nextInt(1, 50);
            }
            else if(userInput < value){
                display.setText("-----Guess Higher-----");
            }
            else{
                display.setText("-----Guess Lower-----");
            }
        }else {
            display.setText("Enter an Integer");
        }

    }

    @FXML
    private boolean isInteger(String text) {
        try {
            Integer.parseInt(text.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @FXML
    private void handleQuit() {
        Platform.exit();
    }

}
