package zkanonymizer;





import akka.http.javadsl.ConnectHttp;

import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.marshalling.Marshaller;



import akka.http.javadsl.model.StatusCode;

import akka.http.javadsl.server.AllDirectives;





import akka.stream.javadsl.Flow;



import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;




import static akka.pattern.PatternsCS.pipe;
import static akka.actor.TypedActor.context;

public class ServerNode extends AllDirectives {


    private static ActorSystem system;



        system = ActorSystem.create("routes");



        ZooKeeper zoo = new ZooKeeper("127.0.0.1:2181", 3000, watcher);


                port.toString().getBytes(),








        final CompletionStage<ServerBinding> binding = http.bindAndHandle(







    }

    private Route createRoute(ActorSystem system) {
        return route(
                get()
        );


    private Route get() {
        return parameter("url", url ->








                                        http.singleRequest(
                                                HttpRequest.create(

                                                            Integer.parseInt(













                                );



}
