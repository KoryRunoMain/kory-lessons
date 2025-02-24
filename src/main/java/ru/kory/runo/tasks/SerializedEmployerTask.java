package ru.kory.runo.tasks;

/*
Создайте класс Employee, который реализует интерфейс Serializable.
В классе должны быть поля name, position и salary.
Добавьте метод для сериализации объекта Employее в файл и метод для десериализации объекта из файла.
Напишите код, который создает объект Employee, сериализует его в файл,
затем десериализует из файла и выводит данные о сотруднике на экран.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    String name;
    String position;
    double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void serialize(String filename) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(this);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public Employee deserialize(String filename) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            return (Employee) ois.readObject();
        } catch (Exception e) {
            e.getMessage();
            return new Employee(null, null, 0);
        }
    }

}

public class SerializedEmployerTask {

    public static void main(String[] args) {

        Employee employee = new Employee(
                "Vladimir",
                "Developer",
                100);
        employee.serialize("employee.serialized");

        Employee newEmployee = new Employee(null, null, 0);
        Employee desEmployee = newEmployee.deserialize("employee.serialized");
        System.out.println(desEmployee.name);
        System.out.println(desEmployee.position);
        System.out.println(desEmployee.salary);

    }

}
