package Model;

public class Triangle implements Shape{
    private double edge1;
    private double edge2;
    private double edge3;
    private double height;

    @Override
    public void input() {
        System.out.print("Nhập chiều dài cạnh 1: ");
        edge1 = validate.checkDouble();
        System.out.print("Nhập chiều dài cạnh 2: ");
        edge2 = validate.checkDouble();
        System.out.print("Nhập chiều dài cạnh 3: ");
        edge3 = validate.checkDouble();
        System.out.print("Nhập chiều cao: ");
        height = validate.checkDouble();
    }

    @Override
    public void output() {
        double circum = edge1 + edge2 + edge3;
        double area = (edge1 * height) / 2;
        System.out.println("Chu vi hình vuông = " + circum);
        System.out.println("Diện tích hình vuông = " + area);

    }
}
