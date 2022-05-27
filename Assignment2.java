package java.assignment2;

public class Assignment2 {public CompIP() {
    setBackground(new Color(200, 200, 200));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(44, 44, 344, 456);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(200, 200, 200));
    contentPane.setForeground(new Color(15, 15, 15));
    contentPane.setBorder(new EmptyBorder(7, 7, 7, 7));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    JButton btnClear = new JButton("Clear");
    btnClear.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            textIP.setText(null);
            textValue.setText(null);
        }
    });
    btnClear.setBounds(7, 200, 228, 37);
    btnClear.setFont(new Font("Calibri", Font.PLAIN, 23));
    btnClear.setBackground(new Color(187, 187, 187));
    contentPane.add(btnClear);
    JButton btnExitApp = new JButton("Exit App");
    btnExitApp.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton CompIP = new JButton("Exit");
            if (JOptionPane.showConfirmDialog(CompIP,"Confirm if
                    you want to exit","CompIP ",
                    JOptionPane.YES_NO_CANCEL_OPTION)==
                    JOptionPane.YES_NO_OPTION){
                System.exit(ABORT);
            }
        }
    });
    btnExitApp.setFont(new Font("Calibri", Font.PLAIN, 23));
    btnExitApp.setBounds(245, 230, 245, 37);
    contentPane.add(btnExitApp);
    JButton btnAdd = new JButton("+");
    btnAdd.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String IP = textIP.getText();
            double Value = Double.parseDouble(textValue.getText());
        };
    });
    btnAdd.setFont(new Font("Calibri", Font.PLAIN, 23));
    btnAdd.setBounds(9, 178, 238, 31);
    contentPane.add(btnAdd);
    JButton btnComputers = new JButton("Show Computers");
    btnComputers.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                String IP = textIP.getText(ALLBITS, ABORT);
            } catch (BadLocationException e1) {
                e1.printStackTrace();
            }
            String Value = textValue.getText();
        }
    });
    btnComputers.setFont(new Font("Calibri", Font.PLAIN, 23));
    btnComputers.setBounds(255, 198, 248, 31);
    contentPane.add(btnComputers);
    textIP = new JTextField();
    textIP.setBounds(276, 111, 216, 28);
    contentPane.add(textIP);
    textIP.setColumns(12);
    JLabel lblNewLabel = new JLabel("Value");
    lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 23));
    lblNewLabel.setBounds(8, 156, 198, 18);
    contentPane.add(lblNewLabel);
    textValue = new JTextField();
    textValue.setBounds(276, 139, 198, 18);
    contentPane.add(textValue);
    textValue.setColumns(10);
    JLabel lblNewLabel_1 = new JLabel("IPAdress");
    lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 23));
    lblNewLabel_1.setBounds(8, 97, 188, 41);
    contentPane.add(lblNewLabel_1);
    JLabel lblNewLabel_2 = new JLabel("Computer Lab");
    lblNewLabel_2.setFont(new Font("Calibrati", Font.PLAIN, 23));
    lblNewLabel_2.setBounds(209, 29, 220, 41);
    contentPane.add(lblNewLabel_2);
    JSeparator separator = new JSeparator();
    separator.setBounds(8, 81, 536, 2);
    contentPane.add(separator);
}
}