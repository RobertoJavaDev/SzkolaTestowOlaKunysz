package ModuleBonus;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class EmployeeReportTest {

    @Test
    void shouldReturnEmptyListWhenThereAreNoEmployees() {
        //given
        EmployeeReport employeeReport = new EmployeeReport();

        //when
        List<Employee> employeeList = employeeReport.getEmployees(new ArrayList<>());

        //then
        Assertions.assertThat(employeeList.size()).isEqualTo(0);
    }

    @Test
    void shouldReturnEmployeesListWhichAreOlderThan18Years() {
        //given
        EmployeeReport employeeReport = new EmployeeReport();
        List<Employee> employees = Arrays.asList(
                new Employee("Max",17),
                new Employee("Sepp", 18),
                new Employee("Nina",15),
                new Employee("Mike",51));

        //when
        List<Employee> employeeList = employeeReport.getEmployees(employees);

        //then
        Assertions.assertThat(employeeList.size()).isEqualTo(2);

    }
}