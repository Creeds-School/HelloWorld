package Hello_MVC;

import javax.swing.JOptionPane;

public class Controller {
    
    private Model model;
    private View view;

    public Controller(Model _model, View _view) {
        model = _model;
        view = _view;

        InitializeView();
    }

    public void InitializeView() {
        view.getFirstNameTextField().setText(model.getFirstName());
        view.getLastNameTextField().setText(model.getLastName());
    }

    public void InitializeController() {
        view.getFirstNameSaveButton().addActionListener(e -> SaveFirstName());
        view.getLastNameSaveButton().addActionListener(e -> SaveLastName());
        view.getHelloButton().addActionListener(e -> SayHello());
        view.getByButton().addActionListener(e -> SayBye());
    }

    private void SaveFirstName() {
        model.setFirstName(view.getFirstNameTextField().getText());
        JOptionPane.showMessageDialog(null, "Firstname saved : " + model.getFirstName(), "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void SaveLastName() {
        model.setLastName(view.getLastNameTextField().getText());
        JOptionPane.showMessageDialog(null, "Lastname saved : " + model.getLastName(), "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void SayHello() {
        JOptionPane.showMessageDialog(null, "Hello " + model.getFirstName() + " " + model.getLastName(), "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void SayBye() {
        System.exit(0);
    }
}