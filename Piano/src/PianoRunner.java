public class PianoRunner {
    public static void main(String[] args) {
        /*
         * Создаем пианино
         */
        Piano piano = new Piano();

        /*
         * Проиграем простую гамму
         */
        int[] playPattern = {0, 2, 4, 5, 7, 9, 11};

        try {
            piano.playPiano(playPattern);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
