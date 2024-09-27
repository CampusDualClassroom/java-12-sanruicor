package com.campusdual.classroom;

public class Car {

    public static final int MAX_SPEED = 100;
    public int speedometer;
    public int tachometer;
    public String gear = "N";
    public int wheelsAngle = 0;


    public void start() {
        if (isEngineOff()) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("El vehículo no puede apagarse con el vehículo en movimiento");
        }
    }

    public void accelerate() {
        if (isTachometerGreaterThanZero()) {
            if (speedometer < MAX_SPEED) {
                speedometer += 10;
                tachometer += 1000;
                System.out.println("Acelerando a " + speedometer + " km/h");
            } else {
                System.out.println("Velocidad máxima alcanzada");
            }
        } else {
            System.out.println("El vehículo está apagado");
        }
    }

    public void decelerate() {
        if (isTachometerGreaterThanZero()) {
            if (speedometer > 0) {
                speedometer -= 10;
                tachometer -= 1000;
                System.out.println("Desacelerando a " + speedometer + " km/h");
            } else {
                System.out.println("El vehículo está parado");
            }
        } else {
            System.out.println("El vehículo está apagado");
        }
    }

    public void brake() {
        if (isTachometerGreaterThanZero()) {
            if (speedometer > 0) {
                speedometer = 0;
                tachometer = 0;
                System.out.println("Frenando");
            } else {
                System.out.println("El vehículo está parado");
            }
        } else {
            System.out.println("El vehículo está apagado");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if((this.wheelsAngle += angle) < -45){
            this.wheelsAngle = -45;
            System.out.println("Ángulo de las ruedas no puede ser menor a -45");
        } else if((this.wheelsAngle += angle) > 45){
            this.wheelsAngle = 45;
            System.out.println("Ángulo de las ruedas no puede ser mayor a 45");
        } else {
            this.wheelsAngle = angle;
            System.out.println("Ángulo de las ruedas: " + wheelsAngle);
        }

    }


    public void setReverse(boolean reverse) {
        if (speedometer == 0) {
            this.gear = "R";
            System.out.println("Marcha atrás");
        } else {
            System.out.println("El vehículo no puede cambiar a marcha atrás con el vehículo en movimiento");
        }
    }


    public boolean isEngineOff() {
        return tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        return tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return tachometer == 0;
    }


}
