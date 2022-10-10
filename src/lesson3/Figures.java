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
        this.perimeter= perimeter( firstSide,  secondSide,  thirdSide,  fourthSide,  fifthSide,  sixthSide);
    }
    public Figures(double firstSide, double secondSide, double thirdSide, double fourthSide, double fifthSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
        this.fifthSide = fifthSide;
        this.perimeter= perimeter( firstSide,  secondSide,  thirdSide,  fourthSide,  fifthSide);

    }
    public Figures(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
        this.perimeter= perimeter( firstSide,  secondSide,  thirdSide,  fourthSide);

    }
    public Figures(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.perimeter= perimeter( firstSide,  secondSide,  thirdSide);

    }
    public Figures(double firstSide) {
        this.firstSide = firstSide;
        this.secondSide = firstSide;
        this.thirdSide = firstSide;
        this.fourthSide = firstSide;
        this.perimeter= perimeter( firstSide);

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

    static public double perimeter (double firstSide, double secondSide, double thirdSide, double fourthSide, double fifthSide, double sixthSide){
        if(firstSide < 0 || secondSide < 0 || thirdSide < 0 || fourthSide < 0 || fifthSide < 0 || sixthSide <0 ) {
            System.out.println(" incorrect values ");
            return 0;
        }
        else
     return firstSide + secondSide + thirdSide + fourthSide +fifthSide +sixthSide ;
    }
    static public double perimeter (double firstSide, double secondSide, double thirdSide, double fourthSide, double fifthSide){
        if(firstSide < 0 || secondSide < 0 || thirdSide < 0 || fourthSide < 0 || fifthSide < 0  ) {
            System.out.println(" incorrect values ");
            return 0;
        }
        else
            return firstSide + secondSide + thirdSide + fourthSide +fifthSide  ;
    }
    static public double perimeter (double firstSide, double secondSide, double thirdSide, double fourthSide){
        if(firstSide < 0 || secondSide < 0 || thirdSide < 0 || fourthSide < 0  ) {
            System.out.println(" incorrect values ");
            return 0;
        }
        else
            return firstSide + secondSide + thirdSide + fourthSide  ;
    }
    static double perimeter (double firstSide, double secondSide, double thirdSide){
        if((firstSide < 0) || (secondSide < 0) || (thirdSide < 0)   ) {
            System.out.println(" incorrect values ");
            return 0;
        }
        else
            return firstSide + secondSide + thirdSide   ;
    }
    static double perimeter (double firstSide){
        if(firstSide < 0 )  {
            System.out.println(" incorrect values ");
            return 0;
        }
        else
            return firstSide * 4   ;
    }

    public double perimeter(){
       this.perimeter = this.firstSide + this.secondSide + this.thirdSide + this.fourthSide + this.fifthSide + this.sixthSide;
        return this.perimeter;
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
                ", perimeter=" + perimeter +
                '}';
    }
}
