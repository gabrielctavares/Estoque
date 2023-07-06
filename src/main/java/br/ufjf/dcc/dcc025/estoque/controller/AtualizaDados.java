/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.ufjf.dcc.dcc025.estoque.controller;

import br.ufjf.dcc.dcc025.estoque.view.Tela;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Gabriel Cordeiro Tavares - 202265163A
 */
public class AtualizaDados implements WindowListener {

    private final Tela tela;
    public AtualizaDados(Tela tela){
        this.tela = tela;
    }
    @Override
    public void windowOpened(WindowEvent e) {        
        tela.carregar();      
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {        
        tela.salvar();
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = tela.getSize().width;
        int h = tela.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        tela.setLocation(x, y);  
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
