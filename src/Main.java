public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];


        employees[0] = new Employee("Смирнов Сергей Валентинович", 70000, 1, 1);
        employees[1] = new Employee("Купидонова Ксения Викторовна", 65000, 1, 2);
        employees[2] = new Employee("Громов Максим Валерьевич", 75000, 2, 3);
        employees[3] = new Employee("Фирсов Павел Николаевич", 85000, 2, 4);
        employees[4] = new Employee("Олегова Мария Олеговна", 94000, 3, 5);
        employees[5] = new Employee("Вологдин Алексей Никонорович", 76000, 3, 6);
        employees[6] = new Employee("Сенаторова Алевтина Сергеевна", 50000, 4, 7);
        employees[7] = new Employee("Муркин Олег Юрьевич", 68000, 4, 8);
        employees[8] = new Employee("Скрипка Альяна Фериповна", 70000, 5, 9);
        employees[9] = new Employee("Конева Анжелика Афанасьевна", 87000, 5, 10);


        for (Employee employee : employees) {
            System.out.println("Employee Name: " + employee.getFullName());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("ID: " + employee.getId());
            System.out.println("-------------------");
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        int totalSalary = Employee.calculateTotalSalary(employees);
        System.out.println("Общая зарплата всех сотрудников составит: " + totalSalary + " рублей.");
        System.out.println("============");


        int maxSalary = Employee.calculateMaxSalary(employees);
        System.out.println("Максимальная зарплата сотрудника составит : " + maxSalary + " рублей.");
        System.out.println("============");

        int minSalary = Employee.calculateMinSalary(employees);
        System.out.println("Минимальная зарплата сотрудника в списке составит : " + minSalary + " рублей.");
        System.out.println("============");

        double averageSalary = Employee.calculateAverageSalary(employees);
        System.out.println("Средняя зарплата сотрудников составит: " + averageSalary);
    }
}




