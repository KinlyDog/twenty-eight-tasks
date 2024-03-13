package tasks;

import java.util.Arrays;

public class SynchronizingTables {
    public static int[] synchronizingTables(int n, int[] ids, int[] salary) {
        int[] empId = Arrays.copyOf(ids, ids.length);
        int[] empSalary = Arrays.copyOf(salary, salary.length);

        Arrays.sort(empId);
        Arrays.sort(empSalary);

        int[] rightEmpSalary = new int[salary.length];

        for (int i = 0; i < salary.length; i++) {
            for (int j = 0; j < salary.length; j++) {
                if (ids[i] == empId[j]) {
                    rightEmpSalary[i] = empSalary[j];
                    break;
                }
            }
        }

        return rightEmpSalary;
    }
}
