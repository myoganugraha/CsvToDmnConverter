package at.jit.constants;

public enum DmnDataTypes {
    STRING("string"),
    BOOLEAN("boolean"),
    INTEGER("integer"),
    LONG("long"),
    DOUBLE("double"),
    DATE("date"),
    NUMBER("number");

    private final String value;

    DmnDataTypes(String value) {
        this.value = value;
    }

    public static boolean dataTypeExists(String dataType) {
        for (DmnDataTypes dmnDataTypes : DmnDataTypes.values()) {
            if (dmnDataTypes.value().equals(dataType.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public String value() {
        return this.value;
    }
}
