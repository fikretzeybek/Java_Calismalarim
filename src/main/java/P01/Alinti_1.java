package P01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Alinti_1 extends JFrame{
    /**
     This little project shows the display of elements from an arrayList
     with a dedicated checkbox for each of them to select them. The user the items to remove  and
     clicks the jButton.
     The selected items disappear.
     */
    public ArrayList<Integer> alInteger = new ArrayList<Integer>();
    public ArrayList<ContPanel> alContPanel = new ArrayList<ContPanel>();
    public JPanel mainPanel = new JPanel();
    public int widthFrame = 700;
    public int heightFrame = 600;
    public Dimension dimensionFrame = new Dimension(widthFrame, heightFrame);
    public JScrollPane jScrollPane;
    public JButton jButtonDeleteAll =  new JButton("Delete all selected items");
    public DeleteListener deleteListener = new DeleteListener();
    public ContPanel contPanel;

    public static void main(String[] args){
        Alinti_2 myMain = new Alinti_2();
    }
    public void Main(){
        frameInitialization();
        initObjects();
        buildLayout();
        setVisible(true);
    }
    public void frameInitialization(){
        this.setTitle("fenêtre de test");
        this.setSize(dimensionFrame);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addScrollPaneFrame(){
        jScrollPane = new JScrollPane(mainPanel);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(jScrollPane);
    }
    public void initObjects(){
        for ( int i = 0; i< 15;i++){
            alInteger.add(i);
            contPanel = new ContPanel(alInteger.get(i));
            alContPanel.add(contPanel);
        }
        jButtonDeleteAll.addActionListener(deleteListener);

    }
    public void buildLayout(){
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        addScrollPaneFrame();
        displayComponents();

    }
    public void refreshMainPanel(){
        clearMainPanel();
        displayComponents();
    }
    public void displayComponents() {
        fillOfContPanel();
        mainPanel.add(jButtonDeleteAll);
        setContentPane(jScrollPane);
    }
    public void clearMainPanel(){
        mainPanel.removeAll();
    }
    public void fillOfContPanel(){
        for (int i = 0; i< alInteger.size(); i++){
            mainPanel.add(alContPanel.get(i));
        }
    }
    class ContPanel extends JPanel{
        /**
         this class represents the item for a specific element of
         an arrayList with a dedicated checkbox.
         */
        public Integer integ;
        public JLabel jLabel = new JLabel();
        public JCheckBox jCheckBox = new JCheckBox();
        public ContPanel(Integer integ){
            this.integ = integ;
            jLabel.setText(this.integ.toString());
            add(jLabel);
            add(jCheckBox);
        }
    }
    class DeleteListener implements ActionListener, Runnable {
        /**
         *
         * @param actionEvent
        this class allows to remove the selected items
        and display the mainPanel after deletion.
         */
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            run();
        }
        @Override
        public void run() {
            for(int i = alContPanel.size()-1; i>= 0 ; i--){
                if(alContPanel.get(i).jCheckBox.isSelected()){
                    alInteger.remove(i);
                    alContPanel.remove(i);
                }
                refreshMainPanel();
            }
        }
    }
}
