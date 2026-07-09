package org.example;

class EnvioEstandar implements EstrategiaEnvio{

    @Override
    public double calcp(double kg){
        double costo = kg * 2.00;
        return costo;
    }

}
