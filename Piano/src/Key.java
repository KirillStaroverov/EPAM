public class Key {
    private Pitch pitch;
    private boolean isTuned = true;

    public Key(Pitch pitch) {
        this.pitch = pitch;
    }

    public Key(Pitch pitch, boolean isTuned) {
        this.pitch = pitch;
        this.isTuned = isTuned;
    }

    public Pitch getPitch() {
        return pitch;
    }

    public void setPitch(Pitch pitch) {
        this.pitch = pitch;
    }

    public boolean isTuned() {
        return isTuned;
    }

    public void setTuned(boolean tuned) {
        isTuned = tuned;
    }

    @Override
    public String toString() {
        return "Pitch: " + pitch + " is it tuned: " + isTuned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key)) return false;

        Key key = (Key) o;

        if (isTuned != key.isTuned) return false;
        return pitch == key.pitch;
    }

    @Override
    public int hashCode() {
        int result = pitch != null ? pitch.hashCode() : 0;
        result = 31 * result + (isTuned ? 1 : 0);
        return result;
    }


    /*
     *  Воспроизводит ноту, в зависимости от её значения (нажать клавишу на пианино)
     */

    public void pressKey() throws KeyNotTunedException {

        /*
         *  Если клавиша настроена, то играет нормально. Если нет, то играет раномный звук.
         */

        if (isTuned) {
            switch (pitch) {
                case A:
                    Sound.playSound("assets/a1.wav").join();
                    System.out.println(this);
                    break;
                case Asharp:
                    Sound.playSound("assets/a1s.wav").join();
                    System.out.println(this);
                    break;
                case B:
                    Sound.playSound("assets/b1.wav").join();
                    System.out.println(this);
                    break;
                case C:
                    Sound.playSound("assets/c1.wav").join();
                    System.out.println(this);
                    break;
                case Csharp:
                    Sound.playSound("assets/c1s.wav").join();
                    System.out.println(this);
                    break;
                case D:
                    Sound.playSound("assets/d1.wav").join();
                    System.out.println(this);
                    break;
                case Dsharp:
                    Sound.playSound("assets/d1s.wav").join();
                    System.out.println(this);
                    break;
                case E:
                    Sound.playSound("assets/e1.wav").join();
                    System.out.println(this);
                    break;
                case F:
                    Sound.playSound("assets/f1.wav").join();
                    System.out.println(this);
                    break;
                case Fsharp:
                    Sound.playSound("assets/f1s.wav").join();
                    System.out.println(this);
                    break;
                case G:
                    Sound.playSound("assets/g1.wav").join();
                    System.out.println(this);
                    break;
                case Gsharp:
                    Sound.playSound("assets/g1.wav").join();
                    System.out.println(this);
                    break;
            }
        } else {
            throw new KeyNotTunedException("Клавиша не настроена");
        }

    }

    /*
     *  Настроить ноту
     */

    public void tune() {
        this.isTuned = true;
    }
}
