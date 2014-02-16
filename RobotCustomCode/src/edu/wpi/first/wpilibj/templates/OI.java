
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.BrakeCommand;
import edu.wpi.first.wpilibj.templates.commands.FireFlippers;
import edu.wpi.first.wpilibj.templates.commands.FireLeftFlipper;
import edu.wpi.first.wpilibj.templates.commands.FireRightFlipper;
import edu.wpi.first.wpilibj.templates.commands.PeterCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    public XboxController driver;
    
    JoystickButton rightFlipperButton;
    JoystickButton leftFlipperButton;
    JoystickButton bothFlippersButton;
    JoystickButton enableBrakes;
    JoystickButton btnLB;
    JoystickButton reloadbtn;
    
    public OI() {
        driver = new XboxController(1);
        rightFlipperButton = new JoystickButton(driver.m_joy, driver.XBOX_X);
        leftFlipperButton = new JoystickButton(driver.m_joy, driver.XBOX_Y);
        bothFlippersButton = new JoystickButton(driver.m_joy, driver.XBOX_A);
        enableBrakes = new JoystickButton(driver.m_joy, driver.XBOX_B);
        btnLB = new JoystickButton(driver.m_joy, driver.XBOX_LB);
        reloadbtn = new JoystickButton(driver.m_joy, driver.XBOX_RB);
        
        reloadbtn.whenPressed(new PeterCommand());
        leftFlipperButton.whenPressed(new FireLeftFlipper());
        rightFlipperButton.whenPressed(new FireRightFlipper());
        bothFlippersButton.whenPressed(new FireFlippers());
        enableBrakes.whenPressed(new BrakeCommand());
    }
    
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

