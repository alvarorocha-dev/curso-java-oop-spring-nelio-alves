package exercicioAreaRetangulo.entities;

public class Rectangle {    

    public double Width;
    public double Height;

    public double rectangleArea () {
        return Width * Height;
    }

    public double rectanglePerimeter () {
        return (Width + Height) * 2;
    }

    public double rectangleDiagonal () {
        return Math.sqrt((Width * Width) + (Height * Height));
    }

    public String toString() {
        return "Area: " + String.format("%.2f", rectangleArea()) + "\n"
        + "Perimeter: " + String.format("%.2f", rectanglePerimeter()) + "\n"
        + "Diagonal: " + String.format("%.2f", rectangleDiagonal());
    }

}