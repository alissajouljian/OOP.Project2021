package Project2021;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import static java.awt.Color.MAGENTA;


public class demo2 extends JFrame implements ActionListener{

    private JLabel nameLabel;
    private JTextField nameText;
    private JLabel surnameLabel;
    private JTextField surnameText;
    private JLabel phoneLabel;
    private JTextField phoneText;
    private JLabel ageLabel;
    private  JTextField ageText;
    private JLabel movieLabel;
    private JComboBox movieBox;
    private JLabel seatLabel;
    private JTextField seatRow;
    private JTextField seatColumn;
    private JPanel panel;



Person p = new Person();
Adult adult = new Adult();
Child child = new Child();

Movie m1 = new Movie("La La Land", "Musical/Romance", 2,"Damien Chazelle");
Movie m2 = new Movie("The Sound of Music", "Musical/Romance", 3,"Robert Wise");
Movie m3 = new Movie("Les Misérables"," Musical/Romance", 3, "Tom Hooper");
Movie m4 = new Movie("Annie", "Musical/Family", 2, "Will Gluck");


     public demo2(){
    super("booking system");
       //  JFrame frame = new JFrame("Booking System");
         panel = new JPanel();

        setSize(640, 600);
         panel.setBackground(MAGENTA);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         BookingSystem();
         movieinformation();

         add(panel);
        setVisible(true);



     }



    public void BookingSystem() {
         // name
         nameLabel = new JLabel("Username");
         nameLabel.setBounds(10, 20, 80, 25);
         panel.add(nameLabel, BorderLayout.WEST);

         nameText = new JTextField(20);
         nameText.setBounds(100, 20, 165, 25);
         panel.add(nameText, BorderLayout.WEST);


         // surename
         surnameLabel = new JLabel("Surname");
         surnameLabel.setBounds(10, 40, 80, 25);
         panel.add(surnameLabel,BorderLayout.WEST );

         surnameText = new JTextField(20);
         surnameText.setBounds(100, 40, 165, 25);
         panel.add(surnameText, BorderLayout.WEST);
         // phone number
         phoneLabel = new JLabel("Phone Number");
         phoneLabel.setBounds(10, 60, 80, 25);
         panel.add(phoneLabel, BorderLayout.WEST);

         phoneText = new JTextField(20);
         phoneText.setBounds(100, 60, 165, 25);
         panel.add(phoneText, BorderLayout.WEST);

         // age
         ageLabel = new JLabel("Age");
         ageLabel.setBounds(10, 80, 80, 25);
         panel.add(ageLabel,BorderLayout.WEST );

         ageText = new JTextField(20);
         ageText.setBounds(100, 80, 165, 25);
         panel.add(ageText,BorderLayout.WEST );


         //  Movie
         movieLabel = new JLabel("Movie");
         movieLabel.setBounds(10, 100, 80, 25);
         panel.add(movieLabel, BorderLayout.WEST);

         String[] movieList = {m1.getTitle(), m2.getTitle(), m3.getTitle(), m4.getTitle()};
         movieBox = new JComboBox(movieList);
         movieBox.setBounds(100, 100, 165, 25);
         panel.add(movieBox, BorderLayout.WEST);


         // Seats
         seatLabel = new JLabel("Seats");
         seatLabel.setBounds(10, 120, 80, 25);
         panel.add(seatLabel, BorderLayout.WEST);

         seatRow = new JTextField(5);
         seatColumn = new JTextField(5);
         seatRow.setBounds(100, 120, 165, 25);
         seatColumn.setBounds(110, 120, 165, 25);
         panel.add(seatRow,BorderLayout.WEST );
         panel.add(seatColumn, BorderLayout.WEST);

        JButton button = new  JButton("Save");









        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int age=0;
                try{
                    
               age = Integer.parseInt(ageText.getText());
                    
                }catch(NumberFormatException w){
                        JOptionPane.showMessageDialog(panel,"Please Input An Integer" ,"ERROR", JOptionPane.ERROR_MESSAGE);
                         return;
                    }

                if (e.getSource() == button) {
                    if (age < 18) {
                        JOptionPane.showMessageDialog(panel,  "Price is" + child.price(), "Final Price", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(panel, " Price is " + adult.price(), "Final Price", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            }



        };

        JButton button1 = new  JButton("Book");


        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==button1){
                    int seatC=0;
                    try {
                         seatC = Integer.parseInt(seatColumn.getText());

                    } catch(NumberFormatException w){
                        JOptionPane.showMessageDialog(panel,"Please Input Integer" ,"ERROR", JOptionPane.ERROR_MESSAGE);
                         return;
                    }
                    String seatR = seatRow.getText();
                    Seats s = new Seats(seatR, seatC, true);
                    //System.out.println("Successfully booked" + "  Column  " + s.getColumn() + " Row " + s.getRow());
                    JOptionPane.showMessageDialog(panel,  "The booked seat is "+ s.getLabel() + "\n" + "Thank you""Booked", JOptionPane.INFORMATION_MESSAGE);

                }}

        };


        button.addActionListener(listener);
        button.setBounds(100, 200, 180, 30);
        panel.add(button);


        button1.addActionListener(listener1);
        button1.setBounds(110, 200, 180, 30);
        panel.add(button1);




        setVisible(true);





     }




    @Override
    public void actionPerformed(ActionEvent e) {

    }






    public void movieinformation(){


     String[] columnNamnes= {"Title", "Genere", "Duration", "Director"};

     String[][] data ={
             {m1.getTitle(), m1.getGenere(), String.valueOf(m1.getduration()), m1.getDirector()},
             {m2.getTitle(), m2.getGenere(), String.valueOf(m2.getduration()), m2.getDirector()},
             {m3.getTitle(), m3.getGenere(), String.valueOf(m3.getduration()), m3.getDirector()},
             {m4.getTitle(), m4.getGenere(), String.valueOf(m3.getduration()), m3.getDirector()}
     };


        JTable table = new JTable(data, columnNamnes);
        table.setPreferredScrollableViewportSize(new Dimension(700,800));
        table.setFillsViewportHeight(true);
        panel.add(table);
       setVisible(true);


    }
}




