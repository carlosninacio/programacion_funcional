package Intento2.Leccion1_Sintaxis_Lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo {

    JButton button = new JButton("Hola");

    public Ejemplo() {

        button.addActionListener(
                (event) -> System.out.println("Botón presionado")
        ); // Hacer esta expresión lambda es lo mismo que hacer todo lo de abajo

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("Botón presionado");
            }
        });

    }
}