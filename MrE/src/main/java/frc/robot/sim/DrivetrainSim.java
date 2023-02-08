// package frc.robot.sim;

// import com.ctre.phoenix.motorcontrol.TalonSRXSimCollection;
// import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
// import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

// import edu.wpi.first.math.numbers.N2;
// import edu.wpi.first.math.system.LinearSystem;
// import edu.wpi.first.math.system.plant.DCMotor;
// import edu.wpi.first.math.system.plant.LinearSystemId;
// import edu.wpi.first.math.util.Units;
// import edu.wpi.first.wpilibj.simulation.DifferentialDrivetrainSim;
// import edu.wpi.first.wpilibj.simulation.XboxControllerSim;
// import edu.wpi.first.wpilibj.simulation.SimDeviceSim;

// import frc.robot.subsystems.DriveTrain;
// import frc.robot.RobotContainer;

// public class DrivetrainSim extends DriveTrain {


//  private DifferentialDrivetrainSim m_drivetrainSim;
//  private SimDeviceSim gyroSim;
//  private TalonSRXSimCollection m_leftDriveSim = DriveTrain.m_driveLeftLeader.getSimCollection();
//  private TalonSRXSimCollection m_rightDriveSim = m_driveRightLeader.getSimCollection();
//  private boolean simInitalize = false;
//  private SimDouble m_simYawGyro;
//  private SimDouble m_simPitchGyro;
//  private SimDouble m_simRollGryo;

//  private void initalizeSim() {
//     m_drivetrainSim = new DifferentialDrivetrainSim(
//         DCMotor.getCIM(2), Constants.gearRatio, Constants.jKgMetersSquared, Units.lbsToKilograms(Constants.massPounds), Units.inchesToMeters(Constants.wheelDiameterInches / 2), Units.inchesToMeters(Constants.trackWidthInches), null);
    
//     gyroSim = new SimDeviceSim("navX-Sensor[0]");
//     m_simYawGyro = gyroSim.getDouble("Yaw");
//     m_simYawGyro = gyroSim.getDouble("Pitch");
//     m_simYawGyro = gyroSim.getDouble("Roll");

//     Field2d m_field = new Field2d();
// }

// /**
//    * Sets the angle in degrees (clockwise positive).
//    *
//    * @param angleDegrees The angle.
//    */
//   public void setAngle(double yaw) {
//     m_simYawGyro.set(yaw);
//   }

//   /**
//    * Sets the angular rate in degrees per second (clockwise positive).
//    *
//    * @param rateDegreesPerSecond The angular rate.
//    */
//   public void setRate(double rateDegreesPerSecond) {
//     m_simRate.set(rateDegreesPerSecond);
//   }

// @Override
// public void simulationPeriodic() {
//     if (!simInitalize) {
//         initalizeSim();
//         simInitalize = true;
//     }
//     m_drivetrainSim.setInputs(m_driveGain, m_deadband);
// }
    
// }
