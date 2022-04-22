package Model;

import Validate.Validate;

public interface Shape {
    Validate validate = new Validate();
    void input();
    void output();
}
