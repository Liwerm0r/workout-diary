package pl.ostrowidzki.workoutdiary.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workoutId;

    private LocalDate dateOfWorkout;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade =  { CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "workout_details",
            joinColumns = { @JoinColumn(name = "workout_id")},
            inverseJoinColumns = { @JoinColumn(name = "exercise_id")}
    )
    private Set<Exercise> exercises = new HashSet<>();

    public Workout() {

    }

    public Workout(LocalDate dateOfWorkout, Set<Exercise> exercises) {
        this.dateOfWorkout = dateOfWorkout;
        this.exercises = exercises;
    }

    public Long getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(Long workoutId) {
        this.workoutId = workoutId;
    }

    public LocalDate getDateOfWorkout() {
        return dateOfWorkout;
    }

    public void setDateOfWorkout(LocalDate dateOfWorkout) {
        this.dateOfWorkout = dateOfWorkout;
    }

    public Set<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }
}
