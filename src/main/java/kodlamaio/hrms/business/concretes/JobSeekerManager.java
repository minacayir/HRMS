package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;


public class JobSeekerManager implements JobSeekerService{

	
   private JobSeekerDao jobseekerDao;
	
	 @Autowired
	public JobSeekerManager(JobSeekerDao jobseekerDao) {
		super();
		this.jobseekerDao = jobseekerDao;
	}
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobseekerDao.findAll());
	}
	
	
	@Override
	public Result add(JobSeeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
      return new SuccessResult("İş arayan eklendi.");

}
	
	
}
