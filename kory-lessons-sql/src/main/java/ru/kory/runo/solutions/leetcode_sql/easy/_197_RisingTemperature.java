package ru.kory.runo.solutions.leetcode_sql.easy;

public class _197_RisingTemperature {
    String sqlQuery = """   
            select w.id as Id
            from Weather as w
            inner join Weather as w1 on w.recordDate = w1.recordDate + interval '1 day'
            where w.temperature > w1.temperature;
            """;

    public String getSolution() {
        return sqlQuery;
    }
}
