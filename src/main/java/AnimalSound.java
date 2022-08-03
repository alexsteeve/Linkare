import java.util.Arrays;
import java.util.List;

public class AnimalSound {

    public static void main(String[] args) {

        String[] pets = { "cat" , "dog" , "bird", "spider"};
        String[][] petsWithSound;
        petsWithSound = identifySpeak(pets);
        Arrays.stream(petsWithSound).map(strings -> strings[0] + " = " + strings[1])
                .forEach(System.out::println);
    }

    private static String[][] identifySpeak(String[] pets) {
        String [][] petsWithSound = new String[pets.length][2];
        String sound;
        for (int i = 0; i < pets.length; i++) {
            switch (pets[i]) {
                case "dog":
                    sound="aau";
                    break;
                case "cat":
                    sound="miau";
                    break;
                case "bird":
                    sound="piu";
                    break;
                default:
                    sound="animal not recognized";
            }
            petsWithSound[i][0] = pets[i];
            petsWithSound[i][1] = sound;
        }
        return petsWithSound;
    }

}
