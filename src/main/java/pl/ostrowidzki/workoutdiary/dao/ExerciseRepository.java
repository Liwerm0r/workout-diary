package pl.ostrowidzki.workoutdiary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ostrowidzki.workoutdiary.entity.Exercise;


public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
