import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame {
    private JFrame toppingFrame = new JFrame("Choose your toppings");			//Create new object of JFrame type with text Order
    private JFrame checkoutFrame = new JFrame("Check Out");		//create new object of JFrame type with text Check Out

    private JPanel buttonPanel = new JPanel();          private JPanel nutritionPanel = new JPanel();
    private JPanel menuButtonPanel_Row1 = new JPanel();
    private JPanel menuButtonPanel_Row2 = new JPanel(); private JPanel menuButtonPanel_Row3 = new JPanel();
    private JPanel comboPanel_1 = new JPanel();         private JPanel comboPanel_2 = new JPanel();

    private JLabel nutritionLabel =new JLabel();
    private JLabel checkoutLabel = new JLabel();

    private JTextArea comboDesc_combo1 = new JTextArea(); private JTextArea comboDesc_combo2 =new JTextArea();

    private List<MenuItem> purchased = new ArrayList<>();		//Create list for items in cart
    private int purchasedAmount = -1;

    Window() {													//Default constructor for Window
        super("Eddie's burgers and more");								//Window title Eddies Burgers
        setLayout(new FlowLayout());							//set layout
        setSize(new Dimension(500,900));						//set size of window
        setLocationRelativeTo(null);
        menuButtonPanel_Row1.setSize(400,200);
        menuButtonPanel_Row2.setSize(400,200);
        menuButtonPanel_Row3.setSize(400,200);

        comboPanel_1.setSize(400,200);
        comboPanel_2.setSize(400,200);
        add(menuButtonPanel_Row1);

        add(menuButtonPanel_Row2);
        add(menuButtonPanel_Row3);
        add(comboPanel_1);
        add(comboPanel_2);
;
        menuButtonPanel_Row1.add(createButton("Check Out", 200, CheckOutEvent));
        menuButtonPanel_Row2.add(createMenuItemButton("Hamburger", 120));	//create button for
        menuButtonPanel_Row2.add(createMenuItemButton("Ice Cream", 150));
        menuButtonPanel_Row2.add(createMenuItemButton("Chicken Strips", 150));
        menuButtonPanel_Row2.add(createMenuItemButton("Hot Dog", 150));
        menuButtonPanel_Row3.add(createMenuItemButton("Fries",150));
        menuButtonPanel_Row3.add(createMenuItemButton("Drink",120));

        comboDesc_combo1.setEditable(false);
        comboDesc_combo1.append("Combo 1: Hamburger, Fries and a Medium Drink");
        comboPanel_1.add(comboDesc_combo1);
        comboPanel_1.add(createComboButton("Combo 1", 100));

        comboDesc_combo2.setEditable(false);
        comboDesc_combo2.append("Combo 2: Hot Dog and a Medium Drink");
        comboPanel_2.add(comboDesc_combo2);
        comboPanel_2.add(createComboButton("Combo 2", 100));

        nutritionPanel.add(nutritionLabel);
        toppingFrame.setLayout(new FlowLayout());
        toppingFrame.add(nutritionPanel);
        toppingFrame.add(buttonPanel);

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
        button.addActionListener(e -> {
            switch (button.getText()) {
                case "Hamburger" -> purchased.add(new Hamburger());
                case "Ice Cream" -> purchased.add(new IceCreamSundae());
                case "Chicken Strips" -> purchased.add(new ChickenStrips());
                case "Hot Dog" -> purchased.add(new Hotdog());
                case "Fries" -> purchased.add(new Fries());
                case "Drink" ->purchased.add(new Drink());

            }
            purchasedAmount++;
            purchased.get(purchasedAmount).flipFlag();

            if(purchased.get(purchasedAmount).isAddedFlag()) {
                purchased.get(purchasedAmount).initializeNutrients();
                purchased.get(purchasedAmount).sumOfNutrients();
                nutritionLabel.setText(purchased.get(purchasedAmount).toString());

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


                toppingFrame.setLocationRelativeTo(null);
                toppingFrame.setSize(widthAccumulator+60, 200);
                if(!toppingFrame.isVisible())
                    toppingFrame.setVisible(true);
                else
                    toppingFrame.repaint();
            }
        });

        return button;
    }

    private JButton createComboButton(String name, int width) {
        JButton button = new JButton(name);
        button.setSize(width, 50);
        button.addActionListener(e -> {

            switch (button.getText()) {
                case "Combo 1" -> {
                    purchased.add(new Hamburger());
                    purchased.add(new Fries());
                    purchased.add(new Drink());
                    purchasedAmount+=3;
                }
                case "Combo 2" -> {
                    purchased.add(new Hotdog());
                    purchased.add(new Drink());
                    purchasedAmount+=2;
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
            nutritionLabel.setText(purchased.get(purchasedAmount).toString());
            nutritionPanel.repaint();
        });

        return button;
    }

    private ActionListener CheckOutEvent = e -> {
        checkoutFrame.remove(checkoutLabel);
        checkoutFrame.setSize(new Dimension(400,300));
        checkoutFrame.setLocationRelativeTo(null);

        String        priceTotal = "";
        StringBuilder orderTotal = new StringBuilder();
        double        total      = 0;

        if(!purchased.isEmpty()) {
            int i = 0;
            for(MenuItem item : purchased) {
                total += item.getPrice();
                orderTotal.append(item.getName()).append(item.getToppings()).append("<br>");
                i++;
            }
            priceTotal = String.format("Total price is: $%.2f", total);
        }

        checkoutLabel.removeAll();
        checkoutLabel.setText("""
                <html>
                <span style="font-size: large; "> %s </span>
                <br> %s
                </html>
                """.formatted(priceTotal, orderTotal));

        checkoutFrame.add(checkoutLabel);

        checkoutFrame.setVisible(true);

    };




}
