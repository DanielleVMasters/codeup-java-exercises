package shapes;

public class Square extends Rectangle{

    public Square(double side){
        super(side, side);
    }

    public double getArea(){
        double side = this.width;
        return side * side;
    }

    public double getPerimeter(){
        double side = this.width;
        return side * 4;
    }

}
