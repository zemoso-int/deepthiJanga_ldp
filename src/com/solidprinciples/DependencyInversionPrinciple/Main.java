package solidprinciples.DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        Connection connection = new MySqlConnection();
        StudentRepository studentRepository = new StudentRepository(connection);
        studentRepository.save();
        studentRepository.delete();
        studentRepository.update();
    }
}
