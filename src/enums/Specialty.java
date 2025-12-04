package enums;

public enum Specialty {
    MEDICINE("Medicina"),
    JUTSU("Jutsu"),
    COMBAT("Combate"),
    ESPIONAGE("Espionagem"),
    BODYGUARD("Guarda-Costas");

    public final String description;

    Specialty(String description) {
        this.description = description;
    }

}
