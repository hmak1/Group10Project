import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class GameBoard {
	
	// this panel will hold the board
	private static JPanel boardPanel = new JPanel();
	// this panel will hold the arrows to drop pieces into columns
	private static JPanel placementPanel = new JPanel();
	// this panel will be the container for the arrow panel and board panel
	private static JPanel combinedPanel = new JPanel();
	// number is bottom left to top right (place 00 = top left corner)
	private static Component p00 = new DrawCircle();
	private static Component p01 = new DrawCircle();
	private static Component p02 = new DrawCircle();
	private static Component p03 = new DrawCircle();
	private static Component p04 = new DrawCircle();
	private static Component p05 = new DrawCircle();
	private static Component p06 = new DrawCircle();
	private static Component p07 = new DrawCircle();
	private static Component p08 = new DrawCircle();
	private static Component p09 = new DrawCircle();
	private static Component p10 = new DrawCircle();
	private static Component p11 = new DrawCircle();
	private static Component p12 = new DrawCircle();
	private static Component p13 = new DrawCircle();
	private static Component p14 = new DrawCircle();
	private static Component p15 = new DrawCircle();
	private static Component p16 = new DrawCircle();
	private static Component p17 = new DrawCircle();
	private static Component p18 = new DrawCircle();
	private static Component p19 = new DrawCircle();
	private static Component p20 = new DrawCircle();
	private static Component p21 = new DrawCircle();
	private static Component p22 = new DrawCircle();
	private static Component p23 = new DrawCircle();
	private static Component p24 = new DrawCircle();
	private static Component p25 = new DrawCircle();
	private static Component p26 = new DrawCircle();
	private static Component p27 = new DrawCircle();
	private static Component p28 = new DrawCircle();
	private static Component p29 = new DrawCircle();
	private static Component p30 = new DrawCircle();
	private static Component p31 = new DrawCircle();
	private static Component p32 = new DrawCircle();
	private static Component p33 = new DrawCircle();
	private static Component p34 = new DrawCircle();
	private static Component p35 = new DrawCircle();
	// filled version of each slot on board
	private static Component f00 = new FillCircle();
	private static Component f01 = new FillCircle();
	private static Component f02 = new FillCircle();
	private static Component f03 = new FillCircle();
	private static Component f04 = new FillCircle();
	private static Component f05 = new FillCircle();
	private static Component f06 = new FillCircle();
	private static Component f07 = new FillCircle();
	private static Component f08 = new FillCircle();
	private static Component f09 = new FillCircle();
	private static Component f10 = new FillCircle();
	private static Component f11 = new FillCircle();
	private static Component f12 = new FillCircle();
	private static Component f13 = new FillCircle();
	private static Component f14 = new FillCircle();
	private static Component f15 = new FillCircle();
	private static Component f16 = new FillCircle();
	private static Component f17 = new FillCircle();
	private static Component f18 = new FillCircle();
	private static Component f19 = new FillCircle();
	private static Component f20 = new FillCircle();
	private static Component f21 = new FillCircle();
	private static Component f22 = new FillCircle();
	private static Component f23 = new FillCircle();
	private static Component f24 = new FillCircle();
	private static Component f25 = new FillCircle();
	private static Component f26 = new FillCircle();
	private static Component f27 = new FillCircle();
	private static Component f28 = new FillCircle();
	private static Component f29 = new FillCircle();
	private static Component f30 = new FillCircle();
	private static Component f31 = new FillCircle();
	private static Component f32 = new FillCircle();
	private static Component f33 = new FillCircle();
	private static Component f34 = new FillCircle();
	private static Component f35 = new FillCircle();
	// buttons will be displayed as arrows to indicate which column to drop a game piece
	private static JButton c0 = new JButton();
	private static JButton c1 = new JButton();
	private static JButton c2 = new JButton();
	private static JButton c3 = new JButton();
	private static JButton c4 = new JButton();
	private static JButton c5 = new JButton();
	// Counter for which place on board should be filled
	public static int place = -1;
	// Counter for indicating who's turn it is (odd is Player 1, even is Player 2)
	public static int playerCounter = 1;
	
	static Border b = BorderFactory.createLineBorder(Color.BLACK, 5);	
	
	//create board with size dependent on user input
	public GameBoard(int sizeOfBoard) {
		clearPanel();

		combinedPanel.setLayout(new BorderLayout());
		boardPanel.setBorder(b);
		boardPanel.setBackground(Color.BLACK);
		boardPanel.setLayout(new GridLayout(6, 6));
		placementPanel.setLayout(new GridLayout(1, 6));
		placementPanel.setPreferredSize(new Dimension(100, 100));
		// always add the basic 6x6, then decide if more need to be added
		// create header with arrow selection for piece drop
		c0.add(new DrawArrow());
		c1.add(new DrawArrow());
		c2.add(new DrawArrow());
		c3.add(new DrawArrow());
		c4.add(new DrawArrow());
		c5.add(new DrawArrow());
		c0.setBackground(Color.BLACK);
		c1.setBackground(Color.BLACK);
		c2.setBackground(Color.BLACK);
		c3.setBackground(Color.BLACK);
		c4.setBackground(Color.BLACK);
		c5.setBackground(Color.BLACK);
		placementPanel.add(c0);
		placementPanel.add(c1);
		placementPanel.add(c2);
		placementPanel.add(c3);
		placementPanel.add(c4);
		placementPanel.add(c5);
		boardPanel.add(p00);
		boardPanel.add(p01);
		boardPanel.add(p02);
		boardPanel.add(p03);
		boardPanel.add(p04);
		boardPanel.add(p05);
		boardPanel.add(p06);
		boardPanel.add(p07);
		boardPanel.add(p08);
		boardPanel.add(p09);
		boardPanel.add(p10);
		boardPanel.add(p11);
		boardPanel.add(p12);
		boardPanel.add(p13);
		boardPanel.add(p14);
		boardPanel.add(p15);
		boardPanel.add(p16);
		boardPanel.add(p17);
		boardPanel.add(p18);
		boardPanel.add(p19);
		boardPanel.add(p20);
		boardPanel.add(p21);
		boardPanel.add(p22);
		boardPanel.add(p23);
		boardPanel.add(p24);
		boardPanel.add(p25);
		boardPanel.add(p26);
		boardPanel.add(p27);
		boardPanel.add(p28);
		boardPanel.add(p29);
		boardPanel.add(p30);
		boardPanel.add(p31);
		boardPanel.add(p32);
		boardPanel.add(p33);
		boardPanel.add(p34);
		boardPanel.add(p35);
		
		// Allows pieces to be placed in columns
		c0.addActionListener(new ButtonListener());
		c1.addActionListener(new ButtonListener());
		c2.addActionListener(new ButtonListener());
		c3.addActionListener(new ButtonListener());
		c4.addActionListener(new ButtonListener());
		c5.addActionListener(new ButtonListener());
		
		// determine if board needs to be expanded
		switch (sizeOfBoard) {
			case 6: 
				// add panels to master panel
				combinedPanel.add(placementPanel, BorderLayout.NORTH);
				combinedPanel.add(boardPanel, BorderLayout.CENTER);
				break;
			case 9: 
				// create header with arrow selection for piece drop
				/*c0.add(new DrawArrow());
				c1.add(new DrawArrow());
				c2.add(new DrawArrow());
				c3.add(new DrawArrow());
				c4.add(new DrawArrow());
				c5.add(new DrawArrow());
				placementPanel.add(c0);
				placementPanel.add(c1);
				placementPanel.add(c2);
				placementPanel.add(c3);
				placementPanel.add(c4);
				placementPanel.add(c5);
				boardPanel.add(p00);
				boardPanel.add(p01);
				boardPanel.add(p02);
				boardPanel.add(p03);
				boardPanel.add(p04);
				boardPanel.add(p05);*/
				combinedPanel.add(placementPanel, BorderLayout.NORTH);
				combinedPanel.add(boardPanel);
				break;
			case 12:
				// create header with arrow selection for piece drop
				/*c0.add(new DrawArrow());
				c1.add(new DrawArrow());
				c2.add(new DrawArrow());
				c3.add(new DrawArrow());
				c4.add(new DrawArrow());
				c5.add(new DrawArrow());
				placementPanel.add(c0);
				placementPanel.add(c1);
				placementPanel.add(c2);
				placementPanel.add(c3);
				placementPanel.add(c4);
				placementPanel.add(c5);
				boardPanel.add(p00);
				boardPanel.add(p01);
				boardPanel.add(p02);
				boardPanel.add(p03);
				boardPanel.add(p04);
				boardPanel.add(p05);*/
				combinedPanel.add(placementPanel, BorderLayout.NORTH);
				combinedPanel.add(boardPanel, BorderLayout.CENTER);
				break;
			default:
					break;
		}
	}
	
	public JPanel getPanel() {
		return combinedPanel;
	}
	
	public void clearPanel() {
		boardPanel.removeAll();
		placementPanel.removeAll();
		combinedPanel.removeAll();
	}
	
	public static Color pieceColor;

    static class ButtonListener implements ActionListener {
   	     	
      	public void actionPerformed(ActionEvent e) {
      		// set color of piece to be placed based on who's turn it is
      		if (playerCounter%2 == 0) {
      			// then it is player 2's turn and turn color to p2Color
      			pieceColor = CFour.p2Color;
      		} else {
      			// then it is player 1's turn and turn color to p1Color
      			pieceColor = CFour.p1Color;
      		}
      		
      		if (CFour.p1Color != null && CFour.p2Color != null) {
      			if (e.getSource().equals(c0) && boardPanel.getComponent(0).equals(f00) ||
     					e.getSource().equals(c1) && boardPanel.getComponent(1).equals(f01) ||
     					e.getSource().equals(c2) && boardPanel.getComponent(2).equals(f02) ||
     					e.getSource().equals(c3) && boardPanel.getComponent(3).equals(f03) ||
     					e.getSource().equals(c4) && boardPanel.getComponent(4).equals(f04) ||
     					e.getSource().equals(c5) && boardPanel.getComponent(5).equals(f05)) {
     				JOptionPane.showMessageDialog(null, "This Column is full. Please select another.");
      				
      				//System.out.print("\n This Column is full. Please select another.\n\n" + 
     					//boardArray());
     			} else {
     				if (e.getSource().equals(c0)) {
             			if (boardPanel.getComponent(30).equals(p30)) {
             				boardPanel.remove(p30);
             				f30.setForeground(pieceColor);
                 			boardPanel.add(f30, 30);
             			} else if (boardPanel.getComponent(24).equals(p24)) {
             				boardPanel.remove(p24);
             				f24.setForeground(pieceColor);
                 			boardPanel.add(f24, 24);
             			} else if (boardPanel.getComponent(18).equals(p18)) {
             				boardPanel.remove(p18);
             				f18.setForeground(pieceColor);
             				boardPanel.add(f18, 18);
             			} else if (boardPanel.getComponent(12).equals(p12)) {
             				boardPanel.remove(p12);
             				f12.setForeground(pieceColor);
             				boardPanel.add(f12, 12);
             			} else if (boardPanel.getComponent(6).equals(p06)) {
             				boardPanel.remove(p06);
             				f06.setForeground(pieceColor);
                 			boardPanel.add(f06, 6);
             			} else if (boardPanel.getComponent(0).equals(p00)) {
             				boardPanel.remove(p00);
             				f00.setForeground(pieceColor);
                 			boardPanel.add(f00, 0);
             			} 
             		} else if (e.getSource().equals(c1)) {
             			if (boardPanel.getComponent(31).equals(p31)) {
             				boardPanel.remove(p31);
             				f31.setForeground(pieceColor);
                 			boardPanel.add(f31, 31);
             			} else if (boardPanel.getComponent(25).equals(p25)) {
             				boardPanel.remove(p25);
             				f25.setForeground(pieceColor);
                 			boardPanel.add(f25, 25);
             			} else if (boardPanel.getComponent(19).equals(p19)) {
             				boardPanel.remove(p19);
             				f19.setForeground(pieceColor);
                 			boardPanel.add(f19, 19);
             			} else if (boardPanel.getComponent(13).equals(p13)) {
             				boardPanel.remove(p13);
             				f13.setForeground(pieceColor);
                 			boardPanel.add(f13, 13);
             			} else if (boardPanel.getComponent(7).equals(p07)) {
             				boardPanel.remove(p07);
             				f07.setForeground(pieceColor);
                 			boardPanel.add(f07, 7);
             			} else if (boardPanel.getComponent(1).equals(p01)) {
             				boardPanel.remove(p01);
             				f01.setForeground(pieceColor);
                 			boardPanel.add(f01, 1);
             			} 
             		} else if (e.getSource().equals(c2)) {
             			if (boardPanel.getComponent(32).equals(p32)) {
             				boardPanel.remove(p32);
             				f32.setForeground(pieceColor);
                 			boardPanel.add(f32, 32);
             			} else if (boardPanel.getComponent(26).equals(p26)) {
             				boardPanel.remove(p26);
             				f26.setForeground(pieceColor);
                 			boardPanel.add(f26, 26);
             			} else if (boardPanel.getComponent(20).equals(p20)) {
             				boardPanel.remove(p20);
             				f20.setForeground(pieceColor);
                 			boardPanel.add(f20, 20);
             			} else if (boardPanel.getComponent(14).equals(p14)) {
             				boardPanel.remove(p14);
             				f14.setForeground(pieceColor);
                 			boardPanel.add(f14, 14);
             			} else if (boardPanel.getComponent(8).equals(p08)) {
             				boardPanel.remove(p08);
             				f08.setForeground(pieceColor);
                 			boardPanel.add(f08, 8);
             			} else if (boardPanel.getComponent(2).equals(p02)) {
             				boardPanel.remove(p02);
             				f02.setForeground(pieceColor);
                 			boardPanel.add(f02, 2);
             			} 
             		} else if (e.getSource().equals(c3)) {
             			if (boardPanel.getComponent(33).equals(p33)) {
             				boardPanel.remove(p33);
             				f33.setForeground(pieceColor);
                 			boardPanel.add(f33, 33);
             			} else if (boardPanel.getComponent(27).equals(p27)) {
             				boardPanel.remove(p27);
             				f27.setForeground(pieceColor);
                 			boardPanel.add(f27, 27);
             			} else if (boardPanel.getComponent(21).equals(p21)) {
             				boardPanel.remove(p21);
             				f21.setForeground(pieceColor);
             				boardPanel.add(f21, 21);
             			} else if (boardPanel.getComponent(15).equals(p15)) {
             				boardPanel.remove(p15);
             				f15.setForeground(pieceColor);
             				boardPanel.add(f15, 15);
             			} else if (boardPanel.getComponent(9).equals(p09)) {
             				boardPanel.remove(p09);
             				f09.setForeground(pieceColor);
             				boardPanel.add(f09, 9);
             			} else if (boardPanel.getComponent(3).equals(p03)) {
             				boardPanel.remove(p03);
             				f03.setForeground(pieceColor);
             				boardPanel.add(f03, 3);
             			} 
             		} else if (e.getSource().equals(c4)) {
             			if (boardPanel.getComponent(34).equals(p34)) {
             				boardPanel.remove(p34);
             				f34.setForeground(pieceColor);
                 			boardPanel.add(f34, 34);
             			} else if (boardPanel.getComponent(28).equals(p28)) {
             				boardPanel.remove(p28);
             				f28.setForeground(pieceColor);
                 			boardPanel.add(f28, 28);
             			} else if (boardPanel.getComponent(22).equals(p22)) {
             				boardPanel.remove(p22);
             				f22.setForeground(pieceColor);
                 			boardPanel.add(f22, 22);
             			} else if (boardPanel.getComponent(16).equals(p16)) {
             				boardPanel.remove(p16);
             				f16.setForeground(pieceColor);
                 			boardPanel.add(f16, 16);
             			} else if (boardPanel.getComponent(10).equals(p10)) {
             				boardPanel.remove(p10);
             				f10.setForeground(pieceColor);
                 			boardPanel.add(f10, 10);
             			} else if (boardPanel.getComponent(4).equals(p04)) {
             				boardPanel.remove(p04);
             				f04.setForeground(pieceColor);
                 			boardPanel.add(f04, 4);
             			} 
             		} else if (e.getSource().equals(c5)) {
             			if (boardPanel.getComponent(35).equals(p35)) {
             				boardPanel.remove(p35);
             				f35.setForeground(pieceColor);
                 			boardPanel.add(f35, 35);
             			} else if (boardPanel.getComponent(29).equals(p29)) {
             				boardPanel.remove(p29);
             				f29.setForeground(pieceColor);
                 			boardPanel.add(f29, 29);
             			} else if (boardPanel.getComponent(23).equals(p23)) {
             				boardPanel.remove(p23);
             				f23.setForeground(pieceColor);
                 			boardPanel.add(f23, 23);
             			} else if (boardPanel.getComponent(17).equals(p17)) {
             				boardPanel.remove(p17);
             				f17.setForeground(pieceColor);
                 			boardPanel.add(f17, 17);
             			} else if (boardPanel.getComponent(11).equals(p11)) {
             				boardPanel.remove(p11);
             				f11.setForeground(pieceColor);
                 			boardPanel.add(f11, 11);
             			} else if (boardPanel.getComponent(5).equals(p05)) {
             				boardPanel.remove(p05);
             				f05.setForeground(pieceColor);
                 			boardPanel.add(f05, 5);
             			} 
             		}
     				// increments only if the column selected is not full
             		playerCounter++;
         			boardPanel.revalidate();
         			boardPanel.repaint();
         		} 
      		}
 			if (isWinningPlay() == true) {
 				// Disable additional plays if someone has won
 				c0.setEnabled(false);
 				c1.setEnabled(false);
 				c2.setEnabled(false);
 				c3.setEnabled(false);
 				c4.setEnabled(false);
 				c5.setEnabled(false);
 				//System.out.print("\n\n\t WINNER WINNER CHICKEN DINNER");
 			}
	    }
     }

    
    public static String boardArray() {    	
    	String arrayComponentList = "Start: \n";
    	int countComponent = 0;
    	
    	for (Component c: boardPanel.getComponents()) {
    		arrayComponentList += "\t" + countComponent + ": " + c.getForeground().getRGB();
    		
    		if (countComponent == 5 || countComponent==11 || countComponent==17 ||
    				 countComponent==23 || countComponent==29) {
    			arrayComponentList += "\n";
    		}
    		countComponent++;
    	}
    	return arrayComponentList;
    }
    
    public static boolean isWinningPlay() {
    	boolean isWinner = false;
    	Component[][] colorArray = new Component[6][6];
    	int rowCount = 0, columnCount = 0, dCounter = 0;
    	
    	// build 2D array of colors on board
    	for (Component comp: boardPanel.getComponents()) {
    		if (columnCount == 6) {
    			rowCount++;
    			columnCount = 0;
    		}
    		colorArray[rowCount][columnCount] = comp;
    		columnCount++;
    	}
    	/*// will display the array of color values in RGB ID
    	for (Component c[]: colorArray) {
    		dCounter = 0;
    		while (dCounter < 6) {
            	System.out.print("\t" + c[dCounter].getForeground().getRGB());
            	dCounter++;
    		}
    		System.out.print("\n");
    	}*/
    	
    	if (checkHorizontal(colorArray) == true || 
    			checkVeritcal(colorArray) == true ||
    			checkDiagonalAscending(colorArray) == true ||
    			checkDiagonalDescending(colorArray) == true) {
    		isWinner = true;
    	}
		return isWinner;
    }
    
    public static boolean checkHorizontal(Component[][] c) {
		int inARow = 0, counter = 0;
		boolean hWinner = false;
		
    	for (Component e[]: c) {
    		while (counter < 6) {
    			try {
    				// see if the rows have matching colors next to each other that are not black (-13421773)
        			if (e[counter].getForeground().getRGB() == e[counter+1].getForeground().getRGB() && 
        					e[counter].getForeground().getRGB() != -13421773) {
        				inARow++;
        				if (inARow == 3) {
        					hWinner = true;
        		   			JOptionPane.showMessageDialog(null, "HORIZONTAL WIN");
        				}
        			} else inARow = 0;
        		} catch (IndexOutOfBoundsException out) { break; }
    			counter++;
    		}
			counter = 0;		// reset counter at end of each row
			
    	}
    	return hWinner;
    }
    
    public static boolean checkVeritcal(Component[][] c) {
		int inARow = 0, rCounter = 0, cCounter = 0;
		boolean vWinner = false;

		while (cCounter < 6) {
			while (rCounter < 6) {
	   			try {
	   				// see if the columns have matching colors next to each other that are not black (-13421773)
	       			if (c[rCounter][cCounter].getForeground().getRGB() == 
	       					c[rCounter+1][cCounter].getForeground().getRGB() && 
	       					c[rCounter][cCounter].getForeground().getRGB() != -13421773) {
	       				inARow++;
	       				if (inARow == 3) {
	       		   			vWinner = true;
	       		   			JOptionPane.showMessageDialog(null, "VERTICAL WIN");
	       		   			break;
	       		   		}
	       			} else inARow = 0;
	       		} catch (IndexOutOfBoundsException out) { break; }
	   			rCounter++;
	   		}
	   		cCounter++;
		}
    	return vWinner;
    }
    
    // checks for four-in-a-row from bottom left to top right
    public static boolean checkDiagonalAscending(Component[][] c) {
    	int inARow = 0, rCounter = 0, cCounter = 0;
		boolean aWinner = false;

		while (cCounter < 6) {
			while (rCounter < 6) {
	   			try {
	   				// see if the columns have matching colors next to each other that are not black (-13421773)
	       			if (c[rCounter][cCounter].getForeground().getRGB() == 
	       					c[rCounter-1][cCounter+1].getForeground().getRGB() && 
	       					c[rCounter][cCounter].getForeground().getRGB() != -13421773) {
	       				inARow++;
	       				if (inARow == 3) {
	       		   			aWinner = true;
	       		   			//JOptionPane.showMessageDialog(null, "VERTICAL WIN");
	       		   			break;
	       		   		}
	       			} else inARow = 0;
	       		} catch (IndexOutOfBoundsException out) { break; }
	   			rCounter++;
	   		}
	   		cCounter++;
		}
    	return aWinner;
    }

    // checks for four-in-a-row from top left to bottom right
    public static boolean checkDiagonalDescending(Component[][] c) {
    	int inARow = 0, rCounter = 0, cCounter = 0;
		boolean dWinner = false;

		while (cCounter < 6) {
			while (rCounter < 6) {
	   			try {
	   				// see if the columns have matching colors next to each other that are not black (-13421773)
	       			if (c[rCounter][cCounter].getForeground().getRGB() == 
	       					c[rCounter+1][cCounter+1].getForeground().getRGB() && 
	       					c[rCounter][cCounter].getForeground().getRGB() != -13421773) {
	       				inARow++;
	       				if (inARow == 3) {
	       		   			dWinner = true;
	       		   			//JOptionPane.showMessageDialog(null, "VERTICAL WIN");
	       		   			break;
	       		   		}
	       			} else inARow = 0;
	       		} catch (IndexOutOfBoundsException out) { break; }
	   			rCounter++;
	   		}
	   		cCounter++;
		}
    	return dWinner;
    }
}










