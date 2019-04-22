package salary;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

import java.io.Serializable;

public class bi_weekly implements Serializable{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's first name:");
        String first_name = input.next();

        System.out.println("Enter employee's last name:");
        String last_name = input.next();

        System.out.println("Enter number of hours worked for the last two weeks:");
        double hours = input.nextDouble();

        System.out.println("Enter employee's job title:");
        String title = input.next();

        System.out.println("Enter hourly pay rate based on their job title:");
        double rate = input.nextDouble();

        double gross_pay = rate * hours;

        try {
            FileWriter writer = new FileWriter("Employee's Salary.txt", true);
            writer.write("Employee's first name is : "  + first_name);
            writer.write("\r\n");   // write new line
            writer.write("Employee's last name is : "  + last_name);
            writer.write("\r\n");   // write new line
            writer.write("Employee's job title is : " + title);
            writer.write("\r\n");   // write new line
            writer.write("Hours worked : "  + hours);
            writer.write("\r\n");   // write new line
            writer.write("Employee's pay rate is : "  + rate);
            writer.write("\r\n");   // write new line
            writer.write("Enter gross pay : " +  gross_pay);
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}