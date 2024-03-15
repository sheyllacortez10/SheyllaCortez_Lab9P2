/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheyllacortez_lab9p2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author DELL
 */
public class adminDia extends Thread {

    private JLabel miHora;
    private JLabel fecha;

    public adminDia(JLabel miHora, JLabel fecha) {
        this.miHora = miHora;
        this.fecha = fecha;
    }

    @Override
    public void run() {
        while (true) {
            Date tiempo = new Date();
            DateFormat Tformato = new SimpleDateFormat("hh:mm:ss");
            DateFormat Hformato = new SimpleDateFormat("dd/MM/yyyy");
            miHora.setText(Tformato.format(tiempo));
            fecha.setText(Hformato.format(tiempo));
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {

            }
        }
    }

}
