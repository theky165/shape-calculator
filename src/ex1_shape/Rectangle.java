package ex1_shape;

import java.util.Scanner;

public class Rectangle implements Shape{
    private double length;
    private double width;

    @Override
    public void input() {
        System.out.print("Nhập chiều dài: ");
        length = s.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        width = s.nextDouble();
    }

    @Override
    public void output() {
        double circum = (length + width) * 2;
        double area = length * width;
        System.out.println("Chu vi hình chữ nhật = " + circum);
        System.out.println("Diện tích hình chữ nhật = " + area);

    }
}
