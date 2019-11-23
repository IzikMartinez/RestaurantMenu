import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame {
    private JFrame orderFrame = new JFrame("Order");			//Create new object of JFrame type with text Order
    private JFrame checkoutFrame = new JFrame("Check Out");		//create new object of JFrame type with text Check Out

    private List<MenuItem> purchased = new ArrayList<>();		//Create list for items in cart

    Window() {													//Default constructor for Window
        super("Eddie's burgers");								//Window title Eddies Burgers
        setLayout(new FlowLayout());							//set layout
        setSize(new Dimension(700,900));						//set size of window
        setLocationRelativeTo(null);
        add(createButton("Add To Order", 150,40, OrderEvent));	//create button for
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

	private ActionListener addGrilledChickenSand = e-> {
		purchased.add(new GrilledChickenSand());	//If selected, create new GrilledChickenSand object
		purchased.get(0).sumOfNutrients();			//get sumOfNutrients

		JLabel label = new JLabel ("<html>" + purchased.get(0).toString() + "<html>");	//create JLabel for button
		orderFrame.add(label);	//add label to frame
		orderFrame.add(createButton("Add Topping", 150,40,addIngredient));		//create button to add a topping
		orderFrame.add(createButton("Remove Topping", 150,40,removeIngredient));	//create button to remove topping
		orderFrame.setLocationRelativeTo(null);
		orderFrame.setSize(400,400);	//set size
		orderFrame.setVisible(true);	//set visible
	}

	private ActionListener addIceCreamSundae = e-> {
		purchased.add(new IceCreamSundae());
		purchased.get(0).sumOfNutrients();

		JLabel label = new JLabel ("<html>" + purchased.get(0).toString() + "<html>");
		orderFrame.add(label);
		orderFrame.add(createButton("Add Topping", 150,40,addIngredient));
		orderFrame.add(createButton("Remove Topping", 150,40,removeIngredient));
		orderFrame.setLocationRelativeTo(null);
		orderFrame.setSize(400,400);
		orderFrame.setVisible(true);
	}

		private ActionListener addChickenStrips = e-> {
		purchased.add(new ChickenStrips());
		purchased.get(0).sumOfNutrients();

		JLabel label = new JLabel ("<html>" + purchased.get(0).toString() + "<html>");
		orderFrame.add(label);
		orderFrame.add(createButton("Add Topping", 150,40,addIngredient));
		orderFrame.add(createButton("Remove Topping", 150,40,removeIngredient));
		orderFrame.setLocationRelativeTo(null);
		orderFrame.setSize(400,400);
		orderFrame.setVisible(true);
	}

	/*private ActionListener addDrink = e-> {



	}*/


    private ActionListener OrderEvent = e -> {
        orderFrame.setSize(new Dimension(400,600));
        orderFrame.setLocationRelativeTo(null);
        orderFrame.setLayout(new FlowLayout());
        orderFrame.add(createButton("Hamburger",100,40, addBurger));
		orderFrame.add(createButton("Grilled Chicken Sandwich",200,40,addGrilledChickenSand);	//add button for chicken sandwich
		orderFrame.add(createButton("Ice Cream Sundae",150,40,addIceCreamSundae);				//add button for ice cream sundae
		orderFrame.add(createButton("Chicken Strips"),125,40,addChickenStrips);					//add button for chicken strips
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
