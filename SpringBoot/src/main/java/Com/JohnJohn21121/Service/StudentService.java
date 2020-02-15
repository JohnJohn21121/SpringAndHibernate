package Com.JohnJohn21121.Service;

import Com.JohnJohn21121.Dao.StudentDao;
import Com.JohnJohn21121.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }
    public void updateStudent(Student student){
        this.studentDao.updateStudentById(student);
    }
}
