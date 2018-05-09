package us.vicentini.udemy.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.vicentini.udemy.shape.Circle;
import us.vicentini.udemy.shape.Triangle;

@Getter
@Setter
@Service
public class ShapeService {

    @Autowired
    private Circle circle;
    @Autowired
    private Triangle triangle;

}
