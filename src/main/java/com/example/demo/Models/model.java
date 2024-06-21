package com.example.demo.Models;


import com.example.demo.Views.ViewFactory;

public class model
{
    private static model instance;
    private final ViewFactory viewFactory;
    private model(){
        viewFactory = new ViewFactory();
    }
    public static synchronized model getInstance(){
        if(instance == null){
            instance = new model();
        }
        return instance;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
