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
    private boolean termina;

    public adminProgress(JProgressBar prBar, boolean sigue, boolean termina) {
        this.prBar = prBar;
        this.sigue = sigue;
        this.termina = termina;
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

    public boolean isTermina() {
        return termina;
    }

    public void setTermina(boolean termina) {
        this.termina = termina;
    }

    @Override
    public void run() {
        while (termina) {
            if (sigue) {
                prBar.setValue(prBar.getValue() + 1);
                prBar.setString(Integer.toString(prBar.getValue()) + " mitiempo");
            }
            try {
                Thread.sleep(700);
            } catch (InterruptedException ex) {
            }
        }
    }

}
