/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author macbookair
 */
public class TransporteTransvia extends Transporte {

    private String cooperativaTransvia;

    public void establecerCooperativaTransvia(String n) {
        cooperativaTransvia = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 3.00 + 0.60;
    }

    public String obtenerCooperativaTransvia() {
        return cooperativaTransvia;
    }

}
