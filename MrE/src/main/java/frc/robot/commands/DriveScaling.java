package frc.robot.commands;

/**
 * This enumeration represents the different options available for drive scaling.
 * 
 * @author Adam T Poole
 * @author Bridget Brenner
 *
 */
public enum DriveScaling {
	
	CUBIC("Cubic"),
	QUADRATIC("Linear"),
	SQUARED("Squared"),
	LIMITED_POLYNOMIC("Limited Polynomic");

	/** Human readable text that can be displayed to an end user. */
	private String displayText;
	
	/**
	 * Constructor for the {@link DriveScaling} enumeration.
	 * 
	 * @param displayText - The human readable text to be displayed to an end user.
	 */
	private DriveScaling(String displayText) {
		this.displayText = displayText;
	}
	
	/**
	 * @return The enumeration text that is properly formated for the end user.
	 */
	public String getDisplayText() {
		return displayText;
	}
}
