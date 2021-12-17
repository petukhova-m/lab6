





import akka.http.javadsl.ConnectHttp;














import akka.stream.javadsl.Flow;




import java.time.Duration;
import java.util.concurrent.CompletableFuture;





import static akka.actor.TypedActor.context;

public class ServerNode extends AllDirectives {


    private static ActorSystem system;







        ZooKeeper zoo = new ZooKeeper("127.0.0.1:2181", 3000, watcher);











        final CompletionStage<ServerBinding> binding = http.bindAndHandle(







    }


        return route(
                get()
        );



        return parameter("url", url ->









                                                HttpRequest.create(















                                );



}
