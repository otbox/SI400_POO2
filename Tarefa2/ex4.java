package Tarefa2;

public class ex4 {
    public static void main(String[] args) {
        Temperature teste = new Temperature();
        teste.setkTemperature("-274F");
        teste.setkTemperature("-274C");

        System.out.println(teste.getCTemperature());
        System.out.println(teste.getKTemperature());
        System.out.println(teste.getFTemperature());
    }
    
}

class Temperature {
    private double  kTemperature;

    public double getKTemperature() {
        return kTemperature;
    }

    public double getFTemperature () {
        return (kTemperature - 273.15) * 9/5 + 32;
    }

    public double getCTemperature () {
        return kTemperature - 273.15;
    }
    public void setkTemperature(String temperature) {
        double dTemperature = Double.parseDouble(temperature.substring(0, temperature.length() - 1));
        if (temperature.endsWith("C") &&  dTemperature >= -273.15) {
            kTemperature = dTemperature + 273.15;
        }
        else if (temperature.endsWith("F") && dTemperature >= -459.67) {
            kTemperature = (dTemperature - 32) * 5 / 9 + 273.15;
        }
        else if (temperature.endsWith("K") && dTemperature >= 0){
            kTemperature = dTemperature;
        }else{
            System.out.println("Valor Inválido");
        }
    }
     
    
}