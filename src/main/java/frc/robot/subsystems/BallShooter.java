/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
/**
 * Add your docs here.
 */
public class BallShooter extends Subsystem {
  private Spark shooterMotor;

  public BallShooter()
  {
    shooterMotor = new Spark(Robot.getMap().getCAN("wheel"));
  }

  // updates the speeds (based on inverted flywheels will determine direction)
	// expects positive input, invert rather than make negative
	private void setSpeed(double newSpeed) 
	{
		// if wrong input then
		if (newSpeed < 0)
			throw new IllegalArgumentException("Needs positive or 0 input. Negative input not allowed.");
		// set motor inputs
		shooterMotor.set(newSpeed);
  }
  
  public void Shoot()
  {
    setSpeed(1);
  }

  public void Stop()
	{
		setSpeed(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
