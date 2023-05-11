public class Main {

    private static final Employee[] employees = {
            new Employee("Иванов Иван Иванович", 10_000, 1),
            new Employee("Петров Василий Иванович", 11_000, 2),
            new Employee("Васильев Сергей Генадьевич", 20_000, 4),
            new Employee("Сергеев Иван Петрович", 145_000, 2),
            new Employee("Калинин Дмитрий Петрович", 19_000, 5),
            new Employee("Дмитриев Алексей Романыч", 22_000, 3),
            new Employee("Романов Роман Сергеевич", 25_000, 1),
            new Employee("Хусаинов Альберт Генадьевич", 33_000, 4),
            new Employee("Быстров Дмитрий Станиславович", 77_000, 5),
            new Employee("Кирюшин Альберт Васильевич", 30_000, 3)
    };

    public static void main(String[] args) {
        printListEmployees();
        System.out.println("--------------");

        System.out.println(amountOfWages());
        System.out.println("--------------");

        System.out.println(findTheMinimumWage());
        System.out.println("--------------");

        System.out.println(findTheMaximumWage());
        System.out.println("--------------");

        System.out.println(averageSalary());
        System.out.println("--------------");

        printListEmployeesName();
        System.out.println("--------------");
    }

    public static void printListEmployees() {
        for (Employee worker : employees) {
            System.out.println(worker);
        }
    }

    public static float amountOfWages() {
        int sum = 0;
        for (Employee worker : employees) {
            sum += worker.getSalary();
        }
        return sum;
    }

    public static Employee findTheMinimumWage() {
        Employee result = employees[0];

        for (Employee worker : employees) {
            if (worker.getSalary() < result.getSalary()) {
                result = worker;
            }
        }
        return result;
    }

    public static Employee findTheMaximumWage() {
        Employee result = employees[0];

        for (Employee worker : employees) {
            if (worker.getSalary() > result.getSalary()) {
                result = worker;
            }
        }
        return result;
    }

    public static float averageSalary() {
        return amountOfWages() / (float) employees.length;
    }

    public static void printListEmployeesName() {
        for (Employee worker : employees) {
            System.out.println(worker.getFullName());
        }
    }
}