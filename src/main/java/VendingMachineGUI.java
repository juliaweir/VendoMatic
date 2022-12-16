import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VendingMachineGUI {
    public static void main(String[] args) {
        //instantiate the main window, panels for the three buttons, and a layout to change button status
        JFrame frame = new JFrame("UMBRELLA TOTALLY NOT SUS VENDO-MATIC 800");
        JPanel corePanel = new JPanel();
        JPanel purchasePanel = new JPanel();
        JPanel topPanel = new JPanel();
        CardLayout cardLayout = new CardLayout();

        //instantiate the buttons for the topPanel
        JButton displayButton = new JButton("Display Purchase Items");
        JButton goToPurchaseButton = new JButton("Go to Purchase Menu");
        JButton exitButton = new JButton("Exit and Take Change");
        JButton feedButton = new JButton("Enter Money & Feed");
        JButton buyButton = new JButton("Enter Slot & Purchase");
        JButton goToCoreButton = new JButton("Finish Transaction");

        //instantiate the textbox for inputting the key to each item to make purchases and pull sales
        TextField userInput = new TextField();

        //instantiate a label to display data to the user
        JLabel appOutput = new JLabel();

        //set cardLayout in the panel to hold the buttons
        topPanel.setLayout(cardLayout);

        //add buttons to appropriate panels
        corePanel.add(displayButton);
        corePanel.add(goToPurchaseButton);
        corePanel.add(exitButton);
        purchasePanel.add(feedButton);
        purchasePanel.add(buyButton);
        purchasePanel.add(goToCoreButton);

        //add the button panels to the cardLayout and set constraints to switch button settings
        topPanel.add(corePanel, "core");
        topPanel.add(purchasePanel, "purchase");

        //show the core buttons by default
        cardLayout.show(topPanel, "core");

        //add GUI elements to the frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.getContentPane().add(userInput, BorderLayout.SOUTH);
        frame.getContentPane().add(appOutput);

        //frame settings
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //and finally where all the action is... press buttons and fun stuff happens!

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

            }
        });

        goToPurchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cardLayout.show(topPanel, "purchase");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

            }
        });

        feedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

            }
        });

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
//would log here if something was bought?
                //would need to instantiate an object
            }
        });

        goToCoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cardLayout.show(topPanel, "core");
            }
        });
    }
}
