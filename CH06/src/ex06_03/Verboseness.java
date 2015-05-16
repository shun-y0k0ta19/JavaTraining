package ex06_03;

public class Verboseness implements Verbose{
	Verbosity level;
	
	@Override
	public void setVerbosity(Verbosity level) {
		this.level = level;
	}

	@Override
	public Verbosity getVerbosity() {
		return this.level;
	}
	

}
