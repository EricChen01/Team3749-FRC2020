/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ActivateShoot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  private XboxController ctrl;
  private JoystickButton button;

  public OI ()
  {
    ctrl = new XboxController(0);
    button = new JoystickButton(ctrl, 6); //6 represents right bumper

    if(Robot.getMap().getSys("shooter") != 0)
    {
      // left bumper - toggle the intake
      button.toggleWhenPressed(new ActivateShoot());
    }
  }

  public JoystickButton getOpJoystickButton()
  {
    return button;
  }
}
