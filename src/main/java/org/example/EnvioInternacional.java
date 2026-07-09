package org.example;

class EnvioInternacional implements EstrategiaEnvio {
    private boolean siono;

    public EnvioInternacional(){
        this.siono = false;
    }

    @Override
    public double calcp(double kg) {
        double costo =  kg * 6.00;

        if (this.siono == false){
            costo = costo + 10.00;
            this.siono = true;
            return costo;
        }else{
            return costo;
        }
    }
}
