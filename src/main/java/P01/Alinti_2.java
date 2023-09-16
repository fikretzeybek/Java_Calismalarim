package P01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Alinti_2 extends JFrame{
    public ArrayList<Integer> alInteger = new ArrayList<Integer>();
    public ArrayList<ContPanel> alContPanel = new ArrayList<ContPanel>();
    public JPanel mainPanel = new JPanel();
    public int widthFrame = 700;
    public int heightFrame = 120;
    public Dimension dimensionFrame = new Dimension(widthFrame, heightFrame);
    public JScrollPane jScrollPane;
    public JButton jButtonDeleteAll =  new JButton();
    public DeleteListener deleteListener = new DeleteListener();
    public ContPanel contPanel;

    public static void main(String[] args){
        Alinti_2 myMain = new Alinti_2();
    }
    public Alinti_2(){
        frameInitialization();
        setBackground(Color.BLUE);
        mainPanel.setBackground(Color.red);
        initObjects();
        buildLayout();
        setVisible(true);
    }
    public void frameInitialization(){
        this.setTitle("fenêtre de test");
        this.setSize(dimensionFrame);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addScrollPaneFrame();
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
            contPanel.setBackground(Color.green);
            alContPanel.add(contPanel);
        }
        jButtonDeleteAll.addActionListener(deleteListener);

    }
    public void buildLayout(){
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        jScrollPane.add(mainPanel);
        fillOfContPanel();
        setContentPane(jScrollPane);

    }
    public void fillOfContPanel(){
        for (int i = 0; i< alInteger.size(); i++){
            mainPanel.add(alContPanel.get(i));
        }
    }
    class ContPanel extends JPanel{
        public Integer integ;
        public JLabel jLabel = new JLabel();
        public JCheckBox jCheckBox = new JCheckBox();
        public ContPanel(Integer integ){
            setBackground(Color.BLACK);
            this.integ = integ;
            jLabel.setText(this.integ.toString());
            add(jLabel);
            add(jCheckBox);
        }
    }
    class DeleteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            mainPanel = new JPanel();
            for(int i = alContPanel.size()-1; i>= 0 ; i--){
                if(alContPanel.get(i).jCheckBox.isSelected()){
                    alInteger.remove(i);
                    alContPanel.remove(i);
                }
            }
        }
    }
}
