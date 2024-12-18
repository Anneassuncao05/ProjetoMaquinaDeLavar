package br.indentar.com.washingmachine.service;

import br.indentar.com.washingmachine.entidades.WashingMachine;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author pcmix
 */
public class StandardWashingStrategyService implements WashingStrategy {
    @Override
    public void execute(WashingMachine machine) {
        machine.loadClothes();
        machine.addDetergent();
        machine.setWaterLevel();
        machine.wash();
        machine.rinse();
        machine.spin();
        machine.unloadClothes();
    }
}
