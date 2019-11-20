import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JFrame orderFrame = new JFrame("Order");
    private JFrame checkoutFrame = new JFrame("Check Out");
    Window() {
        super("Eddie's burgers");
        setLayout(new FlowLayout());
        setSize(new Dimension(700,900));
        setLocationRelativeTo(null);
        add(createButton("Add To Order", 150,40, OrderEvent));
        add(createButton("Check Out", 200,40, CheckOutEvent));
    }


    private JButton createButton(String name, int width, int height, ActionListener event) {
        JButton button = new JButton(name);
        button.setPreferredSize(new Dimension(width, height));
        button.addActionListener(event);
        return button;
    }

    private ActionListener OrderEvent = e -> {
        JTextArea textArea = new JTextArea();
        orderFrame.setSize(new Dimension(400,600));
        orderFrame.setLocationRelativeTo(null);
        orderFrame.setLayout(new FlowLayout());

        textArea.append("Hamburger\n");
        textArea.append("Fries");
        textArea.setEditable(false);
        orderFrame.add(textArea);

        orderFrame.setVisible(true);
    };

    private ActionListener CheckOutEvent = e -> {
        checkoutFrame.setSize(new Dimension(400,600));
        checkoutFrame.setLocationRelativeTo(null);
        checkoutFrame.setVisible(true);
    };


}
