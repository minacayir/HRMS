package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.VerificationCodeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.VerificationCodeDao;

import kodlamaio.hrms.entities.concretes.VerificationCode;

public class VerificationCodeManager implements VerificationCodeService{

	
	private VerificationCodeDao verificationCodeDao;
	
	
	@Autowired
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}
	@Override
	public DataResult<List<VerificationCode>> getAll() {
		return new SuccessDataResult<List<VerificationCode>>(this.verificationCodeDao.findAll());
	}
	
	
	
	@Override
	public Result add(VerificationCode code) {
		this.verificationCodeDao.save(code);
		return new SuccessResult("Code has been saved.");
}
}
