import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JFrame orderFrame = new JFrame("Order");
    private JFrame checkoutFrame = new JFrame("Check Out");
    private JLabel label = new JLabel();
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

    private ActionListener addBurger = e -> {
        MenuItem item = new Hamburger();

        item.addTopping("Ketchup");
        item.addTopping("Tomato");
        item.removeTopping("Ketchup");
        item.sumOfNutrients();
        label.setText(item.toString());
        System.out.println(item.toString());
    };

    private ActionListener OrderEvent = e -> {
        orderFrame.setSize(new Dimension(400,600));
        orderFrame.setLocationRelativeTo(null);
        orderFrame.setLayout(new FlowLayout());
        orderFrame.setVisible(true);
        orderFrame.add(createButton("Hamburger",100,40, addBurger));
        orderFrame.add(label);

    };

    private ActionListener CheckOutEvent = e -> {
        checkoutFrame.setSize(new Dimension(400,600));
        checkoutFrame.setLocationRelativeTo(null);
        checkoutFrame.setVisible(true);
    };





}
