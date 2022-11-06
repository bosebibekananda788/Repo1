package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Tour;

public interface TourRepository extends JpaRepository<Tour, Integer> {

}
