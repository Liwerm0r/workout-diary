package pl.ostrowidzki.workoutdiary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ostrowidzki.workoutdiary.entity.Weight;

@Repository
public interface WeightRepository extends JpaRepository<Weight, Long> {
}
