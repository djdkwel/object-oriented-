 

import javax.swing.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

import java.io.Serializable;

public class bi_weekly implements Serializable{

    public static void main(String[] args) {


        JFrame frame = new JFrame("JOptionPane showMessageDialog example");

        String first_name = JOptionPane.showInputDialog("Enter employee's first name: ");

        String last_name = JOptionPane.showInputDialog("Enter employee's last name: ");

        String hour = JOptionPane.showInputDialog("Enter number of hours worked for the last two weeks: ");
        double hours = Double.parseDouble(hour);

        String title = JOptionPane.showInputDialog("Enter employee's job title: ");

        String rates = JOptionPane.showInputDialog("Enter hourly pay rate based on their job title:");
        double rate = Double.parseDouble(rates);

        String tax_rate = JOptionPane.showInputDialog("Enter the percentage of tax that should be deducted from each salary:");
        double tax = Double.parseDouble(tax_rate);

        double gross_pay = rate * hours;
        double deduction= gross_pay*(tax/100);
        double total_salary= gross_pay - deduction;


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
            writer.write("Employee's gross pay : " +  gross_pay);
            writer.write("\r\n");   // write new line
            writer.write("Employee's salary after tax deduction : " +  total_salary);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}