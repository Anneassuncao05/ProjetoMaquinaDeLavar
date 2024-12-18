package br.indentar.com.washingmachine.entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pcmix
 */
public class EcoFriendlyWashingMachine extends AbstractWashingMachine {
    @Override
    public void wash() {
        super.wash();
        System.out.println("Lavagem eco-friendly com baixo consumo de água realizada.");
    }

    @Override
    public void rinse() {
        super.rinse();
        System.out.println("Enxágue eco-friendly com água reciclada realizado.");
    }
}

