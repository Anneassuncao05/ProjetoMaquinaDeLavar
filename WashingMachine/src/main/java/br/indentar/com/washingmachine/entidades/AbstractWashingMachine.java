package br.indentar.com.washingmachine.entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author pcmix
 */
public abstract class AbstractWashingMachine implements WashingMachine {
    protected boolean clothesLoaded = false;
    protected boolean detergentAdded = false;
    protected boolean waterLevelSet = false;
    protected boolean washed = false;
    protected boolean rinsed = false;
    protected boolean spun = false;

    @Override
    public void loadClothes() {
        System.out.println("Roupas carregadas.");
        clothesLoaded = true;
    }

    @Override
    public void addDetergent() {
        checkState(clothesLoaded, "Carregue as roupas primeiro!");
        System.out.println("Detergente adicionado.");
        detergentAdded = true;
    }

    @Override
    public void setWaterLevel() {
        checkState(detergentAdded, "Adicione o detergente primeiro!");
        System.out.println("Nível de água configurado.");
        waterLevelSet = true;
    }

    @Override
    public void wash() {
        checkState(waterLevelSet, "Configure o nível de água primeiro!");
        System.out.println("Lavagem realizada.");
        washed = true;
    }

    @Override
    public void rinse() {
        checkState(washed, "Realize a lavagem primeiro!");
        System.out.println("Enxágue realizado.");
        rinsed = true;
    }

    @Override
    public void spin() {
        checkState(rinsed, "Realize o enxágue primeiro!");
        System.out.println("Centrifugação concluída.");
        spun = true;
    }

    @Override
    public void unloadClothes() {
        checkState(spun, "Centrifugue as roupas primeiro!");
        System.out.println("Roupas descarregadas.");
        reset();
    }

    protected void checkState(boolean condition, String message) {
        if (!condition) {
            throw new IllegalStateException(message);
        }
    }

    protected void reset() {
        clothesLoaded = false;
        detergentAdded = false;
        waterLevelSet = false;
        washed = false;
        rinsed = false;
        spun = false;
    }
}


