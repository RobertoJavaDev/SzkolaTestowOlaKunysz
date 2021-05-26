package ModuleBonus;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class EmployeeReportTest {

    private EmployeeReport employeeReport;

    @BeforeEach
    void setUp() {
        employeeReport = new EmployeeReport();
    }

    @Test
    void shouldReturnEmptyListWhenThereAreNoEmployees() {
        //when
        List<Employee> employeeList = employeeReport.getEmployees(new ArrayList<>());

        //then
        Assertions.assertThat(employeeList.size()).isEqualTo(0);
    }

    @Test
    void shouldReturnEmployeesListWhichAreOlderThan18Years() {
        //given
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

    @Test
    void shouldReturnEmployeesListWhoAreMinors() {
        //given
        List<Employee> employees = Arrays.asList(
                new Employee("Max",17),
                new Employee("Nina",15));

        //when
        List<Employee> employeeList = employeeReport.getEmployees(employees);

        //then
        Assertions.assertThat(employeeList.size()).isEqualTo(0);
    }
}