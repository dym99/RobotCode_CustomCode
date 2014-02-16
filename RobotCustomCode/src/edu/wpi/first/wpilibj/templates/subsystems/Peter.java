/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author KBotics
 */
public class Peter extends Subsystem{

    private Timer timer;
    private final int delay = 2;
    
    public void init() {
        timer = new Timer();
        timer.start();
    }
    
    protected void initDefaultCommand() {
        
    }
    
    public void reload() {
        //RobotMap.peter.set(DoubleSolenoid.Value.kForward);
        //if (timer.get() >= delay) {
        //    RobotMap.peter.set(DoubleSolenoid.Value.kReverse);
        //}
        if (RobotMap.peter.get() == DoubleSolenoid.Value.kReverse) {
            RobotMap.peter.set(DoubleSolenoid.Value.kForward);
        } else {
            RobotMap.peter.set(DoubleSolenoid.Value.kReverse);
        }
    } 
    
}
