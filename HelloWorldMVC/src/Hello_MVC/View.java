package Hello_MVC;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;

public class View {
    
    private JFrame frame;

    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;

    private JButton firstNameSaveButton;
    private JButton lastNameSaveButton;

    private JButton messageButton;
    private JButton exitButton;

    public View(String title) {
        
        // Frame
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,180);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Init Gui
        firstNameLabel = new JLabel("Firstname :");
        firstNameTextField = new JTextField();
        firstNameSaveButton = new JButton("Save Firstname");

        lastNameLabel = new JLabel("Lastname :");
        lastNameTextField = new JTextField();
        lastNameSaveButton = new JButton("Save Lastname");

        messageButton = new JButton("Hello!");
        exitButton = new JButton("Bye!");

        // Set Gui
        GroupLayout layout = new GroupLayout(frame.getContentPane());

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(firstNameLabel)
                .addComponent(lastNameLabel))

            .addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(firstNameTextField)
                .addComponent(lastNameTextField))

            .addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(firstNameSaveButton)
                .addComponent(lastNameSaveButton))
            
            .addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(messageButton)
                .addComponent(exitButton)));
        
        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(firstNameLabel)
                .addComponent(firstNameTextField).addComponent(firstNameSaveButton).addComponent(messageButton))
            .addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(lastNameLabel)
                .addComponent(lastNameTextField).addComponent(lastNameSaveButton).addComponent(exitButton)));

        layout.linkSize(SwingConstants.HORIZONTAL, firstNameSaveButton, lastNameSaveButton);
        layout.linkSize(SwingConstants.HORIZONTAL, messageButton, exitButton);

        frame.getContentPane().setLayout(layout);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }


    public JLabel getFirstNameLabel() {
        return firstNameLabel;
    }

    public void setFirstNameLabel(JLabel firstNameLabel) {
        this.firstNameLabel = firstNameLabel;
    }

    public JTextField getFirstNameTextField() {
        return firstNameTextField;
    }

    public void setFirstNameTextField(JTextField firstNameTextField) {
        this.firstNameTextField = firstNameTextField;
    }

    public JButton getFirstNameSaveButton() {
        return firstNameSaveButton;
    }
       
    public void setFirstNameSaveButton(JButton firstNameSaveButton) {
        this.firstNameSaveButton = firstNameSaveButton;
    }


    public JLabel getLastNameLabel() {
        return lastNameLabel;
    }

    public void setLastNameLabel(JLabel lastNameLabel) {
        this.lastNameLabel = lastNameLabel;
    }

    public JTextField getLastNameTextField() {
        return lastNameTextField;
    }

    public void setLastNameTextField(JTextField lastNameTextField) {
        this.lastNameTextField = lastNameTextField;
    }
    
    public JButton getLastNameSaveButton() {
        return lastNameSaveButton;
    }
       
    public void setLastNameSaveButton(JButton lastNameSaveButton) {
        this.lastNameSaveButton = lastNameSaveButton;
    }
       

    public JButton getHelloButton() {
        return messageButton;
    }
       
    public void setHelloButton(JButton helloButton) {
        this.messageButton = helloButton;
    }
       

    public JButton getByButton() {
        return exitButton;
    }
       
    public void setByeButton(JButton byeButton) {
        this.exitButton = byeButton;
    }
       
}