package com.company;

import Controller.Controller;
import Model.MainModel;
import View.MainFrame;

public class Main {

    public static void main(String[] args) {

        MainFrame theView = new MainFrame();

        MainModel theModel = new MainModel();

        Controller theController = new Controller(theView,theModel);

        theView.setVisible(true);

    }

}
