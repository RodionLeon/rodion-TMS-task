package lesson3;

public class Triangle extends Figures {
    double firstSide;
    double secondSide;
    double thirdSide;
    double square;
    double perimeter;
   private String type;


    public Triangle(double firstSide, double secondSide, double thirdSide) {
        super(firstSide,secondSide,thirdSide);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.perimeter = perimeter(firstSide,secondSide,thirdSide);
        this.type = typeOfTriangle(firstSide,secondSide,thirdSide);
        this.square = square(firstSide,secondSide,thirdSide);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public double getFirstSide() {
        return super.getFirstSide();
    }

    @Override
    public void setFirstSide(double firstSide) {
        super.setFirstSide(firstSide);
    }

    @Override
    public double getSecondSide() {
        return super.getSecondSide();
    }

    @Override
    public void setSecondSide(double secondSide) {
        super.setSecondSide(secondSide);
    }

    @Override
    public double getThirdSide() {
        return super.getThirdSide();
    }

    @Override
    public void setThirdSide(double thirdSide) {
        super.setThirdSide(thirdSide);
    }



    @Override
    public double perimeter() {
        super.perimeter();
        return this.perimeter;
    }

    public boolean valid(){
        if((this.firstSide + this.secondSide > this.thirdSide) || (this.firstSide + this.thirdSide > this.secondSide) || (this.secondSide + this.thirdSide > this.firstSide)){
            return true;
        }
        else{
            System.out.println("Triangle are not a valid ");
            return false;
        }
    }
    public double square(double firstSide,double secondSide,double thirdSide){
        double semiPerimeter = perimeter(firstSide,secondSide,thirdSide);
        return Math.sqrt(semiPerimeter*(semiPerimeter-firstSide)*(semiPerimeter- secondSide)*(semiPerimeter-thirdSide));

    }

    public void square() {
        double semiPerimeter = perimeter(this.firstSide,this.secondSide,this.thirdSide)/2;
        this.square = Math.sqrt(semiPerimeter*(semiPerimeter-this.firstSide)*(semiPerimeter - this.secondSide)*(semiPerimeter - this.thirdSide));
    }

    public String typeOfTriangle(double firstSide,double secondSide,double thirdSide){
        if((firstSide == secondSide) && (firstSide == thirdSide)){
            return  "equilateral";}
        else if(((firstSide == secondSide) && (firstSide != thirdSide))
                || ((firstSide == thirdSide) &&(firstSide != secondSide))
                || ((secondSide == thirdSide) && (secondSide != firstSide))){
            return "isosceles";
        }
        else if((Math.pow(firstSide,2) + Math.pow(secondSide,2) == Math.pow(thirdSide,2))
                || (Math.pow(firstSide,2) + Math.pow(thirdSide,2) == Math.pow(secondSide,2))
                || Math.pow(thirdSide,2) + Math.pow(secondSide,2) == Math.pow(firstSide,2)){
            return  "rectangular";
        }
        else {
            return  "arbitrary";
        }

    }

    @Override
    public String toString() {
        if (valid()){
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                ", square=" + square +
                ", perimeter=" + perimeter +
                ", type='" + type + '\'' +
                '}';
    }
        else
        return "incorrect value";
    }


}
