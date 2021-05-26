package ModuleBonus;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeReport {

    public List<Employee> getEmployees(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> isAdult(employee))
                .collect(Collectors.toList());
    }

    private boolean isAdult(Employee employee) {
        return employee.getAge() > 17;

    }
}
