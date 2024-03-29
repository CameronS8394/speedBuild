// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public class Constants {
    public static final class DriveConstants {
        public static final int kLeftMotorFrontPort = 0;
        public static final int kLeftMotorBackPort = 1;
        public static final int kRightMotorFrontPort = 2;
        public static final int kRightMotorBackPort = 3;

        public static final double kAutonomousLeftDriveSpeed = .68;
        public static final double kAutonomousRightDriveSpeed = .65;

        public static final double kLeftSpeedFactor = .68;
        public static final double kRightSpeedFactor = .65;

        public static final double kSprintLeftSpeedFactor = 1.45;
        public static final double kSprintRightSpeedFactor = 1.45;

        public static final double kOffBalence = 5;

      //left drives at 93.023256% the speed of the right
    }
}
