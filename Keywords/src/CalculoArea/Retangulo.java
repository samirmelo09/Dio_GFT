package CalculoArea;

public record Retangulo(double height, double base) implements FormasGeometricas {
    @Override
    public double getArea() {
        return height * base;
    }
}

