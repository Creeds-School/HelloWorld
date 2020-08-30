import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TestGui {
    public static void main(String[] args) {
        CreateWindow();
    }

    private static void CreateWindow() {
        JFrame frame = new JFrame("Notes");
        CreateGui(frame);
        frame.setSize(420,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void CreateGui(JFrame frame) {
        JPanel panel = new JPanel();
        LayoutManager layoutManager = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
        panel.setLayout(layoutManager);

        JTextArea noteTextArea = new JTextArea();
        JButton saveBtn = new JButton("Save");
        panel.add(noteTextArea);
        panel.add(saveBtn);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }
}