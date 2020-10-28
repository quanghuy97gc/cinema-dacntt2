package dacntt2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class TicketEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "seats")
	private String seats;
	
	@Column(name = "totalprice")
	private Long totalPrice;
	
	@ManyToOne
	@JoinColumn(name = "userid", nullable = false)
	private UserEntity user;
	
	@ManyToOne
	@JoinColumn(name = "screenid", nullable = false)
	private ScreenEntity screen;
	
}
