package zkanonymizer;

import akka.NotUsed;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.ConnectHttp;




import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.http.javadsl.model.StatusCode;
import akka.http.javadsl.model.Uri;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;
import akka.http.scaladsl.model.StatusCodes;


import akka.stream.ActorMaterializer;




import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import java.util.concurrent.ExecutionException;


import static akka.pattern.PatternsCS.pipe;
import static akka.actor.TypedActor.context;

public class ServerNode extends AllDirectives {

    private static Integer port;

    private static ZkWatcher watcher;


        system = ActorSystem.create("routes");
        ///url = args[0];system = ActorSystem.create("routes");

        watcher = new ZkWatcher(config);
        ZooKeeper zoo = new ZooKeeper("127.0.0.1:2181", 3000, watcher);
            watcher.setZk(zoo);

                port.toString().getBytes(),

                CreateMode.EPHEMERAL_SEQUENTIAL


        final ActorMaterializer materializer = ActorMaterializer.create(system);
        ServerNode instance = new ServerNode();
        final Flow<HttpRequest, HttpResponse, NotUsed> routeFlow;
        routeFlow = instance.createRoute(system).flow(system, materializer);
        final CompletionStage<ServerBinding> binding = http.bindAndHandle(
                routeFlow,

                materializer
        );
        System.out.println(String.format("Server online at http://localhost:%d/\nPress RETURN to stop...", port));
        System.in.read();
        binding.thenCompose(ServerBinding::unbind).thenAccept(unbound -> system.terminate());


    private Route createRoute(ActorSystem system) {
        return route(

        );
    }

    private Route get() {

                    parameter("count", count -> {

                        final Http http = Http.get(system);


                        }
                        return
                                completeWithFuture(
                                        http.singleRequest(
                                                HttpRequest.create(
                                                    String.format("http://localhost:%d/?url=%s&count=%d",
                                                            Integer.parseInt(

                                                                            .ask(
                                                                                    config,


                                                                            )
                                                                            .toCompletableFuture()
                                                                            .join()),
                                                            url,
                                                            counter - 1
                                                    )
                                                )
                                        )
                                );
                    })
        );


