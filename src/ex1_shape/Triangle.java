package ex1_shape;

public class Triangle implements Shape{
    private double edge1;
    private double edge2;
    private double edge3;
    private double height;

    @Override
    public void input() {
        System.out.print("Nhập chiều dài cạnh 1: ");
        edge1 = s.nextDouble();
        System.out.print("Nhập chiều dài cạnh 2: ");
        edge2 = s.nextDouble();
        System.out.print("Nhập chiều dài cạnh 3: ");
        edge3 = s.nextDouble();
        System.out.print("Nhập chiều cao: ");
        height = s.nextDouble();
    }

    @Override
    public void output() {
        double circum = edge1 + edge2 + edge3;
        double area = (edge1 * height) / 2;
        System.out.println("Chu vi hình vuông = " + circum);
        System.out.println("Diện tích hình vuông = " + area);

    }
}
