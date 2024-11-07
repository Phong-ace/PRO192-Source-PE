
public class Server implements Protocol{

    @Override
    public String sendMessage(String string) {
        return "65535:" + string.length() + ":" + string;
    }

    @Override
    public String receivePacket(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
