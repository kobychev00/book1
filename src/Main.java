public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        System.out.println("Курсовая работа");
        EMPLOYEES[0] = new Employee("Иванов Сергей Петрович", 2, 55000);
        EMPLOYEES[1] = new Employee("Петров Иван Сергеевич", 3, 54000);
        EMPLOYEES[2] = new Employee("Сергеев Петр Иванович", 4, 56000);
        EMPLOYEES[3] = new Employee("Аббасов Али Рассимович", 5, 66000);
        EMPLOYEES[4] = new Employee("Аманнулаев Эльмир Салех Оглы", 1, 60000);
        EMPLOYEES[5] = new Employee("Карпов Денис Евгеньевич", 2, 61000);
        EMPLOYEES[6] = new Employee("Щербакова Анна Евгеньевна", 4, 60500);
        EMPLOYEES[7] = new Employee("Глебова Яна Ивановна", 4, 41500);
        EMPLOYEES[8] = new Employee("Малютенкова Инна Петровна", 5, 49500);
        EMPLOYEES[9] = new Employee("Асфодьярова Ирина Владмировна", 5, 48750);

        printFullInfo();
        int totalSalaries = getTotalSalaries();
        System.out.println("Сумма зарплат " + totalSalaries);
        Employee employeeWithMinSalary = findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой:" + employeeWithMinSalary);
        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой:" + employeeWithMaxSalary);
        double averageSalary = findAverageSalary();
        System.out.printf("Средняя зарплата %.2f%n", averageSalary);
        printFullNameInfo();
    }

    private static void printFullInfo() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static int getTotalSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
            sum = sum + employee.getSalary();
            }
        }
        return sum;
    }
    private static Employee findEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }
    private static Employee findEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }
    private static double findAverageSalary() {
        int count = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                count++;
            }
        }
        if (count != 0) {
            return (double) getTotalSalaries() / count;
        }
        return 0;
    }
    private static void printFullNameInfo() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
