package Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.TourPackage;
import repo.TourPackageRepository;

@Service
public class TourPackageService {

	@Autowired
	private TourPackageRepository tourPackageRepository;
	
    public TourPackage  CreateTourPackage (String code , String name)
    {
    	//return tourPackageRepository.findById(code).orElse(tourPackageRepository.save(new TourPackage(code,name)));
    	
    	return tourPackageRepository.save(new TourPackage(code,name));
    }
    
    
    public Iterable<TourPackage> lookup() {
    	return tourPackageRepository.findAll();
    }
    
    
    public long total() {
    	return tourPackageRepository.count();
    }
    
}
