package ar.edu.unlp.info.oo1.ejercicio12;

public class JobSchedulerMaxEffort extends JobScheduler {
	
	public JobSchedulerMaxEffort() {
		super();
	}
	
	public JobDescription next() {
		if (!this.jobs.isEmpty()){
			JobDescription job = this.jobs.stream().max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort())).orElse(null);
			this.unschedule(job);
			return job;
		}
		return null;
	}
}
