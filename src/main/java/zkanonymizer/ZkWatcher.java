package zkanonymizer;

import akka.actor.ActorRef;
import org.apache.zookeeper.KeeperException;


import org.apache.zookeeper.Watcher.Event.*;
import org.apache.zookeeper.ZooKeeper;

import java.util.ArrayList;

import java.util.List;


public class ZkWatcher implements Watcher {

    private ZooKeeper zk;
    private static final String SERVER_PATH = "/servers";



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



                }
        }


