package ar.edu.unlp.info.oo1.ejercicio12;

public class JobSchedulerMaxPriority extends JobScheduler{
	
	public JobSchedulerMaxPriority() {
		super();
	}
	
	protected JobDescription getNext() {
		return this.getJobs().stream().max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority())).orElse(null);
	}
	
}
