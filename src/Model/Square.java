package Model;

public class Square implements Shape{
    private double edge;

    @Override
    public void input() {
        System.out.print("Nhập cạnh của hình vuông: ");
        edge = validate.checkDouble();
    }

    @Override
    public void output() {
        double circum = edge * 4;
        double area = edge * edge;
        System.out.println("Chu vi hình vuông = " + circum);
        System.out.println("Diện tích hình vuông = " + area);

    }
}
