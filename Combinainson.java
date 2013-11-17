
public class Combinaison {
    private boolean onAun1;
    private boolean onAun5;
    private boolean onAun9;
    private boolean onAun15;
    private boolean onAun25;
    private boolean onAun49;

    public Combinaison() {
        onAun1 = false;
        onAun5 = false;
        onAun9 = false;
        onAun15 = false;
        onAun25 = false;
        onAun49 = false;
    }

    public void valeurGagnante(int valeur) {

        switch(valeur){
            case 1 : onAun1 = true;
                break;
            case 5 : onAun5 = true;
                break;
            case 9 : onAun9 = true;
                break;
            case 15 : onAun15 = true;
                break;
            case 25 : onAun25 = true;
                break;
            case 49 : onAun49 = true;
                break;
        }
    }

    public boolean gagnante() {
        return onAun1 && onAun5 && onAun9 && onAun15 && onAun25 && onAun49;
    }
}

