package ru.kory.runo.solutions;

import ru.kory.runo.solutions.leetcode_sql.easy._175_CombineTwoTables;
import ru.kory.runo.solutions.leetcode_sql.easy._181_EmployeesEarningMoreThanTheirManagers;
import ru.kory.runo.solutions.leetcode_sql.easy._182_DuplicateEmails;
import ru.kory.runo.solutions.leetcode_sql.easy._183_CustomersWhoNeverOrder;
import ru.kory.runo.solutions.leetcode_sql.easy._197_RisingTemperature;
import ru.kory.runo.solutions.leetcode_sql.easy._607_SalesPerson;

public class SqlQueryLeetCodeTasksImpl {
    private final _175_CombineTwoTables combineTwoTables;
    private final _181_EmployeesEarningMoreThanTheirManagers employeesEarningMoreThanTheirManagers;
    private final _182_DuplicateEmails duplicateEmails;
    private final _183_CustomersWhoNeverOrder customersWhoNeverOrder;
    private final _197_RisingTemperature risingTemperature;
    private final _607_SalesPerson salesPerson;

    public SqlQueryLeetCodeTasksImpl() {
        this.combineTwoTables = new _175_CombineTwoTables();
        this.employeesEarningMoreThanTheirManagers = new _181_EmployeesEarningMoreThanTheirManagers();
        this.duplicateEmails = new _182_DuplicateEmails();
        this.customersWhoNeverOrder = new _183_CustomersWhoNeverOrder();
        this.risingTemperature = new _197_RisingTemperature();
        this.salesPerson = new _607_SalesPerson();
    }

    public String getSqlQuerySolution(String id) {
        return switch (id) {
            case "175" -> combineTwoTables.getSolution();
            case "181" -> employeesEarningMoreThanTheirManagers.getSolution();
            case "182" -> duplicateEmails.getSolution();
            case "183" -> customersWhoNeverOrder.getSolution();
            case "197" -> risingTemperature.getSolution();
            case "607" -> salesPerson.getSolution();
            default -> "404 Not Found";
        };
    }
}
