package ru.kory.runo.solutions.leetcode_sql.easy;

public class _175_CombineTwoTables {
    String sqlQuery = """
            select p.firstName, p.lastName, a.city, a.state
            from Person as p
            left join Address as a on p.personId = a.personId
            """;

    public String getSolution() {
        return sqlQuery;
    }
}