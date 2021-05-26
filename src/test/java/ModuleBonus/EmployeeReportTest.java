package ModuleBonus;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
}