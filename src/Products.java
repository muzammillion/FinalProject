import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 * @author Muzammil
 *
 */
public class Products extends JFrame{
	public ArrayList<String> product;
	private JButton buyfirst;
	private JButton buysecond;
	/**
	 * 
	 */
	private JButton buythird;
	private JButton receipt;
	public double total;
	
	public Products(){
		super("Shopping List");
		setLayout(new FlowLayout());
	buyfirst = new JButton("Buy Item 1 ($7.99)");
	add(buyfirst);
	buyfirst.addActionListener(new FirstListener());
	
	buysecond = new JButton("Buy Item 2 ($2.99)");
	add(buysecond);
	buysecond.addActionListener(new SecondListener());
	
	buythird = new JButton("Buy Item 3 ($15.99)");
	add(buythird);
	buythird.addActionListener(new ThirdListener());

	receipt = new JButton("Print Receipt");
	add(receipt);
	receipt.addActionListener(new ReceiptListener());
	
	total = 0.0;
	product = new ArrayList<String>();

	}
	
	public class FirstListener implements ActionListener{
		//Adds the first object to the receipt and makes the price go up
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e){
			if(product!=null){
			total+=7.99;
			product.add("1 object 1: $7.99");
			JOptionPane.showMessageDialog(null, "One Object 1 added.");
		}
		}
	}
	
	public class ReceiptListener implements ActionListener{
		//Print the receipt and the total price
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e){
			if(product.size()==0){
				JOptionPane.showMessageDialog(null, "You need to buy atleast one item.");
			}
			else
			{
			for(int x = 0; x<product.size(); x++){
				System.out.println(product.get(x));
			}
			}
		}
	}
	public class SecondListener implements ActionListener{
		//Adds the second object to the receipt and makes the price go up
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e){
			if(product!=null){
			total+=2.99;
			product.add("1 object 2: $2.99");
			JOptionPane.showMessageDialog(null, "One Object 2 added.");
			}
		}
		}
	public class ThirdListener implements ActionListener{
		//Adds the third object to the receipt and makes the price go up
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e){
			if(product!=null){
			total+=15.99;
			product.add("1 object 3: $15.99");
			JOptionPane.showMessageDialog(null, "One Object 3 added.");
		}
		}
	}
}
