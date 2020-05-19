package com.company;

import Controller.Controller;
import Model.MainModel;
import View.AddNewWorker;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        /*JFrame mainFrame = new AddNewWorker("Add new worker");
        mainFrame.setVisible(true);*/
        AddNewWorker theView = new AddNewWorker("Add new Worker");
        MainModel theModel = new MainModel();
        Controller theController = new Controller(theView);
        theView.setVisible(true);
    }
}