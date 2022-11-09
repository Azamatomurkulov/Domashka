import java.security.Key;

public class Keyboard {

    private boolean backlight;
    private boolean keypad;

    public Keyboard(boolean backlight,boolean keypad){
        this.backlight = backlight;
        this.keypad = keypad;
    }
    public void setBacklight(boolean backlight){
        this.backlight = backlight;
    }
    public boolean isBacklight(){
        return backlight;
    }

    public boolean isKeypad() {
        return keypad;
    }

    public void setKeypad(boolean keypad) {
        this.keypad = keypad;
    }

    @Override
    public String toString() {
        return
                "Backlight: " + backlight +
                ", Keypad: " + keypad;
    }
}
