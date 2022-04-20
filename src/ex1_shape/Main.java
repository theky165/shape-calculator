package ex1_shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choiceShape;
        boolean checkLoop = true;
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        while (checkLoop) {
            System.out.print("===== Bài tập hình học =====\n" +
                    "1. Hình chữ nhật\n" +
                    "2. Hình vuông\n" +
                    "3. Hình tam giác\n" +
                    "4. Hình tròn\n" +
                    "5. Thoát chương trình\n" +
                    "Lựa chọn của bạn: ");
            choiceShape = s.nextInt();
            switch (choiceShape) {
                case 1:
                    rectangle.input();
                    rectangle.output();
                    break;
                case 2:
                    square.input();
                    square.output();
                    break;
                case 3:
                    triangle.input();
                    triangle.output();
                    break;
                case 4:
                    circle.input();
                    circle.output();
                    break;
                default:
                    System.out.println("Kết thúc chương trình!");
                    checkLoop = false;
                    break;
            }
        }
    }
}
