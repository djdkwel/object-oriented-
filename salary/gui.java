 

import salary.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui {
    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gui window = new gui();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    private gui() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        frame.getContentPane().setForeground(new Color(51, 51, 51));
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(null);
        panel.setBackground(new Color(51, 51, 51));
        panel.setBounds(0, 88, 225, 370);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        //EMPLOYEE REPORT BUTTON
        JPanel employeeReport_button = new JPanel();
        employeeReport_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        employeeReport_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                employeeReport_button.setBackground(new Color(30, 30, 30));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                employeeReport_button.setBackground(new Color(0, 204, 204));
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                bi_weekly report = new bi_weekly();
                frame.dispose();
            }
        });
        employeeReport_button.setBackground(new Color(0, 204, 204));
        employeeReport_button.setLayout(null);
        employeeReport_button.setBounds(0, 207, 225, 53);
        panel.add(employeeReport_button);

        JLabel employeeReport = new JLabel("Employee Report");
        employeeReport.setForeground(new Color(255, 255, 255));
        employeeReport.setFont(new Font("Century Gothic", Font.BOLD, 18));
        employeeReport.setBounds(55, 11, 115, 32);
        employeeReport_button.add(employeeReport);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(null);
        panel_1.setBackground(new Color(51, 51, 51));
        panel_1.setBounds(0, 48, 856, 39);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("Remove Item");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Dubai Medium", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(238, 11, 123, 17);
        panel_1.add(lblNewLabel_2);


}

}
