import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.PrintWriter;

import static java.awt.SystemColor.text;

public class Controller {

    @FXML
    private TextField inputField;

    @FXML
    private TextArea textArea;

    @FXML
    private Button addBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private Button clearBtn;

    private int count = 1;

    public void addItem() {
        String text = inputField.getText().trim();

        text = text.replaceFirst("^\\d+[.)]?\\s*", "");

        if (text.isEmpty()) {
            showError("Please enter something.");
            return;
        }

        textArea.appendText(count + ". " + text + "\n");
        inputField.clear();
        count++;
    }

    public void clearList(){
        textArea.setText("");
        count = 0;
    }

    public void saveList(){
        if(!textArea.getText().isEmpty()){
            try{

                File file = new File("To-Do-List.txt");
                PrintWriter writer = new PrintWriter(file);

                writer.print(textArea.getText());

                writer.close();

            }catch(Exception e){
                showError("Something went wrong, sorry.");
                Platform.exit();
            }
        }
    }

    public boolean checkFirstChar(String text){
        if (text.isEmpty()) return false;
        char first = text.charAt(0);
        return !Character.isLetterOrDigit(first);
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
