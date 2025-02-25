package ru.kory.runo.solutions;

import ru.kory.runo.solutions.leetcode_sql.easy.SqlQueryLeetCodeTasks;

public class SqlLessonsService {
    protected final SqlQueryLeetCodeTasks sqlQueryLeetCodeTasks;

    public SqlLessonsService(SqlQueryLeetCodeTasks sqlQueryLeetCodeTasks) {
        this.sqlQueryLeetCodeTasks = sqlQueryLeetCodeTasks;
    }

    protected String getSqlQuerySolution(String id) {
        return sqlQueryLeetCodeTasks.getLeetCodeSqlTask(Long.parseLong(id));
    }
}
