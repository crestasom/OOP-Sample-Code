package gui;
/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class CheckBoxDemo extends JFrame implements ItemListener {
	JCheckBox chinButton;
	JCheckBox glassesButton;
	JCheckBox hairButton;
	JCheckBox teethButton;

	StringBuffer choices;
	JLabel pictureLabel;

	public CheckBoxDemo() {

		// Create the check boxes.
		chinButton = new JCheckBox("Chin");
		chinButton.setMnemonic(KeyEvent.VK_C);
		chinButton.setSelected(true);

		glassesButton = new JCheckBox("Glasses");
		glassesButton.setMnemonic(KeyEvent.VK_G);
		glassesButton.setSelected(true);

		hairButton = new JCheckBox("Hair");
		hairButton.setMnemonic(KeyEvent.VK_H);
		hairButton.setSelected(true);

		teethButton = new JCheckBox("Teeth");
		teethButton.setMnemonic(KeyEvent.VK_T);
		teethButton.setSelected(true);

		// Register a listener for the check boxes.
		chinButton.addItemListener(this);
		glassesButton.addItemListener(this);
		hairButton.addItemListener(this);
		teethButton.addItemListener(this);

		// Put the check boxes in a column in a panel
		JPanel checkPanel = new JPanel(new GridLayout(1, 1));
		checkPanel.add(chinButton);
		checkPanel.add(glassesButton);
		checkPanel.add(hairButton);
		checkPanel.add(teethButton);
		chinButton.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	
		
		add(checkPanel, BorderLayout.LINE_START);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	/** Listens to the check boxes. */
	public void itemStateChanged(ItemEvent e) {

		Object source = e.getSource();

		if (source == chinButton) {
			System.out.println("Chin Button Selected/Unselected");
		} else if (source == glassesButton) {
			System.out.println("Glasses Button Selected/Unselected");
		} else if (source == hairButton) {
			System.out.println("Hair Button Selected/Unselected");
		} else if (source == teethButton) {
			System.out.println("Teeth Button Selected/Unselected");
		}

	}

	
	public static void main(String[] args) {
		new CheckBoxDemo();
	}
}