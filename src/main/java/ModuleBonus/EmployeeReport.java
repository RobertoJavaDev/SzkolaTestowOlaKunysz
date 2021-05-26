package ModuleBonus;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class EmployeeReport {

    public List<Employee> getEmployees(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> employee.getAge()>17)
                .collect(Collectors.toList());
    }
}
