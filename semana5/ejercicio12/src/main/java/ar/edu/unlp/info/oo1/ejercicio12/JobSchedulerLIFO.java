package ar.edu.unlp.info.oo1.ejercicio12;

public class JobSchedulerLIFO extends JobScheduler{
	
	public JobSchedulerLIFO() {
		super();
	}
	
	public JobDescription next() {
		if (!this.jobs.isEmpty()){
			return super.next(this.jobs.size()-1);
		}
		return null;
	}
}
