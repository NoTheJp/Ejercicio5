package org.example;

class EnvioExpress implements EstrategiaEnvio{

    @Override
    public double calcp(double kg){
        double costo = kg * 4.50 + 3.00;
        return costo;
    }

    @Override
    public String nombreEntrega(){
        return "Express";
    }
}
