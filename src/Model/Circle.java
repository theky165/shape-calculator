package Model;

public class Circle implements Shape{
    private double radius;
    boolean checkDigit;

    @Override
    public void input() {
        System.out.print("Nhập bán kính: ");
        radius = s.nextDouble();
    }

    @Override
    public void output() {
        double circum = radius * 2 * Math.PI;
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.format("Chu vi hình tròn = %.2f\n", circum);
        System.out.format("Diện tích hình tròn = %.2f\n", area);
    }
}
