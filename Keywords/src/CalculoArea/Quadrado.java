package CalculoArea;

public record Quadrado(double side) implements FormasGeometricas {
    @Override
    public double getArea() {
        return side * side;
    }
}

