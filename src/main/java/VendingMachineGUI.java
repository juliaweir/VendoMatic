import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.techelevator.Logger;
import com.techelevator.currency.SalesReport;
import com.techelevator.currency.UserBalance;
import com.techelevator.products.DisplayMessages;
import com.techelevator.products.Inventory;
import com.techelevator.products.UpdateInventory;

public class VendingMachineGUI {
    public static void main(String[] args) {
        //instantiate objects to maintain user state
        UserBalance userBalance = new UserBalance(BigDecimal.ZERO);
        SalesReport saleReports = new SalesReport();

        //instantiate the main window, panels for the three buttons, and a layout to change button status
        JFrame frame = new JFrame("UMBRELLA TOTALLY NOT SUS VENDO-MATIC 800");
        JPanel corePanel = new JPanel();
        JPanel purchasePanel = new JPanel();
        JPanel topPanel = new JPanel();
        CardLayout cardLayout = new CardLayout();

        //instantiate the buttons for the topPanel
        JButton displayButton = new JButton("Display Purchase Items");
        JButton goToPurchaseButton = new JButton("Go to Purchase Menu");
        JButton exitButton = new JButton("Exit Program");
        JButton feedButton = new JButton("Enter Money & Feed");
        JButton buyButton = new JButton("Enter Slot & Purchase");
        JButton changeButton = new JButton("Take Change & Finish");

        //instantiate the textbox for inputting the key to each item to make purchases and pull sales
        TextField userInput = new TextField();

        //instantiate a label to display data to the user and a scrollbar
        JTextArea appOutput = new JTextArea();

        //appOutput settings
        appOutput.setEditable(false);

        //set cardLayout in the panel to hold the buttons
        topPanel.setLayout(cardLayout);

        //add buttons to appropriate panels
        corePanel.add(displayButton);
        corePanel.add(goToPurchaseButton);
        corePanel.add(exitButton);
        purchasePanel.add(feedButton);
        purchasePanel.add(buyButton);
        purchasePanel.add(changeButton);

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

        //do nothing on close so user doesn't lose any change, must exit via the menu option.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //and finally where all the action is... press buttons and fun stuff happens!
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                if(userInput.getText().contains("sales")){
                    saleReports.updateSalesReport();
                }
                /*alfred: made changes for sales report and debugged code for sales report.
                Empty appOutput with setText() and call the Inventory class's map.
                Use a for loop to display each item in the map line by line in appOutput.
                 */
                appOutput.setText("");

                UpdateInventory products = new UpdateInventory();
                List<Inventory> forSale = products.updateInventory();

                for(Inventory item : forSale){

                    appOutput.append(item.toString());

                }





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
            System.exit(0);
            }
        });

        feedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                appOutput.setText("");
                try{
                    double deposit = Double.parseDouble(userInput.getText());
                    userBalance.addBalance(BigDecimal.valueOf(deposit));
                } catch (NumberFormatException e){
                    appOutput.append("Please put numbers in the format xx.xx\n");
                }
                appOutput.append("Your balance is " + userBalance.printBalance());
            }
        });

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
//would log here if something was bought?
                //would need to instantiate an object

            }
        });

        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //empty appOutput
                appOutput.setText("");
                //make map to accept returnChange output and get coins
                Map<String, Integer> change = new HashMap<>();
                //pull the map for the change
                change = userBalance.returnChange(userBalance.getBalance());
                for (Map.Entry<String, Integer> set : change.entrySet()){
                    String line = set.getKey() + ": " + set.getValue() + "\n";
                    appOutput.append(line);
                }
                appOutput.append("Your total change is: " + userBalance.printBalance());
                userBalance.subtractBalance(userBalance.getBalance());

                cardLayout.show(topPanel, "core");
            }
        });
    }
}
