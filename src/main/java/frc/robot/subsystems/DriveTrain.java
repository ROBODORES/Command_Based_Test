/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANEncoder;
import frc.robot.RobotMap;
import frc.robot.commands.Drive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  public CANSparkMax left, leftFollower, right, rightFollower;
  public CANEncoder leftCanEncoder, rightCanEncoder;
  public DifferentialDrive chassis;

  //Default Constructor
  public DriveTrain() {

  }

  public void newTankDrive() {
    left = new CANSparkMax(RobotMap.leftMotor, MotorType.kBrushless);
    leftFollower = new CANSparkMax(RobotMap.leftMotorFollower, MotorType.kBrushless);
    right = new CANSparkMax(RobotMap.rightMotor, MotorType.kBrushless);
    rightFollower = new CANSparkMax(RobotMap.rightMotorFollower, MotorType.kBrushless);

    leftCanEncoder = new CANEncoder(left);
    rightCanEncoder = new CANEncoder(right);

    chassis = new DifferentialDrive(left, right);
  }

  public void differentialDrive(double leftSpeed, double rightSpeed) {
    chassis.tankDrive(leftSpeed*0.8, rightSpeed*0.8, false);
  }
  
  public void arcadeDrive(double throttle, double yaw) {
    chassis.arcadeDrive(throttle*0.8, yaw*0.8, false);
  }

  public void stop() {
    differentialDrive(0, 0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new Drive());
  }
}
