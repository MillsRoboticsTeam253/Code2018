//Justin and Fiona
// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.Code2018.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc253.Code2018.Robot;
import edu.wpi.first.wpilibj.XboxController;

/**
 *
 */
public class tankDrive extends Command {
	boolean changeStatus = true;
	boolean toggle = true;
	double kDeadzone = 0.125; //How far you have to push the joystick to get a response (0.125 = 1/8th of full)
		
    public tankDrive() {

    	//says we need drivetrain to do this command 
        requires(Robot.driveTrain);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	boolean isPressedTurnOn = Robot.oi.buttonBoard.getRawButton(3);
    	if(isPressedTurnOn && toggle){
    		toggle = false; //if statement that makes toggling system
    		changeStatus = !changeStatus;
    	}else if(!isPressedTurnOn){
    		toggle = true;
    	}
    	if(!changeStatus){
        	double leftSpeed = Robot.oi.getLeftJoystickY();
        	double rightSpeed = Robot.oi.getRightJoystickY();
        	Robot.driveTrain.drive(leftSpeed, rightSpeed);
        	// we are connecting the left joysticks to the left speedcontrollers
        	// we are connecting the right joysticks to the right speedcontrollers
        	// we are sending numbers to the speedcontrollers through the method
    	}else{
        	double left;
        	double right;
        	if(Math.abs(Robot.oi.getLeftJoystickY())<=kDeadzone){
        		left = Robot.oi.getRightJoystickX();
        		right = -Robot.oi.getRightJoystickX();
        	}else{
    		    left = Robot.oi.getLeftJoystickY()-Robot.oi.getLeftJoystickY()*Robot.oi.getRightJoystickX();
    		    right = Robot.oi.getLeftJoystickY()+Robot.oi.getLeftJoystickY()*Robot.oi.getRightJoystickX();
        	}
        	
        	Robot.driveTrain.drive(left, right);
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
