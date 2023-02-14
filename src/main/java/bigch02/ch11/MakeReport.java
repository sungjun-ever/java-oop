package bigch02.ch11;

public class MakeReport {
    StringBuffer buffer = new StringBuffer();

    final private String line = "===========================================\n";
    final private String title = " 이름\t   주소 \t\t  전화번호    \n";

    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-0000-0000\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t\t");
        buffer.append("010-1111-1111\n");
    }

    private void makeFooter(){
        buffer.append(line);
    }

    public String getReport(){
        makeHeader();
        generateBody();;
        makeFooter();
        return buffer.toString();
    }
}
