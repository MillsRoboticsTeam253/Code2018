// Cazathia and Justin
// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.Code2018.subsystems;

import org.usfirst.frc253.Code2018.RobotMap;
import org.usfirst.frc253.Code2018.commands.*;
import org.usfirst.frc253.Code2018.profiles.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;


import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
	private double kP = 1;//0.540
	private double kI = 0;//0.00052
	private double kD = 0;//5
	private double kF = 15;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	//getting the objects from robotMap
    private final TalonSRX leftBack = RobotMap.driveTrainLeftBack;
    private final TalonSRX leftFront = RobotMap.driveTrainLeftFront;
    private final TalonSRX rightFront = RobotMap.driveTrainRightFront;
    private final TalonSRX rightBack = RobotMap.driveTrainRightBack;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public DriveTrain(){
    	leftFront.follow(leftBack);
    	rightBack.follow(rightFront);
    	
    	leftFront.setInverted(true);
    	rightFront.setInverted(false);
    	leftBack.setInverted(true);
    	rightBack.setInverted(false);
    	
    	leftBack.setStatusFramePeriod(StatusFrameEnhanced.Status_3_Quadrature, 1, 10); 
		leftBack.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 10);
		
		rightFront.setStatusFramePeriod(StatusFrameEnhanced.Status_3_Quadrature, 1, 10); 
		rightFront.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 10);
		
		leftFront.setStatusFramePeriod(StatusFrameEnhanced.Status_3_Quadrature, 1, 10); 
		leftFront.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		
		leftBack.setSensorPhase(false);
		rightFront.setSensorPhase(false);
		leftFront.setSensorPhase(false);
		
		leftBack.configNeutralDeadband(Constants.kNeutralDeadband, Constants.kTimeoutMs);
    	rightFront.configNeutralDeadband(Constants.kNeutralDeadband, Constants.kTimeoutMs);
//35074964382
		leftBack.config_kF(0, kF, Constants.kTimeoutMs); //0.17911656
		leftBack.config_kP(0, kP, Constants.kTimeoutMs);
		leftBack.config_kI(0, kI, Constants.kTimeoutMs);
		leftBack.config_kD(0, kD, Constants.kTimeoutMs);

		rightFront.config_kF(0, kF, Constants.kTimeoutMs); //0.17808755
		rightFront.config_kP(0, kP, Constants.kTimeoutMs);
		rightFront.config_kI(0, kI, Constants.kTimeoutMs);
		rightFront.config_kD(0, kD, Constants.kTimeoutMs);

		/* Our profile uses 10ms timing */
		leftBack.configMotionProfileTrajectoryPeriod(10, Constants.kTimeoutMs); 
		rightFront.configMotionProfileTrajectoryPeriod(10, Constants.kTimeoutMs); 
		/*
		 * status 10 provides the trajectory target for motion profile AND
		 * motion magic
		 */

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	//default command for this subsystem
        setDefaultCommand(new tankDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    //giving the speed controllers values
    public void drive(double leftspeed, double rightspeed){// We are setting the speed controllers to speed
    	leftBack.set(ControlMode.PercentOutput, -leftspeed);//the leftfront and back are multiplied by -1 because the values are reversed 
    	
    	rightFront.set(ControlMode.PercentOutput, -rightspeed);
    }
    public TalonSRX getLeftBack(){
    	return leftBack;
    }
    public TalonSRX getRightBack(){
    	return rightBack;
    }
    public TalonSRX getRightFront(){
    	return rightFront;
    }
    public TalonSRX getLeftFront(){
    	return leftFront;
    }
    public void changekP(double delta){
    	kP += delta;
    	
    	leftBack.config_kP(0, kP, Constants.kTimeoutMs);
    	rightFront.config_kP(0, kP, Constants.kTimeoutMs);
    }
    public void changekI(double delta){
    	kI += delta;
    
    	leftBack.config_kI(0, kI, Constants.kTimeoutMs);
    	rightFront.config_kI(0, kI, Constants.kTimeoutMs);
    }
    
    public void changekD(double delta){
    	kD += delta;
    	
    	leftBack.config_kD(0, kD, Constants.kTimeoutMs);
    	rightFront.config_kD(0, kD, Constants.kTimeoutMs);
    }
    
    public void changekF(double delta){
    	kF += delta;
    	
    	leftBack.config_kF(0, kF, Constants.kTimeoutMs);
    	rightFront.config_kF(0,  kF, Constants.kTimeoutMs);
    }
    
    public double getkP(){
    	return kP;
    }
    
    public double getkI(){
    	return kI;
    }
    
    public double getkD(){
    	return kD;
    }
    
    public double getkF(){
    	return kF;
    }
}

