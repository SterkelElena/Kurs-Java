package practice.company_.model;

public class Manager extends Employee {
    private double baseSalary;
    private int grade;

    public Manager(int id, String firstName, String lastName, int age, double hours, double baseSalary, int grade) {
        super(id, firstName, lastName, age, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = baseSalary + grade * hours;
        return salary;
    }

    public abstract static class Employee {
        //поля класса
        protected final int id;
        protected String firstName;
        protected String lastName;
        protected int age;
        protected double hours;

        // конструктор
        public Employee(int id, String firstName, String lastName, int age, double hours) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hours = hours;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getHours() {
            return hours;
        }

        public void setHours(double hours) {
            this.hours = hours;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Employee ");
            sb.append("id=").append(id);
            sb.append(", firstName='").append(firstName).append('\'');
            sb.append(", lastName='").append(lastName).append('\'');
            sb.append(", hours=").append(hours);
            sb.append(", salary=").append(calcSalary());
            return sb.toString();
        }

        public abstract double calcSalary(); // определили абстрактный метод (у него нет тела!)

    }
}
