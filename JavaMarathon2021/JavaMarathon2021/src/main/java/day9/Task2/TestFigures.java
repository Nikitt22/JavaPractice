package day9.Task2;

public class TestFigures {


    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        TestFigures.calculateRedArea(figures);
        TestFigures.calculateRedPerimeter(figures);

    }
        public static double calculateRedPerimeter(Figure[] figures) {
            double sumArea = 0;
            for (int i = 0; i < figures.length; i++)
                if ("Red".equals(figures[i].getColor()))
                    sumArea += figures[i].perimeter();
            System.out.println(sumArea);
            return sumArea;
        }

        public static double calculateRedArea(Figure[] figures) {
            double sumPerimeter = 0;
            for (int i = 0; i < figures.length; i++)
                if ("Red".equals(figures[i].getColor()))
                    sumPerimeter += figures[i].area();
            System.out.println(sumPerimeter);
            return sumPerimeter;
        }
    }
 
