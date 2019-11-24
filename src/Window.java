import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame {
    private JFrame orderFrame = new JFrame("Choose your toppings");			//Create new object of JFrame type with text Order
    private JFrame checkoutFrame = new JFrame("Check Out");		//create new object of JFrame type with text Check Out

    private JPanel nutritionPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();

    private JLabel label =new JLabel();
    private JLabel checkoutLabel = new JLabel();

    private List<MenuItem> purchased = new ArrayList<>();		//Create list for items in cart
    private int purchasedAmount = -1;
    private boolean addedFlag = true;

    Window() {													//Default constructor for Window
        super("Eddie's burgers and more");								//Window title Eddies Burgers
        setLayout(new FlowLayout());							//set layout
        setSize(new Dimension(700,900));						//set size of window
        setLocationRelativeTo(null);
;
        add(createMenuItemButton("Hamburger", 120));	//create button for
        add(createMenuItemButton("Ice Cream", 150));
        add(createButton("Check Out", 200, CheckOutEvent));
        nutritionPanel.add(label);
        orderFrame.setLayout(new FlowLayout());
        orderFrame.add(nutritionPanel);
        orderFrame.add(buttonPanel);

    }


    private JButton createButton(String name, int width, ActionListener event) {
        JButton button = new JButton(name);
        button.setPreferredSize(new Dimension(width, 40));
        button.addActionListener(event);
        return button;
    }

    private JButton createMenuItemButton(String name, int width) {
        JButton button = new JButton(name);
        button.setSize(new Dimension(width, 40));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (button.getText()) {
                    case "Hamburger" -> purchased.add(new Hamburger());
                    case "Ice Cream" -> purchased.add(new IceCreamSundae());
                    case "Chicken Strips" -> purchased.add(new ChickenStrips());
                }
                purchasedAmount++;
                purchased.get(purchasedAmount).flipFlag();
                System.out.println(purchased.get(purchasedAmount).toString());

                if(purchased.get(purchasedAmount).isAddedFlag()) {
                    purchased.get(purchasedAmount).initializeNutrients();
                    purchased.get(purchasedAmount).sumOfNutrients();
                    label.setText(purchased.get(purchasedAmount).toString());

                    if(nutritionPanel.isVisible()) {
                        nutritionPanel.setSize(200, 100);
                    }

                    buttonPanel.removeAll();
                    int widthAccumulator = 0;
                    for (String s : purchased.get(purchasedAmount).getValidToppings()) {
                        widthAccumulator += s.length()*13;
                        buttonPanel.add(createAddIngredientButton(s, s.length()*13));
                    }
                    buttonPanel.setSize(400,200);


                    orderFrame.setLocationRelativeTo(null);
                    orderFrame.setSize(widthAccumulator+60, 200);
                    if(!orderFrame.isVisible())
                        orderFrame.setVisible(true);
                    else
                        orderFrame.repaint();
                }
            }
        });

        return button;
    }


    private JButton createAddIngredientButton(String name, int width) {
        JButton button = new JButton(name);
        button.setSize(new Dimension(width, 40));

        button.addActionListener(e -> {
            purchased.get(purchasedAmount).addTopping(button.getText());
            purchased.get(purchasedAmount).sumOfNutrients();
            label.setText(purchased.get(purchasedAmount).toString());
            nutritionPanel.repaint();
        });

        return button;
    }

    private ActionListener CheckOutEvent = e -> {
        checkoutFrame.remove(checkoutLabel);
        checkoutFrame.setSize(new Dimension(400,600));
        checkoutFrame.setLocationRelativeTo(null);

        String        priceTotal = "";
        StringBuilder orderTotal = new StringBuilder();
        double        total      = 0;

        if(!purchased.isEmpty()) {
            for(MenuItem item : purchased) {
                total += item.getPrice();
                orderTotal.append(item.getName()).append("<br>");
            }
            priceTotal = String.format("Total price is: $%.2f", total);
        }

        checkoutLabel.removeAll();
        checkoutLabel.setText("<html>" + priceTotal + "<br>" + orderTotal + "</html>");

        /*
        System.out.println(addedFlag);
        if(addedFlag) {
            checkoutFrame.add(checkoutLabel);
            addedFlag = false;
        }
        else {
            checkoutLabel.repaint();
            checkoutFrame.repaint();
        }
         */

        checkoutFrame.add(checkoutLabel);

        checkoutFrame.setVisible(true);

    };




}
