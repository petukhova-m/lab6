package zkanonymizer;

import akka.NotUsed;


import akka.actor.Props;
import akka.http.javadsl.ConnectHttp;

import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.marshalling.Marshaller;

import akka.http.javadsl.model.HttpRequest;

import akka.http.javadsl.model.StatusCode;
import akka.http.javadsl.model.Uri;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;
import akka.http.scaladsl.model.StatusCodes;



import akka.stream.javadsl.Flow;
import org.apache.zookeeper.*;
import scala.concurrent.Future;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import java.util.concurrent.ExecutionException;


import static akka.pattern.PatternsCS.pipe;
import static akka.actor.TypedActor.context;

public class ServerNode extends AllDirectives {

    private static Integer port;
    private static ActorSystem system;

    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {

        system = ActorSystem.create("routes");

        config = system.actorOf(Props.create(ConfigStorageActor.class));
        watcher = new ZkWatcher(config);
        ZooKeeper zoo = new ZooKeeper("127.0.0.1:2181", 3000, watcher);


                port.toString().getBytes(),


        );



        final Flow<HttpRequest, HttpResponse, NotUsed> routeFlow;
        routeFlow = instance.createRoute(system).flow(system, materializer);
        final CompletionStage<ServerBinding> binding = http.bindAndHandle(
                routeFlow,

                materializer
        );



    }

    private Route createRoute(ActorSystem system) {
        return route(
                get()
        );


    private Route get() {
        return parameter("url", url ->


                        final Http http = Http.get(system);

                            return completeWithFuture(http.singleRequest(HttpRequest.create(url)));

                        return

                                        http.singleRequest(
                                                HttpRequest.create(
                                                    String.format("http://localhost:%d/?url=%s&count=%d",
                                                            Integer.parseInt(


                                                                                    config,
                                                                                    new ServerRequest(),

                                                                            )

                                                                            .join()),
                                                            url,

                                                    )
                                                )
                                        )
                                );
                    })
        );

}
