package ru.kory.runo.solutions.leetcode_sql.easy;

public class _182_DuplicateEmails implements SqlQueryLeetCodeTasks {
    String sqlQuery = """
            select p.email as email
            from Person as p
            group by p.email
            having count(p.email) > 1;
            """;

    @Override
    public String getLeetCodeSqlTask(Long id) {
        return sqlQuery;
    }
}