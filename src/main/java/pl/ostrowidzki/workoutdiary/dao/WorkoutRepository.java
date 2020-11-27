package pl.ostrowidzki.workoutdiary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ostrowidzki.workoutdiary.entity.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
