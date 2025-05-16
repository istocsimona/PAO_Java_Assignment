package Ex2;

public class Main {
    public static void main(String[] args) {
        Form[] shapes = new Form[4];
        shapes[0] = new Triangle("Rosu", 5, 10);
        shapes[1] = new Circle("Verde", 2);
        shapes[2] = new Triangle("Albastru", 3, 6);
        shapes[3] = new Circle("Galben", 4);

        for(Form shape:shapes){
            System.out.println(shape.toString());
        }

        for (Form shape : shapes) {
            if (shape instanceof Triangle) {
                ((Triangle) shape).printTriangleDimensions();
            } else if (shape instanceof Circle) {
                ((Circle) shape).printCircleDimensions();
            }
        }
    }
}
