package src.main;
//               A
//              A A
//             A   A
//            A     A
//           A       A
//          A         A
//         A-----------A
//        A             A
//       A               A
//      A                 A
//     A                   A

import src.processor.Controller;
import src.processor.Model;
import src.util.Message;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        JFrame game = new JFrame();

        game.setTitle(Message.TITLE);
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(450, 500);
        game.setResizable(false);

        game.add(controller.getView());

        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}
