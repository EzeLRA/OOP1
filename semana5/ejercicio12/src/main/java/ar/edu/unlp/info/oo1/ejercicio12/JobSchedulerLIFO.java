package ar.edu.unlp.info.oo1.ejercicio12;

public class JobSchedulerLIFO extends JobScheduler{
	
	public JobSchedulerLIFO() {
		super();
	}
	
	protected JobDescription getNext() {
		return this.getJobs().get(this.jobs.size()-1);
	}
	
}
