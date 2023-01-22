import java.util.Scanner;
class Circle{
     public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter radius of circle:");
            float radius = sc.nextFloat();
            System.out.println("Perimeter of Circle is: "+(2*3.14*radius));
              
            System.out.println("Area of Circle is: "+(3.14*radius*radius));
            sc.close();
            }
}

