package com.company;

import Controller.*;
import Model.*;
import View.*;

public class Main {

    public static void main(String[] args) {
        loginFrame mainView = new loginFrame();
        Model model = new Model();
        Controller controller = new Controller(mainView,model);
        mainView.setVisible(true);
    }
}