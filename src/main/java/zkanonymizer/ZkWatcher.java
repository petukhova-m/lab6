package zkanonymizer;

import akka.actor.ActorRef;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.*;
import org.apache.zookeeper.ZooKeeper;

import java.util.ArrayList;




public class ZkWatcher implements Watcher {

    private ZooKeeper zk;
    private static final String SERVER_PATH = "/servers";

    public ZkWatcher(ActorRef config, ZooKeeper zk) {

        this.zk = zk;


    public ZkWatcher(ActorRef config) {
        this.config = config;
    }


        this.zk = zk;
    }

    @Override


            return;
        }

        EventType eventType = event.getType();





                    ArrayList<String> serverData = new ArrayList<>();


                    }


                    e.printStackTrace();
                }
        }


