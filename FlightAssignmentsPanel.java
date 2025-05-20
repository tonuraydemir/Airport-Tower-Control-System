package Panels;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import DAO.FlightAssignmentDAO;
import model.FlightAssignment;

public class FlightAssignmentsPanel extends JPanel {
    JTable table;
    DefaultTableModel model;

    public FlightAssignmentsPanel() {
        setLayout(new BorderLayout());
        model = new DefaultTableModel();
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        model.addColumn("Flight ID");
        model.addColumn("Controller ID");
        model.addColumn("Assignment Time");

        FlightAssignmentDAO dao = new FlightAssignmentDAO();
        List<FlightAssignment> assignments = dao.getAllAssignments();

        for (FlightAssignment a : assignments) {
            model.addRow(new Object[]{
                    a.getFlightId(),
                    a.getControllerId(),
                    a.getAssignmentTime()
            });
        }
    }
}