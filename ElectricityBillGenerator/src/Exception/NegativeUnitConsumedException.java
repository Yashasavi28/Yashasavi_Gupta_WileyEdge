package Exception;

public class NegativeUnitConsumedException {
	private String message;

	public NegativeUnitConsumedException() {
		super();
		this.message = "Consumed Unit Cannot be negative";
	}

	@Override
	public String toString() {
		return "NegativeUnitConsumedException [message=" + message + "]";
	}
	
	
}

