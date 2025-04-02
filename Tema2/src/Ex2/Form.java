package Ex2;

public class Form {
    protected String color;

    public Form(){
        this.color = "Black";
    }

    public Form(String color) {
        this.color = color;
    }

    public double getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return color;
    }
}


