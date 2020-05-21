package designPatterns;

public class Facade {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();
        s1.draw();
        s2.draw();
    }

    interface Shape {
        void draw();
    }

    static class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Rectangle drawn");
        }
    }

    static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Circle Drawn");
        }
    }
}
