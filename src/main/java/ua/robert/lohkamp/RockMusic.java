package ua.robert.lohkamp;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public String getSong() {
        return "Highway to Hell";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
