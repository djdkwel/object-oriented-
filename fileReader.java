package salary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class fileReader {
        public static void main(String[] args) {
            try {
                FileReader reader = new FileReader("Employee's Salary.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);
                String sentences;


                while ((sentences = bufferedReader.readLine()) != null) {
                    System.out.println(sentences);
                }
                reader.close();
            }

            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

