import javax.swing.JOptionPane;
public class basicMath{

  public static void main (String args[]){

    /*Scanner keyboard = new Scanner(System.in); */
    String a;
    double aa;
    String b;
    double bb;
    String x;
    int    xx;

    a = JOptionPane.showInputDialog("Enter First Number: ");

    aa = Double.parseDouble(a);

    b = JOptionPane.showInputDialog("Enter Second Number: ");

    bb = Double.parseDouble(b);

    x = JOptionPane.showInputDialog("Enter a Number \nTo Add:          1 \nTo Subtract: 2 \nTo Multiply:   3 \nTo Divide:      4");

    xx = Integer.parseInt(x);


    if(xx == 1){
      JOptionPane.showMessageDialog(null,"Answer: "+ (aa+bb));
    }

    if(xx == 2){
      JOptionPane.showMessageDialog(null,"Answer:"+ (aa-bb));
    }

    if(xx == 3){
     JOptionPane.showMessageDialog(null,"Answer: "+ (aa*bb));
    }

    if(xx == 4){
     JOptionPane.showMessageDialog(null,"Anser: "+ (aa/bb));
    }



  }
}