package lesson3;

public class Triangle extends Figures {
    double firstSide;
    double secondSide;
    double thirdSide;
    double square;
    double perimeter;
    String type;


    public Triangle(double firstSide, double secondSide, double thirdSide) {
        super(firstSide,secondSide,thirdSide);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
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
    public double perimeter(double firstSide, double secondSide, double thirdSide) {
        return super.perimeter(firstSide, secondSide, thirdSide);
    }
    public void perimeter(){
        this.perimeter = this.firstSide + this.secondSide + this.thirdSide;
    }

    public boolean valid(){
        if(this.firstSide + this.secondSide > this.thirdSide || this.firstSide + this.thirdSide > this.secondSide || this.secondSide + this.thirdSide > this.firstSide){
            return true;
        }
        else{
            System.out.println("Triangle are not a valid ");
            return false;
        }
    }
    public double Square(double firstSide,double secondSide,double thirdSide){
        double square;
        double semiPerimeter = perimeter(firstSide,secondSide,thirdSide);
        return Math.sqrt(semiPerimeter*(semiPerimeter-firstSide)*(semiPerimeter- secondSide)*(semiPerimeter-thirdSide));

    }

    public void Square() {
        double square;
        double semiPerimeter = perimeter(this.firstSide,this.secondSide,this.thirdSide);
        this.square = Math.sqrt(semiPerimeter*(semiPerimeter-this.firstSide)*(semiPerimeter- this.secondSide)*(semiPerimeter-this.thirdSide));
    }

    public void Type(){
        if((this.firstSide == this.secondSide) && (this.firstSide == this.thirdSide)){
            this.type = "equilateral";}
        else if((this.firstSide == this.secondSide) && (this.firstSide != this.thirdSide)
                || ((this.firstSide == this.thirdSide) &&(this.firstSide != this.secondSide))
                || ((this.secondSide == this.thirdSide) && (this.secondSide != this.firstSide))){
            this.type ="isosceles";
        }
        else if((Math.pow(this.firstSide,2) + Math.pow(this.secondSide,2) == Math.pow(this.thirdSide,2))
                || (Math.pow(this.firstSide,2) + Math.pow(this.thirdSide,2) == Math.pow(this.secondSide,2))
                || Math.pow(this.thirdSide,2) + Math.pow(this.secondSide,2) == Math.pow(this.firstSide,2)){
            this.type = "rectangular";
        }
        else {
            this.type = "arbitrary";
        }
    }

    @Override
    public String toString() {
        if (valid() == true){
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                ", square=" + square +
                ", perimeter=" + perimeter +
                ", type='" + type + '\'' +
                '}';
    }
        return "incorrect value";
    }

}
