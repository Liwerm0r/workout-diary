package pl.ostrowidzki.workoutdiary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ostrowidzki.workoutdiary.entity.Workout;


public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
