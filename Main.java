package Gui_part;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

import Panels.ControllersPanel;
import Panels.EmergencyLogsPanel;
import Panels.FlightAssignmentsPanel;
import Panels.FlightsPanel;
import Panels.RunwaysPanel;
import Panels.WeatherPanel;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Airport Control Tower System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 600);
            frame.setLocationRelativeTo(null); // Ortala

            JTabbedPane tabs = new JTabbedPane();

            tabs.addTab("Flights", new FlightsPanel());
            tabs.addTab("Runways", new RunwaysPanel());
            tabs.addTab("Weather", new WeatherPanel());
            tabs.addTab("Emergency Logs", new EmergencyLogsPanel());
            tabs.addTab("Controllers", new ControllersPanel());
            tabs.addTab("Assignments", new FlightAssignmentsPanel());

            frame.add(tabs);
            frame.setVisible(true);
        });
    }
}