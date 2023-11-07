public class Square extends ColoredFigure{
    Square(String c, int s){
        super(c, s);
    }

    @Override
    String getName() {
        return "square";
    }

    @Override
    double getArea() {
        return size*size;
    }
}
