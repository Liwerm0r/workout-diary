package pl.ostrowidzki.workoutdiary.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private List<Exercise> exercises = new ArrayList<>();

    public Workout() {

    }

    public Workout(LocalDate dateOfWorkout, List<Exercise> exercises) {
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

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }
}
