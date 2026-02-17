package Tema_8_TiposNumerados;

public enum ExtendedStringOperation implements StringOperation {

    STRIP("Removing leading and trailing spaces") {
        @Override
        public String apply(String input) {
            return input.strip();
        }
    },

    REVERSE("Reversing the given string") {
        @Override
        public String apply(String input) {
            return new StringBuilder(input).reverse().toString();
        }
    };

    private final String description;

    ExtendedStringOperation(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
