package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>(); // Lista list do tipo String.

        String path = "C:\\ambiente-grpfor\\in.csv"; // A variável path recebe o caminho do arquivo de origem.

        // A variável br do tipo BufferedReader vai ler o que estiver na variável path.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsv = br.readLine(); // .readLine() lê uma linha do arquivo e vai armazenar em name.
            while (employeeCsv != null) {

                // .split() corta a String que o antecede com base no que estiver dentro dos parênteses e armazena as partes cortadas em um vetor.
                String[] fields = employeeCsv.split(","); // fields = campos.

                // Como a Lista é do tipo Employee, para adicionar itens a ela eu tenho que sempre passar uma nova instanciação dentro dos parênteses.
                list.add(new Employee(fields[0], Double.parseDouble(fields[1]))); // Double.parseDouble() converte em Double o que estiver dentro dos parênteses.
                employeeCsv = br.readLine(); // .readLine() lê a linha seguinte do arquivo e vai armazenar em name.
            }

            // Collections.sort() ordena a lista que estiver dentro dos parênteses.
            Collections.sort(list); // Collections = Coleções, sort = ordenar.
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}