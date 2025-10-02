package ar.edu.unlp.info.oo1.ejercicio12;

public class JobSchedulerFIFO extends JobScheduler{
	
	public JobSchedulerFIFO() {
		super();
	}
	
	public JobDescription next() {
		if (!this.jobs.isEmpty()){
			return super.next(0);
		}
		return null;
	}
	
}
