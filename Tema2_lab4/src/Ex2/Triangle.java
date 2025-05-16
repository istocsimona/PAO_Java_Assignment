package Ex2;

public class Triangle extends Form{
    private float height, base;

    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }

    public Triangle(String color, float height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea(){
        return (base*height)/2;
    }

    @Override
    public String toString(){
        return "Triunghi: "+super.toString()+" "+getArea();
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Float.compare(triangle.base, base)==0 && Float.compare(triangle.height, height)==0;
    }

    public void printTriangleDimensions(){
        System.out.println("Height: "+height + " Base: "+base);
    }
}
