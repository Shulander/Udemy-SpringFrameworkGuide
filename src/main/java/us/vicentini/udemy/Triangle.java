package us.vicentini.udemy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle {

    private String type;

    public void draw() {
        System.out.println( getType()+" Triangle draw");
    }

}
