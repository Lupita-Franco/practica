/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
    
import models.Model;
import views.Views; 
import controllers.Controller;
/**
 *
 * @author Lupita
 */
public class Main { 
    
    public static void main (String [] mgfc ){
        Model mod = new Model();
        Views vi = new Views();
        Controller controllers = new Controller(mod, vi);
        controllers.init_view();
    }
}

