

import akka.actor.AbstractActor;


import java.util.*;

public class ConfigStorageActor extends AbstractActor {




                .match(ServerRequest.class, this::redirect)

                .build();




        System.out.println(data);



        int target = rnd.nextInt(data.size());


}
