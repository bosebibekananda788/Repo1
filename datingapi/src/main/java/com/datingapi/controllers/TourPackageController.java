package com.datingapi.controllers;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import Service.TourPackageService;
import Service.TourService;

import domain.Tour;
import domain.TourPackage;

@RestController
@RequestMapping("/api/")
public class TourPackageController {
	
	
	private TourPackageService tourPackageService=new TourPackageService();
	

	private TourService tourService = new TourService();
	

	
	
	@PostMapping("/create/TourPackage")
	public TourPackage saveTourPackage(@RequestBody TourPackage tourPackage)
	{
	  return	tourPackageService.CreateTourPackage(tourPackage.getCode(),tourPackage.getName());
	}
	
	
	
	@PostMapping("/create/Tours")
	public Tour saveTour(@RequestBody Tour tour)
	{
	  return	tourService.createTour(tour.getTitle(), tour.getDescription(), tour.getBlurb(), tour.getPrice(), tour.getDuration(),
			  tour.getBullets(), tour.getKeywords(), tour.getTourPackage().getName(), tour.getDifficulty(), tour.getRegion());
			  
	
	}

}
