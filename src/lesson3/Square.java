package lesson3;

import java.util.Objects;

public class Square extends Figures {
    double firstSide;
    double secondSide;
    double thirdSide;
    double fourthSide;
    double perimeter;
    double square;
    public Square(double firstSide) {
        super(firstSide);
        this.firstSide = firstSide;
        this.secondSide = firstSide;
        this.thirdSide = firstSide;
        this.fourthSide = firstSide;
        this.perimeter = perimeter(firstSide);
        this.square =square(firstSide);

    }
    public void square(){
        this.square = this.firstSide * this.firstSide;
    }
    public double square(double firstSide){
        return firstSide * firstSide;
    }

    @Override
    public double getFirstSide() {
        return firstSide;
    }

    @Override
    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    @Override
    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getThirdSide() {
        return thirdSide;
    }

    @Override
    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public double getFourthSide() {
        return fourthSide;
    }

    @Override
    public void setFourthSide(double fourthSide) {
        this.fourthSide = fourthSide;
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
                ", perimeter=" + perimeter +
                ", square=" + square +
                '}';
    }
}
