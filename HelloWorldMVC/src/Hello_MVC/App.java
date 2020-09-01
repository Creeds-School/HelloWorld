package Hello_MVC;

public class App {
    public static void main(String[] arigs) {
        Model model = new Model("Dercio", "Hoffmann");
        View view = new View("First Push");
        Controller controller = new Controller(model, view);
        controller.InitializeController();
    }
}