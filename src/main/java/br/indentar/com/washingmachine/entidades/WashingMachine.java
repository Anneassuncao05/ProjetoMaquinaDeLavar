package br.indentar.com.washingmachine.entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Anne
 */
public interface WashingMachine {
    void loadClothes();
    void addDetergent();
    void setWaterLevel();
    void wash();
    void rinse();
    void spin();
    void unloadClothes();
}
