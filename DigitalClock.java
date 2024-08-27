package yash;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame {

    private JLabel timeLabel;
    private SimpleDateFormat timeFormat;
    private Timer timer;

    public DigitalClock() {
        // Set up the frame
        setTitle("Digital Clock");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set the background color
        getContentPane().setBackground(Color.BLACK);

        // Create a JLabel to display the time
        timeLabel = new JLabel();
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setFont(new Font("Digital-7", Font.PLAIN, 50)); // Choose an appropriate font
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add the JLabel to the frame
        add(timeLabel);

        // Set up the time format
        timeFormat = new SimpleDateFormat("HH:mm:ss");

        // Create a Timer to update the time every second
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateClock();
            }
        });
        timer.start();
        
        // Initial call to set the time
        updateClock();
    }

    private void updateClock() {
        String timeString = timeFormat.format(new Date());
        timeLabel.setText(timeString);
    }

    public static void main(String[] args) {
        // Create and display the clock
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DigitalClock().setVisible(true);
            }
        });
    }
}
