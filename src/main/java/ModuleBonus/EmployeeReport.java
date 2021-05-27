package ModuleBonus;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class EmployeeReport {

    public List<Employee> getEmployees(List<Employee> employees, boolean descending) {
        return employees.stream()
                .filter(employee -> isAdult(employee))
                .sorted(descending ? Comparator.comparing(Employee::getName).reversed() : Comparator.comparing(Employee::getName))
                .map(employee -> new Employee(employee.getName().toUpperCase(), employee.getAge()))
                .collect(Collectors.toList());
    }

    private boolean isAdult(Employee employee) {
        return employee.getAge() > 17;
    }
}
