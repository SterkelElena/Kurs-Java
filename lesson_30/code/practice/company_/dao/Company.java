package practice.company_.dao;

import practice.company_.model.Manager;

//  - добавить сотрудника
//  - удалить сотрудника
//  - найти сотрудника
//  - кол-во сотрудников
//  - ФОТ
//  - средняя з/п
//  - объем продаж
//  - напечатать список сотрудников
public interface Company {
    // оъявляем методы, только сигнатуры, без тела метода
   boolean addEmployee(Manager.Employee employee);
   Manager.Employee removeEmployee(int id);
   Manager.Employee findEmployee(int id);
   int quantity();
   double totalSalary(); // - ФОТ, зарплата всех
   double avgSalary(); // средняя зарплата по компании, - average средний
   double totalSales(); // - объём продаж

   void printEmployee();


}
