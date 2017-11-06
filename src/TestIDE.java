import javax.swing.*;

public class TestIDE {
    public static void main(String[] args) {


        int maximum;
        int minimum;
        int randomNum;

        maximum = 100;
        minimum = 1;
        String mittnr;

        randomNum = minimum + (int) (Math.random()*maximum);
        //minimum + (int)(Math.random() * maximum);


    int mittnum = 0;
    int ggr = 0;
        while(ggr<13){

            mittnr = JOptionPane.showInputDialog(null, "Skriv in ett nummer mellan ett och hundra din noob bich blaat");

            mittnum = Integer.parseInt(mittnr);

            if (mittnum == randomNum) {

                JOptionPane.showMessageDialog(null, "Du gissade rätt!");
                System.exit(0);


            }else if(mittnum < randomNum){
                JOptionPane.showMessageDialog(null, "För litet, gissa på ett högre nummer");

            }else if(mittnum > randomNum){

                JOptionPane.showMessageDialog(null, "För stort, gissa på ett mindre nummer");
            }
            ggr++;

        }
    }
}