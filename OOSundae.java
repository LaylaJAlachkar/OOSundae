import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout; 
import javax.swing.text.*; 
import javax.swing.border.Border; 

public class OOSundae
{   
    private JFrame frame;
	private JTextArea tField;
	private JLabel lGeneralRecipe; 
	private JLabel lDoughnutSundaeRecipe; 
	private JLabel lBananaSplitSundaeRecipe; 
	private JLabel lSundaeTypes; 
    private JButton doughnutSundaeButton;
	private JButton bananaSplitSundaeButton; 
	private JButton getBowlButton; 
	private JButton scoopIceCreamButton; 
	private JButton whippedCreamButton; 
	private JButton addCherryButton; 
	private JButton sundaeButton; 
	private JButton clearButton; 
	private JButton addDoughnut; 
	private JButton addCaramelSyrup; 
	private JButton addChocolateSyrup; 
	private JButton addSprinkles; 
	private JButton addBanana; 
	private JButton sliceBanana; 
	private JButton eatButton; 
    private String nameTField;
	private boolean blnSelectSundae = false; 
	private boolean blnGetBowel = false; 
	private boolean blnScoopIceCream = false; 
	private boolean blnWhippedCream = false; 
	private boolean blnCherry = false; 
	private boolean blnSundae = false; 
	private boolean blnDoughnutSundae = false; 
	private boolean blnBananaSplitSundae = false; 
	private boolean blnDoughnut = false; 
	private boolean blnCaramelSyrup = false; 
	private boolean blnChocolateSyrup = false; 
	private boolean blnSprinkles = false; 
	private boolean blnBananaSlice = false; 
	private boolean blnBanana = false; 
	private ImageIcon campCodeIcon;
	private String strPoint1 = "Question 1: "; 
	private String strPoint2 = "";
	private String strPoint3 = ""; 
	private String strPoint4 = ""; 
	private String strPoint5 = ""; 
	private boolean blnTriviaCorrect = false; 
	private int lngPoint = 0; 
	private int lngPointsPossible = 0; 
	

    public OOSundae() { }

    private void displayGUI()
    {
        //Instantiate Camp Code Icon for Pop-ups
		ImageIcon cci = new ImageIcon("res/CampCode.png"); 
		Image image1 = cci.getImage(); 
		Image newImage1 = image1.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH); 
		ImageIcon campCodeIcon = new ImageIcon(newImage1); 
		
		//Instantiate Colors
		Color pink = new Color(230,99,165);
		Color mint = new Color(113,200,176); 
		Color navy = new Color(14,64,102); 
		Color white = new Color(255,255,255); 
		Color orange = new Color(235,136,58); 
		Color brown = new Color(102,86,81); 
		Color peach = new Color(255,229,187); 
		
