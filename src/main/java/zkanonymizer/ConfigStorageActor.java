

import akka.actor.AbstractActor;


import java.util.*;



    @Override


                .match(ServerRequest.class, this::redirect)
                .match(ServerList.class, this::saveServerList)
                .build();




        System.out.println(data);



        int target = rnd.nextInt(data.size());


}
