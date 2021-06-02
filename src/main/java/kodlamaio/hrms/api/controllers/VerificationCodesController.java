package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import kodlamaio.hrms.business.abstracts.VerificationCodeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.entities.concretes.VerificationCode;

public class VerificationCodesController {
	
private VerificationCodeService verificationCodeService; 
	
	@Autowired
	public VerificationCodesController(VerificationCodeService verificationCodeService) {
		super();
		this.verificationCodeService = verificationCodeService;
	}

	@GetMapping("/getall")
	public DataResult<List<VerificationCode>> getAll(){
	return this.verificationCodeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody VerificationCode verificationCode) {
		return this.verificationCodeService.add(verificationCode);

}

}
