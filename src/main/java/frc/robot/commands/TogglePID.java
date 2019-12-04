/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TogglePID extends Command {
  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // currently enabled or disabled?
    boolean initial = Robot.getTilt().usingPid();
    // flips value and updates
    Robot.getTilt().setPidEnabled(!initial);
    Robot.getElevator().setPidEnabled(!initial);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }
}
