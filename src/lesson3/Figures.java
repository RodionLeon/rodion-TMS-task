package lesson3;

abstract class Figures {
    String name;
    double perimeter;
    double square;

    public Figures() {

    }

    public Figures(String name, double perimeter, double square) {
        this.name = name;
        this.perimeter = perimeter;
        this.square = square;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
