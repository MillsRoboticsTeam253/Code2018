// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.Code2018;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.VictorSP;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	//MAking the speedController, sensors, and pneumatic objects
    public static TalonSRX driveTrainLeftBack;
    public static TalonSRX driveTrainLeftFront;
    public static TalonSRX driveTrainRightFront;
    public static TalonSRX driveTrainRightBack;
    public static SpeedController IntakeVictorSP1;
    public static SpeedController IntakeVictorSP2;
    public static DigitalInput sensorsPhotoelectricSensor;
    public static Ultrasonic sensorsUltrasonicSensor;
    public static DoubleSolenoid pneumaticsDoubleSolenoid1;
    public static DoubleSolenoid pneumaticsDoubleSolenoid2;
    public static Compressor pneumaticsCompressor1;
    public static Spark ElevatorSpark; 
    public static Spark ClimberSpark; 
    public static SpeedController elevatorTalon; 
    public static DigitalInput sensorsLimitSwitch1;
    public static DigitalInput sensorsLimitSwitch2; 

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	//the actuators are given the talonSRX 
        driveTrainLeftBack = new TalonSRX(0);
        
        driveTrainLeftFront = new TalonSRX(1);
        
        driveTrainRightFront = new TalonSRX(2);
        
        driveTrainRightBack = new TalonSRX(3);
        
        
        sensorsPhotoelectricSensor = new DigitalInput(0);
        LiveWindow.add(sensorsPhotoelectricSensor);
        
        sensorsUltrasonicSensor = new Ultrasonic(1, 2);
        LiveWindow.add(sensorsUltrasonicSensor);
        
        pneumaticsDoubleSolenoid1 = new DoubleSolenoid(0, 0, 1);
        LiveWindow.add(pneumaticsDoubleSolenoid1);
        
        pneumaticsDoubleSolenoid2 = new DoubleSolenoid(0, 2, 3);
        LiveWindow.add(pneumaticsDoubleSolenoid2);
        
        
        pneumaticsCompressor1 = new Compressor(0);
        //giving sparks which one it is
        elevatorSpark1 = new Spark(0); 
        LiveWindow.add(Spark1); 
        
        elevatorSpark2 = new Spark(1); 
        LiveWindow.add(Spark2); 
        
        elevatorTalon = new Talon(4);
        LiveWindow.add((Sendable) elevatorTalon); 
        
        sensorsLimitSwitch1 = new DigitalInput(0); 
        LiveWindow.add(sensorsLimitSwitch1); 
        
        sensorsLimitSwitch2 = new DigitalInput(1); 
        LiveWindow.add(sensorsLimitSwitch2); 

        IntakeVictorSP1 = new VictorSP(2);
        LiveWindow.add((VictorSP) IntakeVictorSP1);
        
        IntakeVictorSP2 = new VictorSP(3);
        LiveWindow.add((VictorSP) IntakeVictorSP2);
                

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
