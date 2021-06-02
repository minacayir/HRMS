package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@PrimaryKeyJoinColumn(name = "user_id")

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seekers")
public class JobSeeker extends User{
	
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="national_id")
	private String nationalId;
	
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	

}
