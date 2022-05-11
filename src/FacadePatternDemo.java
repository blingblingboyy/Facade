public class FacadePatternDemo {
    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawSquare();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();

    }
}
