package tk.nekotech.cah.bots;

import java.io.IOException;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;
import org.pircbotx.exception.NickAlreadyInUseException;
import tk.nekotech.cah.CardsAgainstHumanity;

public class MasterBot extends PircBotX {

    String version = "1.0-SNAPSHOT";
    CardsAgainstHumanity cah;

    public MasterBot(final String nick) throws NickAlreadyInUseException, IOException, IrcException {
        this.setAutoNickChange(true);
        this.setMessageDelay(500);
        this.setFinger("Cards Against Humanity bot. " + this.version);
        this.setLogin("cah");
        this.setName(nick);
        this.setVersion("Cards Against Humanity bot. Version " + this.version);
        System.out.println(nick + " is connecting!");
        //this.setVerbose(true);
        this.connect(cah.IRC_IP);
        this.joinChannel(cah.CHANNEL);
    }

    public String getCAHVersion() {
        return this.version;
    }
}
