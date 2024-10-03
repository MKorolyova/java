import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your 3-digit number: ");
        int number = scanner.nextInt();

        while (number > 999 || number < 100) {
            System.out.println("You entered something wrong");
            System.out.print("Enter your 3-digit number: ");
            number = scanner.nextInt();
        }

        Task1.sum(number);
        Task1.sqrt_float(number);
        Task1.sqrt_int(number);

        System.out.print("Enter your number: ");
        number = scanner.nextInt();
        Task2.numberPowers(number);

        System.out.print("Enter first cat: ");
        float a = scanner.nextInt();

        System.out.print("Enter second cat: ");
        float b = scanner.nextInt();

        while (a<0 || b<0) {
            System.out.println("You entered something wrong");

            System.out.print("Enter first cat: ");
            a = scanner.nextInt();
    
            System.out.print("Enter second cat: ");
            b = scanner.nextInt();
        }

        Task3.RightTriangle(a, b);


        System.out.print("Enter first side: ");
        a = scanner.nextInt();

        System.out.print("Enter second side: ");
        b = scanner.nextInt();

        System.out.print("Enter third side: ");
        float c = scanner.nextInt();

        System.out.print("Enter fourth side: ");
        float d = scanner.nextInt();

        System.out.print("Enter first diagonal: ");
        float diagonal1 = scanner.nextInt();

        System.out.print("Enter second diagonal: ");
        float diagonal2 = scanner.nextInt();

        while (a<0 || b<0 || c<0 || d<0 || diagonal1<0 || diagonal2<0) {
            System.out.println("You entered something wrong");

            System.out.print("Enter first side: ");
            a = scanner.nextInt();
    
            System.out.print("Enter second side: ");
            b = scanner.nextInt();
    
            System.out.print("Enter third side: ");
            c = scanner.nextInt();
    
            System.out.print("Enter fourth side: ");
            d = scanner.nextInt();
    
            System.out.print("Enter first diagonal: ");
            diagonal1 = scanner.nextInt();
    
            System.out.print("Enter second diagonal: ");
            diagonal2 = scanner.nextInt();
        }

        Task4.quadrangle(a, b, c, d, diagonal1, diagonal2);

    }
}

class Task1 {
    static void sum(int number) {
        int hundreds = number / 100;            
        int tens = (number / 10) % 10;         
        int ones = number % 10;  
        System.out.println("Sum of digits: "+ (ones + tens + hundreds));
    }

    static void sqrt_float(int number) {
        System.out.println("Square root (float): " + (float) Math.sqrt(number));
    }

    static void sqrt_int(int number) {
        System.out.println("Square root (int): " + (int) Math.sqrt(number));
    }
}

class Task2{
    static void numberPowers(int number){
        int a = number*number;
        int b = a*number;
        System.out.println("number^3 = " + b);
        b = b*a;
        System.out.println("number^5 = " + b);
        a = b*b;
        System.out.println("number^10 = " + a);
        b = b*a;
        System.out.println("number^15 = " + b);
    }
}

class Task3{
    static void RightTriangle(double a, double b){
        float c = (float) Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse: " + c);
        
        float area = (float) (0.5 * a * b);
        
        float h = (2 * area) / c;
        System.out.println("Height on the hypotenuse: " + h);
    }
}


class Task4{
    static void quadrangle(float a, float b, float c, float d, float diagonal1, float diagonal2){
        float p1 =  (a+b+diagonal1)/2;
        float p2 = (c+d+diagonal2)/2;
        float s1 = (float) Math.sqrt(p1*(p1-a)*(p1-b)*(p1-diagonal1));
        float s2 = (float) Math.sqrt(p2*(p2-a)*(p2-b)*(p2-diagonal1));
        float s = s1+s2;
        System.out.println("Area of ​​a convex quadrilateral: " + s);
    }
}
