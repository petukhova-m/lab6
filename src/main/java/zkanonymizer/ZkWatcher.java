package zkanonymizer;

import akka.actor.ActorRef;
import org.apache.zookeeper.KeeperException;

import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.*;
import org.apache.zookeeper.ZooKeeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ZkWatcher implements Watcher {
    private final ActorRef config;
    private ZooKeeper zk;
    private static final String SERVER_PATH = "/servers";


        this.config = config;
        this.zk = zk;
    }

    public ZkWatcher(ActorRef config) {
        this.config = config;
    }

    public void setZk(ZooKeeper zk) {
        this.zk = zk;
    }

    @Override
    public void process(WatchedEvent event) {
        if (event == null) {



        EventType eventType = event.getType();
        String path = event.getPath();
        if (KeeperState.SyncConnected == keeperState) {
                try {

                    List<String> list = zk.getChildren(SERVER_PATH, this);
                    ArrayList<String> serverData = new ArrayList<>();
                    for (String name : list) {
                        serverData.add(new String(zk.getData(SERVER_PATH + '/' + name, this, null)));
                    }

                } catch (KeeperException | InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}
