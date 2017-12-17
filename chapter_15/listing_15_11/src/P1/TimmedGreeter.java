//listing 11
// Ссылка на метод экземпляра передается как аргумент функции.

package P1;

import javax.swing.*;
import java.awt.event.ActionEvent;

class Greeter {
    public void greet(ActionEvent actionEvent) {
        System.out.println("Hello! ");
    }
}

class TimedGreeter extends Greeter {
    public void greet() {
        Timer t = new Timer(1000, super::greet);    // Ссылка на метод экземпляра
        t.start();
    }

    public static void main(String args[]) {
        new TimedGreeter().greet();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/*
    super::greet
        равносильна
    (x) -> super.greet(x)
*/
