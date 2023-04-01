package ge.tbc.testautomation.abstractClassesInterfaces.interfaces;

import ge.tbc.testautomation.javaOOP.figures.Circle;

public interface IResizableCircle {
    Circle returnDoubleSizedCircle(Circle circle);

    Circle returnCustomSizedCircle(Circle circle, double byvValue);
}
