package ru.kory.runo.solutions.leetcode_sql.easy;

public class _182_DuplicateEmails {
    String sqlQuery = """
            select p.email as email
            from Person as p
            group by p.email
            having count(p.email) > 1;
            """;

    public String getSolution() {
        return sqlQuery;
    }
}