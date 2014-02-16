/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author KBotics
 */
public class Brakes extends Subsystem{
    
    protected void initDefaultCommand() {
        
    }
    
    public void switchBrakes() {
        if (RobotMap.leftBrake.get() == DoubleSolenoid.Value.kForward && RobotMap.rightBrake.get() == DoubleSolenoid.Value.kForward) {
            RobotMap.leftBrake.set(DoubleSolenoid.Value.kReverse);
            RobotMap.rightBrake.set(DoubleSolenoid.Value.kReverse);
        } else {
            RobotMap.leftBrake.set(DoubleSolenoid.Value.kForward);
            RobotMap.rightBrake.set(DoubleSolenoid.Value.kForward);
        }
    }
    
}
