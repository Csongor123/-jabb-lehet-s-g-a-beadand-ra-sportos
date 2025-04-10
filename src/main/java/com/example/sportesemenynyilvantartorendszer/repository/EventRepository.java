package com.example.sportesemenynyilvantartorendszer.repository;

import com.example.sportesemenynyilvantartorendszer.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByEventDateAfter(LocalDateTime dateTime);

    List<Event> findByRegistrationDeadlineAfter(LocalDateTime dateTime);

    List<Event> findByLocation(String location);

    List<Event> findByRegistrationDeadlineBetween(LocalDateTime start, LocalDateTime end);
}
