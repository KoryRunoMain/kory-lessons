package ru.kory.runo.solutions.leetcode_sql.easy;

public class _607_SalesPerson implements SqlQueryLeetCodeTasks {
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

    @Override
    public String getLeetCodeSqlTask(Long id) {
        return sqlQuery;
    }
}
