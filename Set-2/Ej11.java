public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int calculateArea() {
        if (this.side <= 0){
            return -1;
        }
        return this.side * this.side;
    }

    public int calculatePerimeter() {
        if (this.side <= 0){
            return -1;
        }
        return 4 * this.side;
    }
}