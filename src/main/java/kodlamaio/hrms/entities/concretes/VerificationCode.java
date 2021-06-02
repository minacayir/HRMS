package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="verification_codes")
public class VerificationCode {

	@Column(name="code")
	private String code;

	@Column(name="user_id")
	private int userId;
	
	@Column(name="confirm")
	private boolean confirm;
	
	
	

}
