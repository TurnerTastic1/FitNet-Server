package com.TCorp.FitNetServer.api.repository;

import com.TCorp.FitNetServer.api.model.CompletedWorkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * File: CompletedWorkouts
 * Author: turnernaef
 * Date: 11/10/23
 * Description:
 */

@Repository
public interface CompletedWorkoutRepository extends JpaRepository<CompletedWorkout, Long> {
    Optional<CompletedWorkoutRepository> findCompletedWorkoutById(Long id);
}
