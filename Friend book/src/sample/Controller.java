package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    public TextField textFriend;
    public TextField textAge;
    public TextField textGrade;
    public ListView <Friend> listFriend = new ListView<>();
    public Label labelFriend;
    public Label labelAge;
    public Label labelGrade;

    public void createFriend() {
        String name = textFriend.getText();
        int age = Integer.parseInt(textAge.getText());
        int grade = Integer.parseInt(textGrade.getText());
        Friend friend = new Friend(name,age,grade);
        listFriend.getItems().add(friend);
        textFriend.clear();
        textAge.clear();
        textGrade.clear();
    }

    public void displayFriend() {
       Friend friend = listFriend.getSelectionModel().getSelectedItem();
       if (friend == null){
           return;
       }
       labelFriend.setText("Friend: " + friend.getName());
       String age = Integer.toString(friend.getAge());
       labelAge.setText("Age: " + age);
       String grade = Integer.toString(friend.getGrade());
       labelGrade.setText("Grade: " + grade);

    }

    public void deleteFriend(ActionEvent actionEvent) {
        Friend friend = listFriend.getSelectionModel().getSelectedItem();
        if (friend == null){
            return;
        }
        listFriend.getItems().remove(friend);
        labelFriend.setText("Friend: ");
        labelAge.setText("Age: ");
        labelGrade.setText("Grade: ");
    }
}
