package Lab3_PhamHoangAnh_22BI13034.Exercise04;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Employee {
  private String ID;
  private String name;
  private String department;
  private double basic_salary;
  private double extra_salary;

  public Employee(String ID, String name, String department, double basic_salary, double extra_salary) {
    this.ID = ID;
    this.name = name;
    this.department = department;
    this.basic_salary = basic_salary;
    this.extra_salary = extra_salary;
  }

  public String getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }

  public double getBasic_salary() {
    return basic_salary;
  }

  public double getExtra_salary() {
    return extra_salary;
  }

  public String toString() {
    String lineID = "Employee ID: " + ID;
    String lineName = "Employee full name: " + name;
    String lineDepartment = "Employee department: " + department;
    String lineSalary = "Basic salary: " + basic_salary;
    String lineExtraSalary = "Extra salary: " + extra_salary;
    return lineID + "\\r\\n" + lineName + "\\r\\n" + lineDepartment + "\\r\\n" + lineSalary + "\\r\\n" + lineExtraSalary + "\\r\\n--------------------";
  }

  public void writeToFile(String path) {
    try {
      FileWriter fileWriter = new FileWriter(path, true);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write(this.toString());
      bufferedWriter.newLine();
      bufferedWriter.close();
      fileWriter.close();
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
