




import java.util.*;

public class ConfigStorageActor extends AbstractActor {

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()

                .match(ServerList.class, this::saveServerList)

    }

    private void saveServerList(ServerList list) {

        System.out.println(data);

    private void redirect(ServerRequest request) {
        Random rnd = new Random();


    }
}
