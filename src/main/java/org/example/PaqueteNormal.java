package org.example;

public class PaqueteNormal extends Paquete {
    public PaqueteNormal(String destinatario, double pesoKg, EstrategiaEnvio estrategia){
        super(destinatario, pesoKg, estrategia);
    }
    @Override
    public double obtenerCostoEnvio(){
        return estrategia.calcp(pesoKg);
    }
}
