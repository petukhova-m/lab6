




















import akka.stream.javadsl.Flow;











import static akka.actor.TypedActor.context;

public class ServerNode extends AllDirectives {










        ZooKeeper zoo = new ZooKeeper("127.0.0.1:2181", 3000, watcher);











        final CompletionStage<ServerBinding> binding = http.bindAndHandle(











                get()




        return parameter("url", url ->









                                                HttpRequest.create(















                                );



}
