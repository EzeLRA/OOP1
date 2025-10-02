package ar.edu.unlp.info.oo1.ejercicio12;

public class JobSchedulerMaxPriority extends JobScheduler{
	
	public JobSchedulerMaxPriority() {
		super();
	}
	
	public JobDescription next() {
		if (!this.jobs.isEmpty()){
			JobDescription job = this.jobs.stream().max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority())).orElse(null);
			this.unschedule(job);
			return job;
		}
		return null;
	}
}
