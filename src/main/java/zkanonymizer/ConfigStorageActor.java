




import java.util.*;

public class ConfigStorageActor extends AbstractActor {
    private ArrayList<String> data = new ArrayList<>();


        return ReceiveBuilder.create()



    }





    private void redirect(ServerRequest request) {


        sender().tell(data.get(target), getSelf());

}
