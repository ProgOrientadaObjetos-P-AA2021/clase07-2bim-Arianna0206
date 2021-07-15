/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

/**
 *
 * @author macbookair
 */
public class APIDisneyMovie implements APIMovie {

    private String apiKey;

    @Override
    public void establecerApiKey(String ak) {
        apiKey = ak + 5678954;
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }
}
