package BTLab06_Nhom17.Course.Service;

import BTLab06_Nhom17.Course.Model.Course;
import BTLab06_Nhom17.Course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public void add(Course newCourse) {
        courseRepository.save(newCourse);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Integer id) {
        return courseRepository.findById(id).orElse(null);
    }

    public String update(Course updatedCourse) {
        // Kiem tra cac truong bat buoc
        if (updatedCourse.getStartDate() == null ||
                updatedCourse.getLectureName() == null ||
                updatedCourse.getPlace() == null) {
            return "Vui lòng điền đầy đủ thông tin để cập nhật khóa học.";
        }

        if (courseRepository.existsById(updatedCourse.getId())) {
            courseRepository.save(updatedCourse);
            return "Cập nhật khóa học thành công.";
        } else {
            return "Không tìm thấy khóa học để cập nhật.";
        }
    }
    public void delete(Integer id) {
        courseRepository.deleteById(id);
    }
}
