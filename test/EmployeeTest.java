/*(Employee Class) Create a class called Employee that includes three instance variables—a
        first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor
        that initializes the three instance variables. Provide a set and a get method for each instance
        variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest
        that demonstrates class Employee’s capabilities. Create two Employee objects and display each
        object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary
        again.*/
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;

    @BeforeEach
    void setUp() {
        //employee = new Employee();
    }

    @AfterEach
    void tearDown() {
        employee = null;
    }

    @Test

        void testThatEmployeeHasFirstName(){
        employee = new Employee("John", "Sam", 900.00);
        assertEquals("John", employee.getFirstName());
    }
    @Test

        void testThatICanSetEmployeeName(){
        employee = new Employee("John", "Sam", 900.00);

        employee.setFirstName("David");
        assertEquals("David",employee.getFirstName());
    }
}