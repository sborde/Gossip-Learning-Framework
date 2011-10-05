package gossipLearning.messages;

/**
 * This message class can be viewed as an extended version
 * of the {@link gossipLearning.messages.ActiveThreadMessage}.
 * It can be used when churn modeling is performed. It can
 * indentify that the active thread alarm is set in the 
 * current session or not.   
 * 
 * @author Róbert Ormándi
 */
@Message
public class OnlineSessionFollowerActiveThreadMessage {
  public final int sessionID;
  public OnlineSessionFollowerActiveThreadMessage(int sessionID) {
    this.sessionID = sessionID;
  }
}
