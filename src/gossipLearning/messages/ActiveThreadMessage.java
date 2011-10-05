package gossipLearning.messages;

/**
 * Usually this message is sent to ourself with a certain delay 
 * indicating that the active thread has to be alarmed later.<br/>
 * It applies the singleton design pattern. * 
 * 
 * @author Róbert Ormándi
 */
@Message
public class ActiveThreadMessage {
  private static final ActiveThreadMessage instance = new ActiveThreadMessage();
  
  private ActiveThreadMessage() {
  }
  
  public static ActiveThreadMessage getInstance() {
    return ActiveThreadMessage.instance;
  }

}
