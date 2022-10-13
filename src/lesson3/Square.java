package lesson3;

import java.util.Objects;

public class Square extends Figures {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double fourthSide;

    public Square() {

    }

    public Square(double firstSide) {
        this.firstSide = firstSide;
        this.secondSide = firstSide;
        this.thirdSide = firstSide;
        this.fourthSide = firstSide;
        this.perimeter = perimeter(firstSide);
        this.square = square(firstSide);
        this.name = "Square";

    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double getFourthSide() {
        return fourthSide;
    }

    public void setFourthSide(double fourthSide) {
        this.fourthSide = fourthSide;
    }

    public void square() {
        this.square = this.firstSide * this.firstSide;
    }

    final double square(double firstSide) {
        return firstSide * firstSide;
    }

    public double perimeter(double firstSide) {
        return firstSide * 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square1 = (Square) o;
        return Double.compare(square1.firstSide, firstSide) == 0 && Double.compare(square1.secondSide, secondSide) == 0 && Double.compare(square1.thirdSide, thirdSide) == 0 && Double.compare(square1.fourthSide, fourthSide) == 0 && Double.compare(square1.perimeter, perimeter) == 0 && Double.compare(square1.square, square) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstSide, secondSide, thirdSide, fourthSide, perimeter, square);
    }

    @Override
    public String toString() {
        return "Square{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                ", fourthSide=" + fourthSide +
                ", name='" + name + '\'' +
                ", perimeter=" + perimeter +
                ", square=" + square +
                '}';
    }
}
