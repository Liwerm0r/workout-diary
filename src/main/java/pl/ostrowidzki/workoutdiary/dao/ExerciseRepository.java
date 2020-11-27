package pl.ostrowidzki.workoutdiary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ostrowidzki.workoutdiary.entity.Exercise;


@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
