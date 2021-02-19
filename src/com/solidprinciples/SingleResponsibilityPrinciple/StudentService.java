package solidprinciples.SingleResponsibilityPrinciple;

public class StudentService {
    public void insert(Student student){
        System.out.println("Insert student");
    }
    public void update(Student student){
        System.out.println("Update student");
    }
    public void delete(Student student){
        System.out.println("Delete student");
    }
}
