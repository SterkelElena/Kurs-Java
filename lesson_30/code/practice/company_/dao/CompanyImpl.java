package practice.company_.dao;

import practice.company_.model.Manager;

public class CompanyImpl implements Company {
    // поля которые описывают компанию
    private Manager.Employee[] employees; // массив для хранения сотрудников
    private int size; // текущее количество сотрудников
    // конструктор
    public  CompanyImpl(int capacity){
        employees = new Manager.Employee[capacity]; // capacity - // максимальный размер компании
    }
    @Override
    public boolean addEmployee(Manager.Employee employee) {
        return false;
    }

    @Override
    public Manager.Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Manager.Employee findEmployee(int id) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double avgSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public void printEmployee() {

    }
}
