import java.util.ArrayList;

import java.util.Objects;

public class Piano {
    ArrayList<Key> pianoKeyboard = new ArrayList<>();

    /*
     * Конструктор создает пианино в зависимости от количества нужных октав
     */
    public Piano() {
            pianoKeyboard.add(new Key(Pitch.C));
            pianoKeyboard.add(new Key(Pitch.Csharp));
            pianoKeyboard.add(new Key(Pitch.D));
            pianoKeyboard.add(new Key(Pitch.Dsharp));
            pianoKeyboard.add(new Key(Pitch.E));
            pianoKeyboard.add(new Key(Pitch.F));
            pianoKeyboard.add(new Key(Pitch.Fsharp));
            pianoKeyboard.add(new Key(Pitch.G));
            pianoKeyboard.add(new Key(Pitch.Gsharp));
            pianoKeyboard.add(new Key(Pitch.A));
            pianoKeyboard.add(new Key(Pitch.Asharp));
            pianoKeyboard.add(new Key(Pitch.B));
            pianoKeyboard.trimToSize();
    }

    public void playPiano(int[] playPattern){
        for (int pitch : playPattern) {
            try {
                pianoKeyboard.get(pitch).pressKey();
            } catch (KeyNotTunedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Piano)) return false;
        Piano piano1 = (Piano) o;
        return Objects.equals(pianoKeyboard, piano1.pianoKeyboard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pianoKeyboard);
    }
}
