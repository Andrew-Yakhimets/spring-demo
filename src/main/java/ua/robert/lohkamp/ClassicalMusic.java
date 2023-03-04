package ua.robert.lohkamp;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    public String getSong() {
        return "Moon Sonata";
    }

    public void doMyInit() {
        System.out.println("Do my init");
    }

    public void doMyDestroy() {
        System.out.println("Do my destroy");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
