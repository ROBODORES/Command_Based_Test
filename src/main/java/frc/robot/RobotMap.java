/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //Joystick Ports

  public static int leftStickPort = 0;
  public static int rightStickPort = 1;
  public static int sideStickPort = 2;

  //Drive Config

  public static int leftMotor = 0;
  public static int leftMotorFollower = 1;
  public static int rightMotor = 2;
  public static int rightMotorFollower = 3;

}
