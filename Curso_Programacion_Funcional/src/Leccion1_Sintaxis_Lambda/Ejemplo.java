package Leccion1_Sintaxis_Lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Ejemplo {
    public static void main(String[] args) {
        // Ejemplo -> Función lambda para implementar metodo action performed de la interfaz action listener
        JButton button = new JButton("Hola");
        button.addActionListener(
                (event) -> System.out.println("Hola")
        );
    }

    public interface ActionLister{
        public void ActionPerformed(ActionEvent event);
    }
}