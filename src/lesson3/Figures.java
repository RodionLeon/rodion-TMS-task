package lesson3;

public class Figures {
    double firstSide;
    double secondSide;
    double thirdSide;
    double fourthSide;
    double fifthSide;
    double sixthSide;
    double perimeter;


    public Figures(double firstSide, double secondSide, double thirdSide, double fourthSide, double fifthSide, double sixthSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
        this.fifthSide = fifthSide;
        this.sixthSide = sixthSide;
    }
    public Figures(double firstSide, double secondSide, double thirdSide, double fourthSide, double fifthSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
        this.fifthSide = fifthSide;

    }
    public Figures(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;

    }
    public Figures(double firstSide, double secondSide, double thirdSide) {
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

    public double getFifthSide() {
        return fifthSide;
    }

    public void setFifthSide(double fifthSide) {
        this.fifthSide = fifthSide;
    }

    public double getSixthSide() {
        return sixthSide;
    }

    public void setSixthSide(double sixthSide) {
        this.sixthSide = sixthSide;
    }

    public double perimeter (double firstSide, double secondSide, double thirdSide, double fourthSide, double fifthSide, double sixthSide){
        double perimeter;
        if(firstSide < 0 || secondSide < 0 || thirdSide < 0 || fourthSide < 0 || fifthSide < 0 || sixthSide <0 ) {
            System.out.println(" incorrect values ");
            return 0;
        }
        else
     return firstSide + secondSide + thirdSide + fourthSide +fifthSide +sixthSide ;
    }
    public double perimeter (double firstSide, double secondSide, double thirdSide, double fourthSide, double fifthSide){
        double perimeter;
        if(firstSide < 0 || secondSide < 0 || thirdSide < 0 || fourthSide < 0 || fifthSide < 0  ) {
            System.out.println(" incorrect values ");
            return 0;
        }
        else
            return firstSide + secondSide + thirdSide + fourthSide +fifthSide  ;
    }
    public double perimeter (double firstSide, double secondSide, double thirdSide, double fourthSide){
        double perimeter;
        if(firstSide < 0 || secondSide < 0 || thirdSide < 0 || fourthSide < 0  ) {
            System.out.println(" incorrect values ");
            return 0;
        }
        else
            return firstSide + secondSide + thirdSide + fourthSide  ;
    }
    public double perimeter (double firstSide, double secondSide, double thirdSide){
        double perimeter;
        if((firstSide < 0) || (secondSide < 0) || (thirdSide < 0)   ) {
            System.out.println(" incorrect values ");
            return 0;
        }
        else
            return firstSide + secondSide + thirdSide   ;
    }
    public void perimeter(){
       this.perimeter = this.firstSide + this.secondSide + this.thirdSide + this.fourthSide + this.fifthSide + this.sixthSide;
    }

    @Override
    public String toString() {
        return "Figures{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                ", fourthSide=" + fourthSide +
                ", fifthSide=" + fifthSide +
                ", sixthSide=" + sixthSide +
                '}';
    }
}
