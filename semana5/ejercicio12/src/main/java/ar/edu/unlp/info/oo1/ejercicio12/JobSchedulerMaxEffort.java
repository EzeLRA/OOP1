package ar.edu.unlp.info.oo1.ejercicio12;

public class JobSchedulerMaxEffort extends JobScheduler {
	
	public JobSchedulerMaxEffort() {
		super();
	}
	
	protected JobDescription getNext() {
		return this.getJobs().stream().max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort())).orElse(null);
	}

}
