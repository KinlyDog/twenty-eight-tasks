package tasks;

import java.util.Arrays;

public class SynchronizingTables {
    public static int[] synchronizingTables(int n, int[] ids, int[] salary) {
        int[] empId = Arrays.copyOf(ids, n);
        int[] empSalary = Arrays.copyOf(salary, n);

        Arrays.sort(empId);
        Arrays.sort(empSalary);

        int[] rightEmpSalary = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ids[i] == empId[j]) {
                    rightEmpSalary[i] = empSalary[j];
                    break;
                }
            }
        }

        return rightEmpSalary;
    }
}
