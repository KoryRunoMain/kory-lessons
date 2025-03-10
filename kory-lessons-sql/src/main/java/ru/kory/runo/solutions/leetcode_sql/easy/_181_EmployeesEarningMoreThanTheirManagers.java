package ru.kory.runo.solutions.leetcode_sql.easy;

public class _181_EmployeesEarningMoreThanTheirManagers {
    String sqlQuery = """
            select e.name as Employee
            from Employee as e
            inner join Employee as m on e.managerId = m.id
            where e.salary > m.salary
            """;

    public String getSolution() {
        return sqlQuery;
    }
}