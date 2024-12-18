package br.indentar.com.washingmachine.controller;

import br.indentar.com.washingmachine.entidades.WashingMachine;
import br.indentar.com.washingmachine.service.WashingStrategy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author pcmix
 */
public class WashingMachineOperator {
    private WashingMachine machine;
    private WashingStrategy strategy;

    public WashingMachineOperator(WashingMachine machine, WashingStrategy strategy) {
        this.machine = machine;
        this.strategy = strategy;
    }

    public void performWashCycle() { 
        try {
            strategy.execute(machine);
            System.out.println("Ciclo de lavagem concluído com sucesso!");
        } catch (IllegalStateException e) {
            System.out.println("Erro no ciclo de lavagem: " + e.getMessage());
        }
    }
}

