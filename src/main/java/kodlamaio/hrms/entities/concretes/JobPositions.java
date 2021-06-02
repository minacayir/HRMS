package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="job_position")
public class JobPositions {
	
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name="job_positon_title")
	private String jobPositionTitle;
	
	
	
	
	
	
	
	public JobPositions() {
		
	}
	
	
	
	public JobPositions(int id, String jobPositionTitle) {
		super();
		this.id = id;
		this.jobPositionTitle = jobPositionTitle;
	}

}
