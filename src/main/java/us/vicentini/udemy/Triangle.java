package us.vicentini.udemy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Triangle {

    private String type;

    private int height;

    public void draw() {
        System.out.println(getType() + " Triangle draw of height " + getHeight());
    }
}
