package ModuleBonus;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeReportTest {

    private EmployeeReport employeeReport;

    @BeforeEach
    void setUp() {
        employeeReport = new EmployeeReport();
    }

    @Test
    void shouldReturnEmptyListWhenThereAreNoEmployees() {
        //when
        List<Employee> employeeList = employeeReport.getEmployees(new ArrayList<>(), false);

        //then
        assertThat(employeeList.size()).isEqualTo(0);
    }

    @Test
    void shouldReturnEmployeesListWhichAreOlderThan18Years() {
        //given
        List<Employee> employees = getEmployees();

        //when
        List<Employee> employeeList = employeeReport.getEmployees(employees, false);

        //then
        assertThat(employeeList.size()).isEqualTo(2);
    }

    @Test
    void shouldReturnEmployeesListWhoAreMinors() {
        //given
        List<Employee> employees = Arrays.asList(
                new Employee("Max",17),
                new Employee("Nina",15));

        //when
        List<Employee> employeeList = employeeReport.getEmployees(employees, false);

        //then
        assertThat(employeeList.size()).isEqualTo(0);
    }

    @Test
    void shouldReturnEmployeesListSortedByTheirNameAscending() {
        //given
        List<Employee> employees = getEmployees();

        //when
        List<Employee> employeeList = employeeReport.getEmployees(employees, false);

        //then
        assertThat(employeeList).isEqualTo(Arrays.asList(new Employee("MIKE",51), new Employee("SEPP",18)));
    }

    @Test
    void shouldReturnEmployeesListByNameCapitalized() {
        //given
        List<Employee> employees = getEmployees();

        //when
        List<Employee> employeeList = employeeReport.getEmployees(employees, true);

        //then
        assertThat(employeeList).isEqualTo(Arrays.asList(new Employee("SEPP",18), new Employee("MIKE",51)));
    }

    @Test
    void shouldReturnEmployeesListSortedByTheirNameDescending() {
        //given
        List<Employee> employees = getEmployees();

        //when
        List<Employee> employeeList = employeeReport.getEmployees(employees, true);

        //then
        assertThat(employeeList).isEqualTo(Arrays.asList(new Employee("SEPP",18), new Employee("MIKE",51)));
    }

    private List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee("Max", 17),
                new Employee("Sepp", 18),
                new Employee("Nina", 15),
                new Employee("Mike", 51));
    }
}