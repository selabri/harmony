package fr.labri.harmony.core.config.model;

public class SchedulerConfiguration {
	private int numberOfThreads=1;
	
	// Global timeout in secint
	private int globalTimeOut=108;
	
	public SchedulerConfiguration(){};
	
	public SchedulerConfiguration(int numberOfThreads, int globalTimeOut) {
		this(numberOfThreads);
		this.globalTimeOut = globalTimeOut;
	}
	
	public SchedulerConfiguration(int numberOfThreads) {
		super();
		
		if(numberOfThreads>0){
			this.numberOfThreads = numberOfThreads;
		}
		else{
			// A negative or null number of threads was requested, the value was left to default (1 thread)
		}
	}

	public int getNumberOfThreads() {
		return numberOfThreads;
	}

	public void setNumberOfThreads(int numberOfThreads) {
		this.numberOfThreads = numberOfThreads;
	}

	public int getGlobalTimeOut() {
		return globalTimeOut;
	}

	public void setGlobalTimeOut(int globalTimeOut) {
		this.globalTimeOut = globalTimeOut;
	}
	
	
	
//	

}