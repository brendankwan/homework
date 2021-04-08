package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    public int answer;
    public int number;
    public int calculation;
    public TextField txtScreen;
    public ArrayList <String> numbers = new ArrayList<>();
    public ArrayList <String> operators = new ArrayList<>();

    public Button buttonAdd;

    public void printSeven(ActionEvent actionEvent) {
        addNumber("7");
    }

    public void printEight(ActionEvent actionEvent) {
        addNumber("8");
    }

    public void printNine(ActionEvent actionEvent) {
        addNumber("9");
    }

    public void printFour(ActionEvent actionEvent) {
        addNumber("4");
    }

    public void printFive(ActionEvent actionEvent) {
        addNumber("5");
    }

    public void printSix(ActionEvent actionEvent) {
        addNumber("6");
    }

    public void printOne(ActionEvent actionEvent) {
        addNumber("1");
    }

    public void printTwo(ActionEvent actionEvent) {
        addNumber("2");
    }

    public void printThree(ActionEvent actionEvent) {
        addNumber("3");
    }

    public void printZero(ActionEvent actionEvent) {
        addNumber("0");
    }
    public void printDecimal(ActionEvent actionEvent) {
                addNumber(".");
    }




    public void addNumber(String num) {
        if(txtScreen.getText().equals("0")){
            txtScreen.setText(num);
        }
        else {
            String digits = txtScreen.getText() + num;
            txtScreen.setText(digits);
            System.out.println(digits);
        }

    }

    public void clearAll(ActionEvent actionEvent) {
        txtScreen.clear();
        txtScreen.setText("0");
        numbers.clear();
        operators.clear();


    }


    public void Operation(ActionEvent actionEvent) {
      switch(calculation){
          case 1:
              answer = number + Integer.parseInt(txtScreen.getText());
              txtScreen.setText(Integer.toString(answer));
              break;
      }
    }


}
