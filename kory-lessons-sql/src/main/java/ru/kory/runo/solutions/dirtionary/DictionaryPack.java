package ru.kory.runo.solutions.dirtionary;

public enum DictionaryPack {
    COMBINE_TWO_TABLES_175("175"),
    EMPLOYEES_EARNING_MORE_THEIR_MANAGERS_181("181"),
    DUPLICATE_EMAILS_182("182"),
    CUSTOMERS_WHO_NEVER_ORDER_183("183"),
    RISING_TEMPERATURE_197("197"),
    SALES_PERSON_607("607");


    public final String id;

    DictionaryPack(String id) {
        this.id = id;
    }

    public String getValue() {
        return id;
    }

    public boolean equalsTo(String id) {
        return this.id.equals(id);
    }

    @Override
    public String toString() {
        return "DictionaryPack{" +
                "id='" + id + '\'' +
                '}';
    }
}
