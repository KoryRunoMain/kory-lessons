package ru.kory.runo.solutions.leetcode_sql.easy;

public class _607_SalesPerson {
    String sqlQuery = """
            select s.name as name
            from SalesPerson as s
            where not exists (
                select o.sales_id
                from Orders as o
                left join Company as c on c.com_id = o.com_id
                where o.sales_id = s.sales_id and c.name = 'RED'
            );
            """;

    public String getSolution() {
        return sqlQuery;
    }
}
