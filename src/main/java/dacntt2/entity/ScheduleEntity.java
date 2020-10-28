package dacntt2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class ScheduleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "showtime")
	private String showtime;
	
	@ManyToOne
	@JoinColumn(name = "movieid", nullable = false)
	private MovieEntity movie;
	
	@ManyToOne
	@JoinColumn(name = "theaterid", nullable = false)
	private TheaterEntity theater;
	
	@OneToMany(mappedBy = "schedule")
	private List<ScreenEntity> ListScreen = new ArrayList<ScreenEntity>();
}