		//Set up JFrame
		frame = new JFrame("Object Oriented Programming - Make a Sundae");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set Buttons and Action Listeners on CLick
        doughnutSundaeButton = new JButton("Doughnut Sundae");
        doughnutSundaeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
				tField.setFont(new Font("Serif", Font.PLAIN, 20)); 
				if(blnSelectSundae == false) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\n\n\t\t\t\t\t\t\tPoints"); 
					tField.append("\nInstantiate Object: ");
					tField.append("\tDoughnutSundae sundae = new DoughnutSundae(); "); 
					if(blnTriviaCorrect == true){
						tField.append("\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t0"); 
						lngPointsPossible += 1; 
					}
					blnSelectSundae = true; 
					blnDoughnutSundae = true; 
				} else {
					JOptionPane.showMessageDialog(null, "Keep going with the sundae you've already selected or hit clear to try to make a new Sundae!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
            }
        });
		bananaSplitSundaeButton = new JButton("Banana Split Sundae"); 
		bananaSplitSundaeButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				if (blnSelectSundae == false) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.setFont(new Font("Serif", Font.PLAIN, 20)); 
					tField.append("\n\n\t\t\t\t\t\t\tPoints"); 
					tField.append("\nInstantiate Object: ");
					tField.append("\tBananaSplitSundae sundae = new BananaSplitSundae(); "); 
					blnSelectSundae = true; 
					blnBananaSplitSundae = true; 
					if(blnTriviaCorrect == true){
						tField.append("\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t0"); 
						lngPointsPossible += 1; 
					}
				} else { 
					JOptionPane.showMessageDialog(null, "Keep going with the sundae you've already selected or hit clear to try to make a new Sundae!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 
		sundaeButton = new JButton("Sundae"); 
		sundaeButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				if (blnSelectSundae == false) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.setFont(new Font("Serif", Font.PLAIN, 20)); 
					tField.append("\n\n\t\t\t\t\t\t\tPoints"); 
					tField.append("\nInstantiate Object: ");
					tField.append("\tSundae sundae = new Sundae(); "); 
					blnSelectSundae = true; 
					blnSundae = true; 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else {
					JOptionPane.showMessageDialog(null, "Keep going with the sundae you've already selected or hit clear to try to make a new Sundae!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 	 
		getBowlButton = new JButton("Get Bowl");
		getBowlButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				if (blnSelectSundae == true & blnGetBowel == false) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.setFont(new Font("Serif", Font.PLAIN, 20)); 
					tField.append("\nGeneral Recipe: "); 
					tField.append("\tsundae.getBowl(); "); 
					blnGetBowel = true; 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnGetBowel == true) {
					JOptionPane.showMessageDialog(null, "You already have a bowl. Let's get some ice cream!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else {
					JOptionPane.showMessageDialog(null, "You haven't instantiated your object yet... Pick a Sundae to make!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 					
		scoopIceCreamButton = new JButton("Scoop Ice Cream"); 
		scoopIceCreamButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				if (blnSelectSundae == true & blnGetBowel == true & blnScoopIceCream == false) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.setFont(new Font("Serif", Font.PLAIN, 20)); 
					tField.append("\n\t\tsundae.scoopIceCream('Vanilla');"); 
					blnScoopIceCream = true; 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnSelectSundae == true & blnGetBowel == true & blnScoopIceCream == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\nExtra Scoop! "); 
					tField.append("\t\tsundae.scoopIceCream('Vanilla');"); 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnGetBowel == false & blnSelectSundae == true) {
					JOptionPane.showMessageDialog(null, "You don't have a bowl yet. Let's get one!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else {
					JOptionPane.showMessageDialog(null, "You haven't instantiated your object yet... Pick a Sundae to make!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 	
				
		whippedCreamButton = new JButton("Add Whipped Cream"); 
		whippedCreamButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				if (blnSelectSundae == true & blnGetBowel == true & blnWhippedCream == false) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.setFont(new Font("Serif", Font.PLAIN, 20)); 
					tField.append("\n\t\tsundae.addWhippedCream();   "); 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
					blnWhippedCream = true; 
				} else if (blnSelectSundae == true & blnGetBowel == true & blnWhippedCream == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\nExtra Whipped Cream! "); 
					tField.append("\tsundae.addWhippedCream(); "); 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnGetBowel == false & blnSelectSundae == true) {
					JOptionPane.showMessageDialog(null, "You don't have a bowl yet. Let's get one!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else {
					JOptionPane.showMessageDialog(null, "You haven't instantiated your object yet... Pick a Sundae to make!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 
		
		addCherryButton = new JButton("Add Cherry"); 
		addCherryButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				if (blnSelectSundae == true & blnGetBowel == true & blnCherry == false) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.setFont(new Font("Serif", Font.PLAIN, 20)); 
					tField.append("\n\t\tsundae.addCherryOnTop();   "); 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
					blnCherry = true; 
				} else if (blnSelectSundae == true & blnGetBowel == true & blnCherry == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\nExtra Cherry! "); 
					tField.append("\tsundae.addCherryOnTop(); "); 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnGetBowel == false & blnSelectSundae == true) {
					JOptionPane.showMessageDialog(null, "You don't have a bowl yet. Let's get one!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else {
					JOptionPane.showMessageDialog(null, "You haven't instantiated your object yet... Pick a Sundae to make!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 
		
		sliceBanana = new JButton("Slice Banana"); 
		sliceBanana.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae) 
			{
				if (blnSelectSundae == true & blnGetBowel == true & blnBananaSlice == false & blnBananaSplitSundae == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\nBanana Split Recipe:"); 
					tField.append("\tsundae.sliceBanana(); "); 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t\t0"); 
						lngPointsPossible += 1; 
					}
					blnBananaSlice = true; 
				} else if (blnSelectSundae == true & blnGetBowel == true & blnBananaSlice == true & blnBananaSplitSundae == true) {
					JOptionPane.showMessageDialog(null, "Banana has been sliced, let's add it to the sundae!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else if (blnSelectSundae == true & blnGetBowel == true & blnBananaSplitSundae == false) {
					JOptionPane.showMessageDialog(null, "The sundae you've instantiated doesn't have this property.", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else if (blnSelectSundae == true & blnGetBowel == false) {
					JOptionPane.showMessageDialog(null, "You don't have a bowl yet. Let's get one!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else {
					JOptionPane.showMessageDialog(null, "You haven't instantiated your object yet... Pick a Sundae to make!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 
		
		addBanana = new JButton("Add Banana"); 
		addBanana.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				if (blnSelectSundae == true & blnGetBowel == true & blnBanana == false & blnBananaSlice == true & blnBananaSplitSundae == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\n\t\tsundae.addBanana(); "); 
					blnBanana = true; 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnSelectSundae == true & blnGetBowel == true & blnBanana == false & blnBananaSlice == false & blnBananaSplitSundae == true) {
					JOptionPane.showMessageDialog(null, "First you have to slice the banana before adding it to the bowl.", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else if (blnSelectSundae == true & blnGetBowel == true & blnBanana == true & blnBananaSplitSundae == true) {
					JOptionPane.showMessageDialog(null, "You've already added the banana to your sundae?", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else if (blnSelectSundae == true & blnBananaSplitSundae == false & blnGetBowel == true) {
					JOptionPane.showMessageDialog(null, "The sundae you've instantiated doesn't have this property.", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}else if (blnSelectSundae == true & blnGetBowel == false) {
					JOptionPane.showMessageDialog(null, "You don't have a bowl yet. Let's get one!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else {
					JOptionPane.showMessageDialog(null, "You haven't instantiated your object yet... Pick a Sundae to make!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 
		
		addChocolateSyrup = new JButton("Chocolate Syrup"); 
		addChocolateSyrup.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				if (blnSelectSundae == true & blnGetBowel == true & blnChocolateSyrup == false & blnBananaSplitSundae == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\n\t\tsundae.drizzleChocolateSyrup(); "); 
					blnChocolateSyrup = true; 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnSelectSundae == true & blnGetBowel == true & blnChocolateSyrup == true & blnBananaSplitSundae == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\nExtra Syrup! \t\tsundae.drizzleChocolateSyrup(); ");
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnSelectSundae == true & blnGetBowel == false) {
					JOptionPane.showMessageDialog(null, "You don't have a bowl yet. Let's get one!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else if (blnSelectSundae == true & blnBananaSplitSundae == false) {
					JOptionPane.showMessageDialog(null, "The sundae you've instantiated doesn't have this property.", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else {
					JOptionPane.showMessageDialog(null, "You haven't instantiated your object yet... Pick a Sundae to make!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 
		
		addDoughnut = new JButton("Doughnut"); 
		addDoughnut.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				if (blnSelectSundae == true & blnGetBowel == true & blnDoughnut == false & blnDoughnutSundae == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\n\t\tsundae.addDoughnut('Apple Cider Doughnut'); "); 
					blnDoughnut = true; 
					if(blnTriviaCorrect == true){
						tField.append("\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnSelectSundae == true & blnGetBowel == true & blnDoughnut == true & blnDoughnutSundae == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\nExtra Doughnut! \tsundae.addDoughnut('Apple Cider Doughnut'); ");
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnSelectSundae == true & blnGetBowel == true & blnDoughnutSundae == false) {
					JOptionPane.showMessageDialog(null, "The sundae you've instantiated doesn't have this property.", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else if (blnSelectSundae == true & blnGetBowel == false) {
					JOptionPane.showMessageDialog(null, "You don't have a bowl yet. Let's get one!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else {
					JOptionPane.showMessageDialog(null, "You haven't instantiated your object yet... Pick a Sundae to make!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 
		
		addCaramelSyrup = new JButton("Caramel Syrup"); 
		addCaramelSyrup.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				if (blnSelectSundae == true & blnGetBowel == true & blnCaramelSyrup == false & blnDoughnutSundae == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\n\t\tsundae.drizzleCaramelSyrup(); "); 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
					blnCaramelSyrup = true; 
				} else if (blnSelectSundae == true & blnGetBowel == true & blnCaramelSyrup == true & blnDoughnutSundae == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\nExtra Syrup! \t\tsundae.drizzleCaramelSyrup(); ");
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnSelectSundae == true & blnGetBowel == true & blnDoughnutSundae == false) {
					JOptionPane.showMessageDialog(null, "The sundae you've instantiated doesn't have this property.", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else if (blnSelectSundae == true & blnGetBowel == false) {
					JOptionPane.showMessageDialog(null, "You don't have a bowl yet. Let's get one!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else {
					JOptionPane.showMessageDialog(null, "You haven't instantiated your object yet... Pick a Sundae to make!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 
		
		addSprinkles = new JButton("Sprinkles"); 
		addSprinkles.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				if (blnSelectSundae == true & blnGetBowel == true & blnSprinkles == false & blnDoughnutSundae == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\n\t\tsundae.addSprinkles(); "); 
					blnSprinkles = true; 
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnSelectSundae == true & blnGetBowel == true & blnCaramelSyrup == true & blnDoughnutSundae == true) {
					blnTriviaCorrect = ReviewQuestion(); 
					tField.append("\nExtra Sprinkles! \tsundae.addSprinkles(); ");
					if(blnTriviaCorrect == true){
						tField.append("\t\t\t1"); 
						lngPoint += 1; 
						lngPointsPossible += 1; 
					} else {
						tField.append("\t\t\t0"); 
						lngPointsPossible += 1; 
					}
				} else if (blnSelectSundae == true & blnGetBowel == true & blnDoughnutSundae == false) {
					JOptionPane.showMessageDialog(null, "The sundae you've instantiated doesn't have this property.", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else if (blnSelectSundae == true & blnGetBowel == false) {
					JOptionPane.showMessageDialog(null, "You don't have a bowl yet. Let's get one!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				} else {
					JOptionPane.showMessageDialog(null, "You haven't instantiated your object yet... Pick a Sundae to make!", "Oh No!", JOptionPane.INFORMATION_MESSAGE, campCodeIcon); 
				}
			}
		}); 
		
		eatButton = new JButton("Let's Eat!");
		eatButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				//Doughnut Sundae Image
				ImageIcon imageDoughnutSundae = new ImageIcon("res/DS.jpg"); 
				Image image = imageDoughnutSundae.getImage(); 
				Image newImage = image.getScaledInstance(200, 120, java.awt.Image.SCALE_SMOOTH); 
				imageDoughnutSundae = new ImageIcon(newImage); 

				//Banana Split Sundae Image
				ImageIcon imageBananaSplitSundae = new ImageIcon("res/Banana.jpg");
				image = imageBananaSplitSundae.getImage(); 
				newImage = image.getScaledInstance(200, 120, java.awt.Image.SCALE_SMOOTH); 
				imageBananaSplitSundae = new ImageIcon(newImage); 
				
				//Sundae Image
				ImageIcon imageSundae = new ImageIcon("res/IceCream.jpg"); 
				image = imageSundae.getImage(); 
				newImage = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); 
				imageSundae = new ImageIcon(newImage); 
				
				//Ingredients Image
				ImageIcon imageIngredients = new ImageIcon("res/IceCreamRecipe.jpg"); 
				image = imageIngredients.getImage(); 
				newImage = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); 
				imageIngredients = new ImageIcon(newImage); 
				
				//Empty Bowl Image
				ImageIcon imageEmpty = new ImageIcon("res/Empty.jpg"); 
				image = imageEmpty.getImage(); 
				newImage = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); 
				imageEmpty = new ImageIcon(newImage); 
				
				String strScoreText = "\nYou got a score of " + lngPoint + "/" + lngPointsPossible + "!"; 
				if(lngPointsPossible > 0 & lngPoint/lngPointsPossible == 1) {
					strScoreText += " A perfect Sundae! Yum!"; 
				} else if(lngPointsPossible > 0 & lngPointsPossible - lngPoint <= 2) {
					strScoreText += " An almost perfect Sundae! Yum!"; 
				} 
				
				if (blnDoughnutSundae == true & blnGetBowel == true) {
					if (blnWhippedCream == true & blnCherry == true & blnDoughnut == true & blnCaramelSyrup == true & blnSprinkles == true & blnScoopIceCream == true) {
						JOptionPane.showMessageDialog(null,  "Let's Eat a Doughnut Sundae!" + strScoreText, "Let's Eat!", JOptionPane.INFORMATION_MESSAGE, imageDoughnutSundae); 
					} else {
						JOptionPane.showMessageDialog(null,  "I'm not sure that's a Doughnut Sundae but it looks delicious! " + strScoreText, "Let's Eat!", JOptionPane.INFORMATION_MESSAGE, imageIngredients); 
					}
				} else if (blnBananaSplitSundae == true & blnGetBowel == true) {
					if (blnWhippedCream == true & blnCherry == true & blnBananaSlice == true & blnBanana == true & blnChocolateSyrup == true & blnScoopIceCream == true) {
						JOptionPane.showMessageDialog(null, "Let's Eat a Banana Split Sundae!" + strScoreText, "Let's Eat!", JOptionPane.INFORMATION_MESSAGE, imageBananaSplitSundae); 
					} else {
						JOptionPane.showMessageDialog(null, "I'm not sure that's a Banana Split Sundae but it looks delicious!" + strScoreText, "Let's Eat!", JOptionPane.INFORMATION_MESSAGE, imageIngredients); 
					}
				} else if (blnSundae == true & blnGetBowel == true) {
					if (blnWhippedCream == true & blnCherry == true & blnScoopIceCream == true) {
						JOptionPane.showMessageDialog(null,  "Let's Eat an Ice Cream Sundae!" + strScoreText, "Let's Eat!",  JOptionPane.INFORMATION_MESSAGE, imageSundae); 
					} else {
						JOptionPane.showMessageDialog(null, "I'm not sure that's an Ice Cream Sundae but it looks delicious! " + strScoreText, "Let's Eat!", JOptionPane.INFORMATION_MESSAGE, imageIngredients); 
					}
				} else {	
					JOptionPane.showMessageDialog(null, "We haven't made a Sundae yet! Let's get a bowl! " + strScoreText, "Let's Eat!", JOptionPane.INFORMATION_MESSAGE, imageEmpty); 
				}
				blnSelectSundae = false; 
				blnGetBowel = false; 
				blnScoopIceCream = false; 
				blnWhippedCream = false; 
				blnCherry = false; 
				blnSundae = false; 
				blnDoughnutSundae = false; 
				blnBananaSplitSundae = false; 
				blnDoughnut = false; 
				blnCaramelSyrup = false; 
				blnChocolateSyrup = false; 
				blnSprinkles = false; 
				blnBananaSlice = false; 
				blnBanana = false; 
				lngPoint = 0; 
				lngPointsPossible = 0; 
				
				tField.setFont(new Font("Serif", Font.PLAIN, 20)); 
				tField.setText("  To begin programming select a sundae to instantiate (Object) then use the \n  recipe (Class) options on the right to build your Sundae!"); 
				
			}
		}); 
		
		clearButton = new JButton("Clear!");
		clearButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				tField.setFont(new Font("Serif", Font.PLAIN, 20)); 
				tField.setText("  To begin programming select a sundae to instantiate (Object) then use the \n  recipe (Class) options on the right to build your Sundae!"); 
				blnSelectSundae = false; 
				blnGetBowel = false; 
				blnScoopIceCream = false; 
				blnWhippedCream = false; 
				blnCherry = false; 
				blnSundae = false; 
				blnDoughnutSundae = false; 
				blnBananaSplitSundae = false; 
				blnDoughnut = false; 
				blnCaramelSyrup = false; 
				blnChocolateSyrup = false; 
				blnSprinkles = false; 
				blnBananaSlice = false; 
				blnBanana = false; 
			}
		}); 	
		
		//set button colors
		doughnutSundaeButton.setBackground(pink); 
		bananaSplitSundaeButton.setBackground(pink); 
		getBowlButton.setBackground(pink); 
		scoopIceCreamButton.setBackground(pink); 
		whippedCreamButton.setBackground(pink); 
		addCherryButton.setBackground(pink); 
		sundaeButton.setBackground(pink); 
		clearButton.setBackground(pink); 
		addDoughnut.setBackground(pink); 
		addCaramelSyrup.setBackground(pink); 
		addChocolateSyrup.setBackground(pink); 
		addSprinkles.setBackground(pink); 
		addBanana.setBackground(pink); 
		sliceBanana.setBackground(pink); 
		eatButton.setBackground(pink); 
		
		//set button text colors
		doughnutSundaeButton.setForeground(white); 
		bananaSplitSundaeButton.setForeground(white); 
		getBowlButton.setForeground(white); 
		scoopIceCreamButton.setForeground(white); 
		whippedCreamButton.setForeground(white); 
		addCherryButton.setForeground(white); 
		sundaeButton.setForeground(white); 
		clearButton.setForeground(white); 
		addDoughnut.setForeground(white); 
		addCaramelSyrup.setForeground(white); 
		addChocolateSyrup.setForeground(white); 
		addSprinkles.setForeground(white); 
		addBanana.setForeground(white); 
		sliceBanana.setForeground(white); 
		eatButton.setForeground(white); 
		
		//Insantiate Labels for GUI
		lGeneralRecipe = new JLabel("General Recipe"); 
		lGeneralRecipe.setForeground(navy); 
		lGeneralRecipe.setFont(new Font("Serif", Font.PLAIN, 20)); 
		lBananaSplitSundaeRecipe = new JLabel("Banana Split Recipe"); 
		lBananaSplitSundaeRecipe.setForeground(navy); 
		lBananaSplitSundaeRecipe.setFont(new Font("Serif", Font.PLAIN, 20)); 
		lDoughnutSundaeRecipe = new JLabel("Doughnut Sundae Recipe"); 
		lDoughnutSundaeRecipe.setForeground(navy); 
		lDoughnutSundaeRecipe.setFont(new Font("Serif", Font.PLAIN, 20)); 
		lSundaeTypes = new JLabel("Sundae Options");
		lSundaeTypes.setForeground(navy); 
		lSundaeTypes.setFont(new Font("Serif", Font.PLAIN, 20)); 
		
		//Set View Layout
		tField = new JTextArea("  To begin programming select a sundae to instantiate (Object) then use the \n  recipe (Class) options on the right to build your Sundae!"); 
		tField.setSize(100, 100); 
		tField.setEditable(false); 
		tField.setFont(new Font("Serif", Font.PLAIN, 20)); 
		tField.setLineWrap(true); 
		tField.setBackground(peach);
		tField.setForeground(navy); 
		DefaultCaret caret = (DefaultCaret)tField.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		JScrollPane sp = new JScrollPane(tField); 
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		
		GroupLayout layout = new GroupLayout(frame.getContentPane()); 
		layout.setHorizontalGroup(
			layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(sp)
				)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(100)
					.addComponent(lGeneralRecipe)
					.addComponent(bananaSplitSundaeButton)
					.addComponent(doughnutSundaeButton)
					.addComponent(getBowlButton)
					.addComponent(scoopIceCreamButton)
					.addComponent(whippedCreamButton)
					.addComponent(addCherryButton)
					.addComponent(lSundaeTypes)
					.addComponent(sundaeButton)
					.addComponent(lBananaSplitSundaeRecipe)
					.addComponent(sliceBanana)
					.addComponent(addBanana)
					.addComponent(addChocolateSyrup)
					.addComponent(clearButton)
					.addComponent(lDoughnutSundaeRecipe)
					.addComponent(addCaramelSyrup)
					.addComponent(addDoughnut)
					.addComponent(addSprinkles)
					.addComponent(eatButton)
					)
		); 
		layout.setVerticalGroup(
			layout.createParallelGroup()
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(10)
				.addComponent(sp))
			.addGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(10)
					.addComponent(lSundaeTypes))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(10)
					.addComponent(sundaeButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(10)
					.addComponent(bananaSplitSundaeButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(40)
					.addComponent(doughnutSundaeButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(10)
					.addComponent(lGeneralRecipe))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(10)
					.addComponent(getBowlButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(10)
					.addComponent(scoopIceCreamButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(10)
					.addComponent(whippedCreamButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(40)
					.addComponent(addCherryButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(10)
					.addComponent(lBananaSplitSundaeRecipe))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(10)
					.addComponent(sliceBanana))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(10)
					.addComponent(addBanana))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(40)
					.addComponent(addChocolateSyrup))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(10)
					.addComponent(lDoughnutSundaeRecipe))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(10)
					.addComponent(addDoughnut))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(10)
					.addComponent(addCaramelSyrup))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(40)
					.addComponent(addSprinkles))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(40)
					.addComponent(eatButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addGap(10)
					.addComponent(clearButton)))
		); 
		layout.setAutoCreateContainerGaps(true);
		frame.getContentPane().setLayout(layout); 
		frame.getContentPane().setBackground(mint); 
		frame.setSize(1100, 650); 
		frame.setVisible(true); 
		
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new OOSundae().displayGUI();
            }
        });
    }
	
	private static boolean ReviewQuestion() {
		double x = Math.random() * 100; 
		
		if (x >= 0 & x < 5) {
			String[] options = {"Procedural Programming", "Object Oriented Programming", "Recipe"}; 
			int answer = JOptionPane.showOptionDialog(null, "What type of programming is the following: write a piece of code to perform a specific function.", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 0) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 5 & x < 10) {
			String[] options = {"Divide Program Into Smaller Parts", "Reuse Code", "Both"}; 
			int answer = JOptionPane.showOptionDialog(null, "What are the advantages of using Object Oriented Design?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 2) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 10 & x < 15) {
			String[] options = {"Instantiation", "Class", "Property"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which of the following is the blueprint for creating an object?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 1) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 15 & x < 20) {
			String[] options = {"Object", "Class", "Constructor"}; 
			int answer = JOptionPane.showOptionDialog(null, "What is used to instantiate an object?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 2) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 20 & x < 25) {
			String[] options = {"Class", "Constructor", "Instantiation"}; 
			int answer = JOptionPane.showOptionDialog(null, "What is the initial process of creating an object called?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 2) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 25 & x < 30) {
			String[] options = {"Class", "Property", "Behavior"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which of the following tells us more about a class, what an object is really made of?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 1) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 30 & x < 35) {
			String[] options = {"Behavior", "Instantiation", "Property"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which of the following tells us the action that can be performed by an object or to an object?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 0) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 35 & x < 40) {
			String[] options = {"Instantiation", "Property", "Inheritance"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which of the following is the process where a class is derived from another class?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 2) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 40 & x < 45) {
			String[] options = {"Parent Class", "Sub Class", "Child Class"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which is of the following is the base class that further classes are derived from in inheritance?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 0) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 45 & x < 50) {
			String[] options = {"Parent Class", "Child Class", "Super Class"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which of the following is a class that is derived from another through inheritance?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 1) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 50 & x < 55) {
			String[] options = {"Super Class", "Child Class", "Parent Class"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which one of these do not belong?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 1) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 55 & x < 60) {
			String[] options = {"Child Class", "Sub Class", "Super Class"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which one of these do not belong?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 2) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 60 & x < 65) {
			String[] options = {"Inheritance/Instantiation", "Parent/Sub Class", "Public/Private"}; 
			int answer = JOptionPane.showOptionDialog(null, "When we define properties of a class which of these do we use to ensure they can/cannot be changed by another class?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 2) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 65 & x < 70) {
			String[] options = {"Class", "Public", "Private"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which of the following is used to allow an attribute to be changed outside of the class?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 1) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 70 & x < 75) {
			String[] options = {"Private", "Public", "Object"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which of the following is used to prevent an attribute from being changed outside of the class?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 0) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 75 & x < 80) {
			String[] options = {"Class Oriented Programming", "Object Oriented Programming", "Procedural Programming"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which type of programming allows code to be reused through general and sub template (recipe)?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 1) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 80 & x < 85) { 
		String[] options = {"Class Oriented Programming", "Procedural Programming", "Object Oriented Programming"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which type of programming allows for easier readability?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 2) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 85 & x < 90) {
			String[] options = {"Object Oriented Programming", "Class Oriented Programming","Procedural Programming"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which of the following allows us to divide a program into smaller parts?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 0) {
				return true; 
			} else {
				return false; 
			}
		}else if (x >= 90 & x < 95) {
			String[] options = {"Constructor", "Class", "Object"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which of the following is an instance of a class?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 2) {
				return true; 
			} else {
				return false; 
			}
		}else {
			String[] options = {"height", "wag", "weight"}; 
			int answer = JOptionPane.showOptionDialog(null, "Which of the following is a behavior?", "Review Question", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
			if(answer == 1) {
				return true; 
			} else {
				return false; 
			}
		}
		
	}
}