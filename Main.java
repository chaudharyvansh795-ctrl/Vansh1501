import java.util.Scanner;

class Program {
    String name;
    int age;
    double salary;

    void setData(String n, int a, double s) {
        name = n;
        age = a;
        salary = s;
    }

    void showData() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Program p = new Program();

        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age (>18): ");
            int age = sc.nextInt();

            System.out.print("Enter salary (>40000): ");
            double salary = sc.nextDouble();

            if (age > 18 && salary > 40000) {
                p.setData(name, age, salary);
                p.showData();
            } else {
                System.out.println("Age must be >18 and Salary >40000");
            }

        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println("Data inserted successfully.");
            sc.close();
        }
    }
}
