

import akka.actor.AbstractActor;


import java.util.*;







                .match(ServerList.class, this::saveServerList)







    private void redirect(ServerRequest request) {





