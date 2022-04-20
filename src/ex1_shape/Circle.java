package ex1_shape;

public class Circle implements Shape{
    private double radius;

    @Override
    public void input() {
        System.out.print("Nhập bán kính: ");
        radius = s.nextDouble();
    }

    @Override
    public void output() {
        double circum = radius * 2 * Math.PI;
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("Chu vi hình tròn = " + circum);
        System.out.println("Diện tích hình tròn = " + area);
    }
}
