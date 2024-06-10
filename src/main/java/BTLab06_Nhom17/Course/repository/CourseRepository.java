package BTLab06_Nhom17.Course.repository;

import BTLab06_Nhom17.Course.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
