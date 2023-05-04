

 
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.ScalableGame;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

 

public class SimpleGame extends StateBasedGame {
 
    public static final int MAINMENUSTATE          = 0;
    public static final int GAMEPLAYSTATE          = 1;
    public static final int OPTIONSMENUSTATE            = 2;
    public static final int PAUSEDSTATE           = 3;

    public static final int NEWGAMEMENUSTATE               =4;
    public static final int LOADGAMEMENUSTATE           =5;
    public static final int COMMANDMENUSTATE           =6;
    public static final int LEVELSELECTMENUSTATE           = 7;
    public static final int STOREMENUSTATE           = 8;

 
    public SimpleGame()
    {
        super("SHOOT_EM_UP | LordMaos");
    }
 
    public static void main(String[] args) throws SlickException
    {
         AppGameContainer app = new AppGameContainer(new ScalableGame(new SimpleGame(),800, 400, false));
 
       
         app.setDisplayMode(1000, 1000, false);
         app.setTargetFrameRate(70);
         app.setIcon("assets/icon32.png");
         app.start();
         
    }
         
         
        
 
    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException {
        this.addState(new MainMenuState(MAINMENUSTATE));
        this.addState(new GameplayState(GAMEPLAYSTATE));
        this.addState(new OptionsMenuState(OPTIONSMENUSTATE));
        this.addState(new CommandMenuState(COMMANDMENUSTATE));
        this.addState(new StoreMenuState(STOREMENUSTATE));
        this.addState(new LevelSelectMenuState(LEVELSELECTMENUSTATE));
        

    }
    
}