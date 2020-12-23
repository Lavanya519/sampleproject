package task6;

public class EmployeeBO {
	public  void  topThree(Employee[] employee){

        for (int i = 0; i < employee.length; i++) {
            for (int j = i + 1; j < employee.length; j++) {
                try {
                    if (employee[i].getEmployeeId() == employee[j].getEmployeeId()) {
                        throw new DuplicateException("Duplicate ID Exists");
                    }
                } catch (DuplicateException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                }
            System.out.println("Employee ID" + "\t" + "Employee Name");
            for (Employee e : employee) {
                System.out.println(e.getEmployeeId() + "\t" + e.getEmployeeName());

            }
        }
	}
}
