package Main;

import Model.Circle;
import Model.Rectangle;
import Model.Square;
import Model.Triangle;
import Validate.Validate;

public class Main {
    public static void main(String[] args) {
        Validate validate = new Validate();
        int choiceShape;
        boolean checkLoop = true;
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        while (checkLoop) {
            menu();
            choiceShape = validate.checkRoundInt(1, 5);
            switch (choiceShape) {
                case 1:
                    System.out.println("===== Hình chữ nhật =====");
                    rectangle.input();
                    rectangle.output();
                    break;
                case 2:
                    System.out.println("===== Hình vuông =====");
                    square.input();
                    square.output();
                    break;
                case 3:
                    System.out.println("===== Hình tam giác =====");
                    triangle.input();
                    triangle.output();
                    break;
                case 4:
                    System.out.println("===== Hình tròn =====");
                    circle.input();
                    circle.output();
                    break;
                default:
                    System.out.println("===== Kết thúc chương trình =====");
                    checkLoop = false;
                    break;
            }
        }
    }

    public static void menu() {
        System.out.print("===== Bài tập hình học =====\n" +
                "1. Hình chữ nhật\n" +
                "2. Hình vuông\n" +
                "3. Hình tam giác\n" +
                "4. Hình tròn\n" +
                "5. Thoát chương trình\n" +
                "Lựa chọn của bạn: ");
    }
}
