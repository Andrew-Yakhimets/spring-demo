package ua.robert.lohkamp;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    public String getSong() {
        return "Jazz song";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
