import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame {
    private JFrame orderFrame = new JFrame("Order");
    private JFrame checkoutFrame = new JFrame("Check Out");

    private List<MenuItem> purchased = new ArrayList<>();

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


    private ActionListener addIngredient = e -> {

    };

    private ActionListener removeIngredient = e -> {

    };


    private ActionListener addBurger = e -> {
        purchased.add(new Hamburger());
        purchased.get(0).sumOfNutrients();

        JLabel label = new JLabel("<html>" + purchased.get(0).toString() + "</html>");
        orderFrame.add(label);
        orderFrame.add(createButton("Add Topping", 150,40, addIngredient));
        orderFrame.add(createButton("Remove Topping", 150, 40, removeIngredient));
        orderFrame.setLocationRelativeTo(null);
        orderFrame.setSize(400,400);
        orderFrame.setVisible(true);
    };

    private ActionListener OrderEvent = e -> {
        orderFrame.setSize(new Dimension(400,600));
        orderFrame.setLocationRelativeTo(null);
        orderFrame.setLayout(new FlowLayout());
        orderFrame.add(createButton("Hamburger",100,40, addBurger));

        orderFrame.setVisible(true);
        orderFrame.repaint();
    };

    private ActionListener CheckOutEvent = e -> {
        checkoutFrame.setSize(new Dimension(400,600));
        checkoutFrame.setLocationRelativeTo(null);

        String priceString = "";
        double total = 0;
        if(!purchased.isEmpty()) {
            for(MenuItem item : purchased)
                total += item.getPrice();
            priceString = String.format("Total price is: $%.2f", total);
        }
        JLabel label = new JLabel(priceString);
        checkoutFrame.add(label);
        checkoutFrame.setVisible(true);
    };



}
