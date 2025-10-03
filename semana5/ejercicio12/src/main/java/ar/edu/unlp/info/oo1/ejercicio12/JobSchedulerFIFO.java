package ar.edu.unlp.info.oo1.ejercicio12;

public class JobSchedulerFIFO extends JobScheduler{
	
	public JobSchedulerFIFO() {
		super();
	}
	
	protected JobDescription getNext() {
		return this.getJobs().get(0);
	}
	
}
