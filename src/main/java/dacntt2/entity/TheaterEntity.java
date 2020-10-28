package dacntt2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "theater")
public class TheaterEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "code")
	private String code;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "image")
	private String image;
	
	@OneToMany(mappedBy = "theater")
	private List<ScheduleEntity> listSchedule = new ArrayList<ScheduleEntity>();
}
