/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.FireLeftFlipper;

/**
 *
 * @author KBotics
 */
public class Flippers extends Subsystem{

    protected void initDefaultCommand() {
        
    }
    
    public void switchLeftFlipper() {
        if (RobotMap.leftFlipper.get() == DoubleSolenoid.Value.kReverse) {
            RobotMap.leftFlipper.set(DoubleSolenoid.Value.kForward);
        } else {
            RobotMap.leftFlipper.set(DoubleSolenoid.Value.kReverse);
        }
    }
    
    
    public void switchRightFlipper() {
        if (RobotMap.rightFlipper.get() == DoubleSolenoid.Value.kReverse) {
            RobotMap.rightFlipper.set(DoubleSolenoid.Value.kForward);
        } else {
            RobotMap.rightFlipper.set(DoubleSolenoid.Value.kReverse);
        }
    }
    
    
    public void switchDualFlippers() {
        if (RobotMap.rightFlipper.get() == DoubleSolenoid.Value.kReverse && RobotMap.leftFlipper.get() == DoubleSolenoid.Value.kReverse) {
            RobotMap.rightFlipper.set(DoubleSolenoid.Value.kForward);
            RobotMap.leftFlipper.set(DoubleSolenoid.Value.kForward);
        } else {
            RobotMap.rightFlipper.set(DoubleSolenoid.Value.kReverse);
            RobotMap.leftFlipper.set(DoubleSolenoid.Value.kReverse);
        }
    }
}
