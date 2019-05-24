/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.Adapter;

//import catalogopersonajes.Personajes;
import catalogopersonajes.Personajes;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import logica.builder.EngineerConstructor;

/**
 *
 * @author David Bohorquez
 */
public class Adapter extends EngineerConstructor implements Runnable {

    private Personajes orco;

    private ImageIcon[] imgsEngr;

    private int numImage;

    private Thread drawThread;
    private boolean isAnimado;
    private BufferedImage dobleBuffre;

    private Component lienzo;

    private ImageIcon bkgdLienzo;

    public void ingeniar(Component lienzo) {
        dobleBuffre = new BufferedImage(lienzo.getWidth(), lienzo.getHeight(), BufferedImage.TYPE_INT_ARGB);
        this.lienzo = lienzo;

        drawThread = new Thread(this);
        isAnimado = true;
        drawThread.start();
    }

    public void dibujar(Component lienzo) {
        if (numImage == 4) {
            numImage = 0;
        }

        Graphics lapiz = dobleBuffre.getGraphics();
        lapiz.drawImage(bkgdLienzo.getImage(), 0, 0, lienzo);

        System.out.println("numImage!!!!!" + numImage);
        lapiz.drawImage(imgsEngr[numImage].getImage(), lienzo.getWidth()/4, lienzo.getHeight()/8, lienzo);

        Graphics pincel = lienzo.getGraphics();
        pincel.drawImage(dobleBuffre, 0, 0, lienzo);
        numImage++;
    }

    @Override
    public void run() {
        while (isAnimado) {
            dibujar(lienzo);
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {

            }
        }
    }

    public Adapter() {
        imgsEngr = new ImageIcon[4];

        numImage = 0;

        isAnimado = false;
        bkgdLienzo = new ImageIcon(getClass().getResource("/recursos/images/bkgd1.jpg"));
    }

    public Personajes getOrco() {
        return orco;
    }

    @Override
    public void buildEnginner() {
        orco = new Personajes("Orco");

        imgsEngr[0] = orco.getPj().imagen(0);
        imgsEngr[1] = orco.getPj().imagen(1);
        imgsEngr[2] = orco.getPj().imagen(2);
        imgsEngr[3] = orco.getPj().imagen(3);
    }

    @Override
    public void buildAccessory() {

    }

    @Override
    public void buildTool() {

    }

    @Override
    public void buildVehicle() {

    }

    @Override
    public void ingeniar() {

    }

    public boolean isIsAnimado() {
        return isAnimado;
    }

    public void setIsAnimado(boolean isAnimado) {
        this.isAnimado = isAnimado;
    }

}
