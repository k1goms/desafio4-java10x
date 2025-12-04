package enums;

public enum HabilityType {
    TAIJUTSU("Taijutsu"),
    NINJUTSU("Ninjutsu"),
    GENJUTSU("Genjutsu"),
    KATON("Katon"),
    RINNEGAN("Rinnegan");

    public final String description;

    HabilityType(String description) {
        this.description = description;
    }

}
