package br.indentar.com.washingmachine.service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import br.indentar.com.washingmachine.entidades.WashingMachine;

/**
 *
 * @author pcmix
 */
public interface WashingStrategy {
    void execute(WashingMachine machine);
}
