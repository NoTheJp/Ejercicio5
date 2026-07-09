package org.example;

class EnvioInternacional implements EstrategiaEnvio {
    @Override
    public double calcp(double kg) {
        double costo = kg * 6.00 +10.00;
    }
}
