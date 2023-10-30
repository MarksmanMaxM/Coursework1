public class ServiceEmployee {


    public double sumSalaryPerMounth(Employee employee[]) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    public int minSalary(Employee employee[]) {
        double min = employee[0].getSalary();
        int number = 0;

        for (int i = 1; i < employee.length; i++) {
            if (employee[i] != null) {
                if (min > employee[i].getSalary()) {
                    min = employee[i].getSalary();
                    number = i;
                }
            }
        }

        return number;

    }


    public int maxSalary(Employee employee[]) {
        double max = employee[0].getSalary();
        int number = 0;

        for (int i = 1; i < employee.length; i++) {
            if (employee[i] != null) {
                if (max < employee[i].getSalary()) {
                    max = employee[i].getSalary();
                    number = i;
                }
            }
        }

        return number;

    }

    public double avrSalary(Employee employee[]) {
        double count = 0;
        for (Employee emp1 : employee) {
            if (emp1 != null) {
                count++;
            }

        }
        double avrSal = sumSalaryPerMounth(employee) / count;
        return avrSal;
    }


}
