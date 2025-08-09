package CalculoArea;

public record Circulo(double radius) implements FormasGeometricas {
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
