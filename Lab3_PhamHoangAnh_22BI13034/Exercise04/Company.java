package Lab3_PhamHoangAnh_22BI13034.Exercise04;

import java.util.Scanner;
import java.io.*;

public class Company {
  public static void main(String[] args) {
    clearScreen();
    Scanner input = new Scanner(System.in);
    int choice = 0;
    while (true) {
      System.out.println("Welcome to the company database! Enter the number of your choice:");
      System.out.println("1. Add employee");
      System.out.println("2. Show employee");
      System.out.println("3. Exit");
      System.out.print("Your choice: ");
      choice = input.nextInt();
      switch (choice) {
        case 1:
          System.out.print("\\nHow many employees do you want to add? ");
          int num = 0;
          while (true) {
            try {
              num = input.nextInt();
              break;
            } catch (Exception e) {
              System.out.print("Please enter an integer: ");
              input.nextLine();
            }
          }
          for (int i = 0; i < num; i++) {
            System.out.println("==> Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            String ID = input.next();
            System.out.print("Employee full name: ");
            String name = input.next();
            System.out.print("Employee department: ");
            String department = input.next();
            System.out.print("Basic salary: ");
            double basic_salary = 0;
            while (true) {
              try {
                basic_salary = input.nextDouble();
                if (basic_salary <= 0) {
                  throw new Exception("Basic salary must be larger than 0!");
                }
                break;
              } catch (Exception e) {
                System.out.println("Error: basic salary must be a number larger than 0!");
                System.out.print("Basic salary: ");
              }
            }
            System.out.print("Extra salary: ");
            double extra_salary = 0;
            while (true) {
              try {
                extra_salary = input.nextDouble();
                if (extra_salary <= 0) {
                  throw new Exception("Extra salary must be larger than 0!");
                }
                break;
              } catch (Exception e) {
                System.out.println("Error: extra salary must be a number larger than 0!");
                System.out.print("Extra salary: ");
              }
            }
            Employee employee = new Employee(ID, name, department, basic_salary, extra_salary);
            employee.writeToFile("employee.txt");
          }
          clearScreen();
          break;
        case 2:
          clearScreen();
          showEmployee();
          System.out.println();
          break;
        case 3:
          input.close();
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice!");
          break;
      }
    }
  }

  private static void showEmployee() {
    try {
      FileReader fileReader = new FileReader("./employee.txt");
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line = bufferedReader.readLine();
      while (line != null) {
        if (line.startsWith("Basic salary")) {
          String[] salary = line.split(": ");
          double basic_salary = Double.parseDouble(salary[1]);
          line = bufferedReader.readLine();
          String[] extra_salary = line.split(": ");
          double extra_salary_value = Double.parseDouble(extra_salary[1]);
          System.out.println("Income: " + (basic_salary + extra_salary_value * 2.5));
          line = bufferedReader.readLine();
        } else {
          System.out.println(line);
          line = bufferedReader.readLine();
        }
      }
      bufferedReader.close();
      fileReader.close();
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  private static void clearScreen() {
    System.out.print("\\033[H\\033[2J");
    System.out.flush();
  }
}
