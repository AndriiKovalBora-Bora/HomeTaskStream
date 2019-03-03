package com.company;

import com.company.controller.Controller;
import com.company.model.Model;
import com.company.view.View;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Controller(new Model(), new View()).proccesUser();

    }
}
