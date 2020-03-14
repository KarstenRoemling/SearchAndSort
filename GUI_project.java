/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

import java.util.*;


public class GUI_project extends JFrame {
    
    private BubbleSort testSort;

    private JMenuBar menuBar;
    private JButton bsort;
    private JComboBox comboboxCase;
    private JButton createList;
    private JButton gsort;
    private JLabel heading;
    private JButton isortb;
    private JButton isortl;
    private JLabel labelCase;
    private JLabel labelLength;
    private JLabel labelSteps;
    private JList listSorted;
    private JList listUnsorted;
    private JScrollPane scrollSorted;
    private JScrollPane scrollUnsorted;
    private JPanel panel1;
    private JButton qsort;
    private JButton ssort;
    private JTextField textfieldLength;

    //Constructor 
    public GUI_project(){
        
        testSort = new BubbleSort();

        this.setTitle("GUI_project");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));


        bsort = new JButton();
        bsort.setBounds(5,5,110,35);
        bsort.setBackground(new Color(214,217,223));
        bsort.setForeground(new Color(0,0,0));
        bsort.setEnabled(true);
        bsort.setFont(new Font("sansserif",0,12));
        bsort.setText("Bubble Sort");
        bsort.setVisible(true);
        bsort.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                doSort(0);
            }
        });

        String comboBoxList[] = {"Average Case", "Best Case", "Worst Case"};
        comboboxCase = new JComboBox(comboBoxList);
        comboboxCase.setBounds(290,20,90,35);
        comboboxCase.setBackground(new Color(214,217,223));
        comboboxCase.setForeground(new Color(0,0,0));
        comboboxCase.setEnabled(true);
        comboboxCase.setFont(new Font("sansserif",0,12));
        comboboxCase.setVisible(true);

        createList = new JButton();
        createList.setBounds(390,20,90,35);
        createList.setBackground(new Color(214,217,223));
        createList.setForeground(new Color(0,0,0));
        createList.setEnabled(true);
        createList.setFont(new Font("sansserif",0,12));
        createList.setText("Erstellen");
        createList.setVisible(true);
        
        createList.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                doCreateList();
            }
        });

        gsort = new JButton();
        gsort.setBounds(225,5,110,35);
        gsort.setBackground(new Color(214,217,223));
        gsort.setForeground(new Color(0,0,0));
        gsort.setEnabled(true);
        gsort.setFont(new Font("sansserif",0,12));
        gsort.setText("Gnome Sort");
        gsort.setVisible(true);
        gsort.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                doSort(2);
            }
        });

        heading = new JLabel();
        heading.setBounds(20,20,200,35);
        heading.setBackground(new Color(214,217,223));
        heading.setForeground(new Color(0,0,0));
        heading.setEnabled(true);
        heading.setFont(new Font("SansSerif",1,20));
        heading.setText("Sortierverfahren");
        heading.setVisible(true);

        isortb = new JButton();
        isortb.setBounds(5,40,165,35);
        isortb.setBackground(new Color(214,217,223));
        isortb.setForeground(new Color(0,0,0));
        isortb.setEnabled(true);
        isortb.setFont(new Font("sansserif",0,12));
        isortb.setText("Insertion Sort Binär");
        isortb.setVisible(true);
        isortb.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                doSort(4);
            }
        });

        isortl = new JButton();
        isortl.setBounds(170,40,165,35);
        isortl.setBackground(new Color(214,217,223));
        isortl.setForeground(new Color(0,0,0));
        isortl.setEnabled(true);
        isortl.setFont(new Font("sansserif",0,12));
        isortl.setText("Insertion Sort Linear");
        isortl.setVisible(true);
        isortl.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                doSort(5);
            }
        });

        labelCase = new JLabel();
        labelCase.setBounds(290,0,90,25);
        labelCase.setBackground(new Color(214,217,223));
        labelCase.setForeground(new Color(0,0,0));
        labelCase.setEnabled(true);
        labelCase.setFont(new Font("SansSerif",0,10));
        labelCase.setText("Fall");
        labelCase.setVisible(true);

        labelLength = new JLabel();
        labelLength.setBounds(240,0,90,25);
        labelLength.setBackground(new Color(214,217,223));
        labelLength.setForeground(new Color(0,0,0));
        labelLength.setEnabled(true);
        labelLength.setFont(new Font("SansSerif",0,10));
        labelLength.setText("Länge");
        labelLength.setVisible(true);

        labelSteps = new JLabel();
        labelSteps.setBounds(25,335,110,35);
        labelSteps.setBackground(new Color(214,217,223));
        labelSteps.setForeground(new Color(0,0,0));
        labelSteps.setEnabled(true);
        labelSteps.setFont(new Font("sansserif",0,12));
        labelSteps.setText("");
        labelSteps.setVisible(true);

        listSorted = new JList();
        listSorted.setBounds(260,75,220,150);
        listSorted.setBackground(new Color(255,255,255));
        listSorted.setForeground(new Color(0,0,0));
        listSorted.setEnabled(true);
        listSorted.setFont(new Font("sansserif",0,12));
        listSorted.setVisible(true);

        JScrollPane scrollSorted = new JScrollPane(listSorted);
        scrollSorted.setBounds(260,75,220,150);
        scrollSorted.setVisible(true);
        
        listUnsorted = new JList();
        listUnsorted.setBounds(20,75,220,150);
        listUnsorted.setBackground(new Color(255,255,255));
        listUnsorted.setForeground(new Color(0,0,0));
        listUnsorted.setEnabled(true);
        listUnsorted.setFont(new Font("sansserif",0,12));
        listUnsorted.setVisible(true);
        
        JScrollPane scrollUnsorted = new JScrollPane(listUnsorted);
        scrollUnsorted.setBounds(20,75,220,150);
        scrollUnsorted.setVisible(true);

        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(25,245,450,80);
        panel1.setBackground(new Color(192,192,192));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        qsort = new JButton();
        qsort.setBounds(115,5,110,35);
        qsort.setBackground(new Color(214,217,223));
        qsort.setForeground(new Color(0,0,0));
        qsort.setEnabled(true);
        qsort.setFont(new Font("sansserif",0,12));
        qsort.setText("Quick Sort");
        qsort.setVisible(true);
        qsort.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                doSort(1);
            }
        });

        ssort = new JButton();
        ssort.setBounds(335,5,110,35);
        ssort.setBackground(new Color(214,217,223));
        ssort.setForeground(new Color(0,0,0));
        ssort.setEnabled(true);
        ssort.setFont(new Font("sansserif",0,12));
        ssort.setText("Shaker Sort");
        ssort.setVisible(true);
        ssort.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                doSort(3);
            }
        });

        textfieldLength = new JTextField();
        textfieldLength.setBounds(240,20,40,35);
        textfieldLength.setBackground(new Color(255,255,255));
        textfieldLength.setForeground(new Color(0,0,0));
        textfieldLength.setEnabled(true);
        textfieldLength.setFont(new Font("sansserif",0,12));
        textfieldLength.setText("10");
        textfieldLength.setVisible(true);

        //adding components to contentPane panel
        panel1.add(bsort);
        contentPane.add(comboboxCase);
        contentPane.add(createList);
        panel1.add(gsort);
        contentPane.add(heading);
        panel1.add(isortb);
        panel1.add(isortl);
        contentPane.add(labelCase);
        contentPane.add(labelLength);
        contentPane.add(labelSteps);
        contentPane.add(scrollSorted);
        contentPane.add(scrollUnsorted);
        contentPane.add(panel1);
        panel1.add(qsort);
        panel1.add(ssort);
        contentPane.add(textfieldLength);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }
    
    //creates list that can be sorted
    private void doCreateList() {
        String lengthStr = textfieldLength.getText();
        try {
            int length = Integer.parseInt(lengthStr);
            testSort.LegeArrayAn(length);
        } catch (Exception e) {
            testSort.LegeArrayAn(10);
        }
        switch(comboboxCase.getSelectedIndex()) {
            case 0:
                testSort.MischeArray("averagecase");
                break;
            case 1:
                testSort.MischeArray("bestcase");
                break;
            case 2:
                testSort.MischeArray("worstcase");
                System.out.println("wc");
                break;
        }
        int[] array = testSort.getZahlenfeld();
        Integer[] arrayObj = Arrays.stream(array).boxed().toArray(Integer[]::new);
        listUnsorted.setListData(arrayObj);
        listSorted.setListData(new Object[0]);
    }
    
    private void doSort(int which) {
        int[] array = testSort.getZahlenfeld().clone();
        Sortierverfahren verfahren;
        switch(which) {
            case 0:
                verfahren = new BubbleSort();
                break;
            case 1:
                verfahren = new QuickSort();
                break;
            case 2:
                verfahren = new GnomeSort();
                break;
            case 3:
                verfahren = new ShakerSort();
                break;
            case 4:
                verfahren = new InsertionSortBinaer();
                break;
            case 5:
                verfahren = new InsertionSortLinear();
                break;
            default:
                verfahren = new BubbleSort();
                break;
        }
        verfahren.setZahlenfeld(array);
        verfahren.resetCount();
        verfahren.sort();
        labelSteps.setText("Sortierschritte: " + verfahren.getCount());
        int[] result = verfahren.getZahlenfeld();
        Integer[] arrayObj = Arrays.stream(result).boxed().toArray(Integer[]::new);
        listSorted.setListData(arrayObj);
    }


    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI_project();
            }
        });
    }

}