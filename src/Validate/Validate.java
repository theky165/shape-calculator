package Validate;

import java.util.Scanner;

public class Validate {
    Scanner sc = new Scanner(System.in);

    public int checkRoundInt(int min, int max){
        while (true){
            try{
                int numInt;
                numInt = Integer.parseInt(sc.nextLine());
                if(numInt < min || numInt > max){
                    System.out.print("Vui lòng nhập số trong khoảng 1 - 5: ");
                    continue;
                }
                return numInt;
            }catch (Exception e){
                System.out.print("Vui lòng nhập số trong khoảng 1 - 5: ");
            }
        }
    }

    public double checkDouble(){
        while (true){
            try{
                double numDouble;
                numDouble = Double.parseDouble(sc.nextLine());
                return numDouble;
            }catch (Exception e){
                System.out.println("Vui lòng nhập số!");
                System.out.print("Nhập lại: ");
            }
        }
    }
}
