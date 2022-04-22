package Model;

public class Rectangle implements Shape{
    private double length;
    private double width;

    @Override
    public void input() {
        System.out.print("Nhập chiều dài: ");
        length = validate.checkDouble();
        System.out.print("Nhập chiều rộng: ");
        width = validate.checkDouble();
    }

    @Override
    public void output() {
        double circum = (length + width) * 2;
        double area = length * width;
        System.out.println("Chu vi hình chữ nhật = " + circum);
        System.out.println("Diện tích hình chữ nhật = " + area);

    }
}
