package shapes;

public class Square extends Rectangle{

    Square() {
        super(1 , 1);
    }
    Square(double side) {
        super(side, side);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setBreadth(side);
    }
}
