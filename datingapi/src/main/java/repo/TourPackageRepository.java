package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.TourPackage;

public interface TourPackageRepository extends JpaRepository<TourPackage, String> {

}
