/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author KBotics
 */
public class FireLeftFlipper extends Command{

    public FireLeftFlipper() {
        requires(CommandBase.flippers);
    }
    
    protected void initialize() {
        
    }

    protected void execute() {
        CommandBase.flippers.switchLeftFlipper();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
        
    }

    protected void interrupted() {
        end();
    }
    
}
