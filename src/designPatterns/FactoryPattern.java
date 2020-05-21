package designPatterns;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory s = new ShapeFactory();
        Facade.Shape s1 = s.getShape("circle");
        Facade.Shape s2 = s.getShape("rectangle");
        s1.draw();
        s2.draw();
    }

    static class ShapeFactory {
        public Facade.Shape getShape(String shape) {
            if (shape.equalsIgnoreCase("circle"))
                return new Facade.Circle();
            else if (shape.equalsIgnoreCase("rectangle"))
                return new Facade.Rectangle();
            return null;
        }
    }
}
