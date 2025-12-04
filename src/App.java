import enums.HabilityType;
import enums.Specialty;
import model.AdvancedNinja;
import model.BasicNinja;

public class App {
    public static void main(String[] args) {

        BasicNinja basicNinja = new BasicNinja(
                "Hyato",
                18,
                "Aldeia da Folha",
                "Bola de Fogo", HabilityType.KATON
        );

        AdvancedNinja advancedNinja = new AdvancedNinja(
                "Iorin",
                20,
                "Aldeia da Folha",
                "Dragões de Água",
                HabilityType.NINJUTSU,
                Specialty.JUTSU
        );

        basicNinja.showInfo();
        basicNinja.executeSkill();

        System.out.println("\n------------------------------\n");

        advancedNinja.showInfo();
        advancedNinja.executeSkill();

    }
}
