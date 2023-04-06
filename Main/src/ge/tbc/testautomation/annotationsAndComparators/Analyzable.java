package ge.tbc.testautomation.annotationsAndComparators;

public class Analyzable {
    @VariableNameAnnotation(name = "Integer1")
    public int integer1;

    @VariableNameAnnotation(name = "Integer2")
    public int integer2;
    @VariableNameAnnotation(name = "Integer3")
    public int integer3;
    @VariableNameAnnotation(name = "Somethingelse1")
    public int integer4;
    @VariableNameAnnotation
    public int integer5;
    @VariableNameAnnotation(name = "String1")
    public String string1;
    @VariableNameAnnotation(name = "String2")
    public String string2;
    @VariableNameAnnotation(name = "String3")
    public String string3;
    @VariableNameAnnotation(name = "Somethingelse2")
    public String string4;
    @VariableNameAnnotation
    public String string5;
    @VariableNameAnnotation(name = "Double1")
    public double double1;
    @VariableNameAnnotation(name = "Double2")
    public double double2;
    @VariableNameAnnotation(name = "Double3")
    public double double3;
    @VariableNameAnnotation(name = "Somethingelse3")
    public double double4;
    @VariableNameAnnotation
    public double double5;
}
