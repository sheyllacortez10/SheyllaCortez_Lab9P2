/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheyllacortez_lab9p2;

import javax.swing.JProgressBar;

/**
 *
 * @author DELL
 */
public class adminProgress extends Thread{
    private JProgressBar prBar;
    private boolean sigue;


    public adminProgress(JProgressBar prBar, boolean sigue) {
        this.prBar = prBar;
        this.sigue = sigue;
    }

    public JProgressBar getPrBar() {
        return prBar;
    }

    public void setPrBar(JProgressBar prBar) {
        this.prBar = prBar;
    }

    public boolean isSigue() {
        return sigue;
    }

    public void setSigue(boolean sigue) {
        this.sigue = sigue;
    }



    @Override
    public void run() {
        while (sigue) {
                prBar.setValue(prBar.getValue() + 1);
                prBar.setString(Integer.toString(prBar.getValue()) + " mitiempo");
                if (prBar.getValue() == 100) {
                    sigue = false;
                }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
        
        //subir archivo
    }

}
