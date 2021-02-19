package solidprinciples.InterfaceSegregationPrinciple;

public class UnderGraduateStudent extends Student implements ThesisAble {
    public void createThesis() {
        System.out.println("Create Thesis");
    }
}
