package Classes.Encapsulation.Challenge;

public class Printer {
    private int tonerLevel = 100;
    private int noOfPagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, int noOfPagesPrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.noOfPagesPrinted = noOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void fillTheToner(int procentLevel){
        this.tonerLevel += procentLevel;
        if(tonerLevel >= 100){
            this.tonerLevel = 100;
        }
    }

    public void printPage(int pages){
        this.noOfPagesPrinted += pages;
    }
}
