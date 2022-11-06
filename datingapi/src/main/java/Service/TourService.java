package Service;

import org.springframework.beans.factory.annotation.Autowired;

import domain.Difficulty;
import domain.Region;
import domain.Tour;
import domain.TourPackage;
import repo.TourPackageRepository;
import repo.TourRepository;

public class TourService {

	@Autowired
	private TourPackageRepository tourPackageRepository;
	
	@Autowired
	private TourRepository tourRepository;
	
	public Tour createTour(String title, String description , String blurb, Integer price,String duration , String bullets,String keywords,String tourPackageName,Difficulty difficulty,Region region) 
	
	{
		TourPackage tourPackage =tourPackageRepository.findById(tourPackageName).orElseThrow();
		
		return  tourRepository.save(new Tour(title, description, blurb,price,duration,bullets,keywords,region,difficulty,tourPackage));
	
		
		
		
	}
	
	
	public long total ()
	{
		return tourRepository.count();
	}
	
	
}
