package ru.kory.runo.solutions.leetcode_sql.easy;

public class _183_CustomersWhoNeverOrder {
    String sqlQuery = """
            select c.name as Customers
            from Customers as c
            left join Orders as o on c.id = o.customerId
            where o.customerId is null
            """;

    public String getSolution() {
        return sqlQuery;
    }
}