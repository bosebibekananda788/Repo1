package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tour {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column (length=2000)
	private String title;
	
	@Column (length=2000)
	private String description;
	
	@Column (length=2000)
	private String blurb;
	
	@Column
	private Integer price;
	
	@Column
	private String duration;
	@Column
	private String bullets;
	@Column
	private String keywords;
	
	@Enumerated
	@Column
	private Region region;
	
	@Enumerated
	@Column
	private Difficulty difficulty;
	
	@ManyToOne
	private TourPackage tourPackage;

	public Tour(String title, String description, String blurb, Integer price, String duration, String bullets,
			String keywords, Region region, Difficulty difficulty, TourPackage tourPackage) {
		super();
		this.title = title;
		this.description = description;
		this.blurb = blurb;
		this.price = price;
		this.duration = duration;
		this.bullets = bullets;
		this.keywords = keywords;
		this.region = region;
		this.difficulty = difficulty;
		this.tourPackage = tourPackage;
	}
	
	
}
